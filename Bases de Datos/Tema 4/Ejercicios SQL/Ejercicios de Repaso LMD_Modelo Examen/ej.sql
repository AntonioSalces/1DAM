USE ejercicios_LMD

/*EJERCICIO 1
Obtener para cada película el título, el director y el nombre de los personajes (no protagonista)
que participan en la misma. Si una película aún no tiene personajes que participan
almacenados, el nombre de la película debe aparecer igualmente. Utiliza alias para el nombre de
los personajes y en el resultado que salga el valor NULL, debes poner "Aún no se han añadido
personajes.*/
SELECT pel.titulo, pel.director, IIF(per.nomper IS NULL, 'Aún no se han añadido personajes', per.nomper) AS 'NombrePersonaje'
FROM pelicula pel
LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
LEFT JOIN personaje per ON p.CodPer = per.CodPer
WHERE per.CodPer IS NULL OR per.CodPer <> pel.CodPerProtagonista

/*EJERCICIO 2
Obtener el nombre de cada personaje y en cuántas películas ha participado, pero solo deben
salir los personajes que hayan participado en más de dos películas. Utiliza alias para las
columnas. Ordena por nombre de personaje descendentemente.*/
SELECT per.nomper AS 'Nombre Personaje', COUNT(p.codpel) 'Numero Participaciones'
FROM personaje per JOIN participa_pel p ON per.CodPer = p.CodPer 
GROUP BY per.NomPer
HAVING COUNT(p.codpel) > 2
ORDER BY per.NomPer DESC

/*EJERCICIO 3
Obtener el nombre y el apellido del actor más joven almacenado en la base de datos a día de
hoy, junto con el nombre del personaje que interpreta, así como la edad que tiene el actor.*/
SELECT a.nomact, a.apeact, p.nomper
FROM actor a JOIN personaje p ON a.CodAct = p.CodAct
WHERE a.Edad IN (SELECT MAX(edad)
				 FROM actor)

/*EJERCICIO 4
Utilizando la sentencia adecuada del LMD de SQL, modifica la película que contiene la palabra
"Bosque" (solo conoces esta palabra del título de la película), para que el año de lanzamiento
sea igual al año de lanzamiento de la película más antigua almacenada en la base de datos. La
sentencia debe estar dentro de una transacción y cuando hayas comprobado que has realizado
el ejercicio correctamente, debes deshacerla.*/
BEGIN TRANSACTION

UPDATE pelicula
SET Lanzamiento = (SELECT MIN(Lanzamiento)
				   FROM pelicula)
WHERE Titulo LIKE '%Bosque%'

ROLLBACK TRANSACTION

/*EJERCICIO 5
Borra las películas en las que aún no existe ningún personaje que participe. No tienes más
información que la que se te indica en el enunciado. La sentencia debe estar dentro de una
transacción y cuando hayas comprobado que has realizado el ejercicio correctamente, debes
deshacerla. Realizar el ejercicio de tres formas diferentes: utilizando un predicado EXISTS, un
predicado cuantificado y un predicado IN.*/
BEGIN TRANSACTION

DELETE FROM pelicula
WHERE NOT EXISTS (SELECT 1
				  FROM participa_pel p
				  WHERE p.CodPel = pelicula.CodPel);

ROLLBACK TRANSACTION

BEGIN TRANSACTION

DELETE FROM pelicula
WHERE CodPel NOT IN (SELECT CodPel
					 FROM participa_pel);

ROLLBACK TRANSACTION

BEGIN TRANSACTION

DELETE FROM pelicula
WHERE CodPel <> ALL (SELECT CodPel
					 FROM participa_pel);

ROLLBACK TRANSACTION

/*EJERCICIO 6
Para todos los actores mayores de edad a día de hoy, obtener el nombre y el apellido, la fecha de
nacimiento en formato español, la correspondiente edad a día de hoy, junto con el nombre del
personaje que interpreta. Utiliza alias para las columnas. Ordena por nombre de personaje
descendentemente.*/
SELECT a.NomAct AS 'Nombre', 
	   a.ApeAct AS 'Apellidos', 
	   FORMAT(a.Edad, 'd') AS 'FechaNacimiento', 
	   DATEDIFF(DAY, a.Edad, GETDATE()) / 365 AS 'EdadActual',
	   p.NomPer AS 'NombrePersonaje'
FROM actor a JOIN personaje p ON a.CodAct = p.CodAct
WHERE DATEDIFF(DAY, a.Edad, GETDATE()) / 365 >= 18
ORDER BY p.NomPer DESC;

/*EJERCICIO 7
Obtener el nombre y el apellido de cada actor almacenado en la base de datos, junto con el
nombre del personaje que interpreta y el título de las películas de las que es protagonista, si no
es protagonista aún de ninguna película, en lugar de salir el valor NULL, debe salir el mensaje
"No es protagonista”. Utiliza alias para el título de la película que protagonizan.*/
SELECT a.NomAct,
	   a.ApeAct,
	   p.NomPer,
	   ISNULL(pel.Titulo, 'No es protagonista')
FROM actor a JOIN personaje p ON a.CodAct = p.CodAct
			 LEFT JOIN pelicula pel ON pel.CodPerProtagonista = p.CodPer

/*EJERCICIO 8
Por cada película mostrar el título y la edad media de los actores que interpretan los personajes
que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
salir con uno o dos decimales. Ordenar ascendentemente por nombre de película. Utiliza alias
para la columna edad media.*/
SELECT pel.Titulo AS 'TituloPelicula',
	   ROUND(AVG(CONVERT(FLOAT, DATEDIFF(DAY, a.Edad, GETDATE())/365)),2,1) AS 'EdadMedia'
FROM pelicula pel JOIN participa_pel pa ON pel.CodPel = pa.CodPel
				  JOIN personaje p ON pa.CodPer = p.CodPer
				  JOIN actor a ON p.CodAct = a.CodAct
GROUP BY pel.Titulo
ORDER BY pel.Titulo

/*EJERCICIO 9
Obtener con una sola sentencia el título de todas las películas, el año de lanzamiento y nombre
del personaje protagonista, para las películas con un año de lanzamiento anterior a 2020. Y para
las películas de 2020 o posteriores, obtener el título de la película, el año de lanzamiento y el
nombre del director. Ordenar ascendentemente por año de lanzamiento. Utiliza como alias de
columna para el nombre del personaje protagonista o del director el texto: 'Personaje o Director'.*/
SELECT pel.Titulo, pel.Lanzamiento, p.NomPer AS 'Personaje o Director'
FROM pelicula pel JOIN personaje p ON p.CodPer = pel.CodPerProtagonista
WHERE pel.Lanzamiento < 2020
UNION
SELECT pel.Titulo, pel.Lanzamiento, pel.Director AS 'Personaje o Director'
FROM pelicula pel
WHERE pel.Lanzamiento >= 2020
ORDER BY pel.Lanzamiento ASC


/*EJERCICIO 10
Utilizando la sentencia adecuada del LMD de SQL, borra los personajes que cumplen las
siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna película y
su nombre empiece por la letra E. La sentencia debe estar dentro de una transacción y cuando
hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/
BEGIN TRANSACTION

DELETE FROM personaje
WHERE (CodPer NOT IN (SELECT CodPerProtagonista FROM pelicula)
	   AND CodPer NOT IN (SELECT CodPer FROM participa_pel)
	   AND NomPer LIKE 'E%')

ROLLBACK TRANSACTION

/*EJERCICIO 11
Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
Isabel Sánchez. Precisamente, Isabel Sánchez nació el mismo día que Javier Díaz. Utilizando la
sentencia adecuada del LMD de SQL, modifica la fecha de nacimiento de Isabel Sánchez para
que sea la misma que la de Javier Díaz. Solo conoces los nombres de los actores. La sentencia
debe estar dentro de una transacción y cuando hayas comprobado que has realizado el
ejercicio correctamente, debes deshacerla.*/
BEGIN TRANSACTION

UPDATE actor
SET Edad = (SELECT Edad
			FROM actor
			WHERE NomAct = 'Javier' AND ApeAct = 'Díaz')
WHERE NomAct = 'Isabel' AND ApeAct = 'Sánchez'

ROLLBACK TRANSACTION

/*EJERCICIO 12
Obtener el título de cada película y la cantidad total de actores que han participado en 
ella (incluyendo al protagonista y a los personajes secundarios). Si una película no tiene 
actores asociados, debe aparecer el valor 0 en la columna de cantidad. Utiliza alias para 
las columnas y ordena por el título de la película.*/
SELECT pel.Titulo, ISNULL(COUNT(p.CodPel), 0)
FROM pelicula pel LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
GROUP BY pel.Titulo

/*EJERCICIO 13
Obtener el nombre completo (nombre y apellido) del actor y el título de la película en 
la que su personaje es protagonista, pero solo para aquellas películas estrenadas después 
del año 2020. Además, mostrar la cantidad de años transcurridos desde el lanzamiento de 
la película hasta el día de hoy, utilizando el alias AniosTranscurridos. Ordena los 
resultados de forma descendente según los años transcurridos.*/
SELECT a.NomAct + ' ' + a.ApeAct AS 'Actor',
	  pel.Titulo,
	  DATEDIFF(YEAR, CONCAT(pel.Lanzamiento, '-01-01'), GETDATE()) AS AniosTranscurridos
FROM actor a JOIN personaje per ON a.CodAct = per.CodAct
			 JOIN pelicula pel ON per.CodPer = pel.CodPerProtagonista
WHERE pel.Lanzamiento > 2020
ORDER BY AniosTranscurridos DESC

/*EJERCICIO 14
Obtener el título de cada película y el número de personajes que participan en ella 
(excluyendo al protagonista). Si una película aún no tiene personajes almacenados en 
participa_pel, debe aparecer igualmente con el número 0.*/
SELECT pel.Titulo, COUNT(p.CodPel)
FROM pelicula pel LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
GROUP BY pel.Titulo

/*EJERCICIO 15
Obtener el nombre de los personajes que han participado en exactamente 2 películas.*/
SELECT per.NomPer
FROM personaje per JOIN participa_pel p ON per.CodPer = p.CodPer
GROUP BY per.NomPer
HAVING COUNT(p.CodPer) = 2;

/*EJERCICIO 16
Obtener el nombre y apellido del actor más viejo en la base de datos junto con la 
edad que tiene actualmente.*/
SELECT a.NomAct, a.ApeAct, DATEDIFF(DAY, a.Edad, GETDATE()) / 365
FROM actor a
WHERE a.Edad IN (SELECT MIN(Edad)
				 FROM actor)

/*EJERCICIO 17
Modificar el director de la película más reciente almacenada en la base de datos 
y luego deshacer la transacción.*/
BEGIN TRANSACTION

UPDATE pelicula
SET DIRECTOR = 'TU SABRAS'
WHERE Lanzamiento = ANY (SELECT MAX(Lanzamiento)
						 FROM pelicula)

select * from pelicula

ROLLBACK TRANSACTION

/*EJERCICIO 18
Eliminar todos los personajes que no sean protagonistas, que no participen en ninguna 
película y cuyo nombre termine en "a". La operación debe estar dentro de una transacción 
y deshacerse al final.*/
BEGIN TRANSACTION

DELETE FROM personaje
WHERE CodPer NOT IN (SELECT CodPerProtagonista FROM pelicula)
	AND CodPer NOT IN (Select CodPer FROM participa_pel)
	AND NomPer LIKE '%a'

ROLLBACK TRANSACTION

/*EJERCICIO 19
Obtener el nombre y apellido de los actores mayores de edad junto con la edad actual, 
ordenando por edad de manera descendente.*/
SELECT act.NomAct + ' ' + act.ApeAct AS 'NombreCompleto',
	   DATEDIFF(DAY, act.Edad, GETDATE()) / 365
FROM actor act
WHERE DATEDIFF(DAY, act.Edad, GETDATE()) / 365 > 18
ORDER BY act.Edad DESC

/*EJERCICIO 20
Para cada película, mostrar el título y la cantidad de personajes únicos que han 
participado en ella. Ordenar por cantidad de personajes de mayor a menor.*/
SELECT pel.Titulo, COUNT(p.CodPer)
FROM pelicula pel LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
GROUP BY pel.Titulo
ORDER BY pel.Titulo

/*EJERCICIO 21
Obtener todas las películas lanzadas antes del 2015 mostrando su título, 
año de lanzamiento y el nombre del director. Para películas de 2015 en adelante, 
mostrar el título, año de lanzamiento y el nombre del protagonista. 
Ordenar ascendentemente por año de lanzamiento.*/
SELECT pel.Titulo, pel.Lanzamiento, pel.Director
FROM pelicula pel
WHERE pel.Lanzamiento < 2015
UNION
SELECT pel.Titulo, pel.Lanzamiento, per.NomPer
FROM pelicula pel JOIN personaje per ON pel.CodPerProtagonista = per.CodPer
WHERE pel.Lanzamiento >= 2015
ORDER BY pel.Lanzamiento ASC


select * from pelicula
