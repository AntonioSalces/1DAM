USE ejercicios_LMD

/*EJERCICIO 1
Obtener para cada pel�cula el t�tulo, el director y el nombre de los personajes (no protagonista)
que participan en la misma. Si una pel�cula a�n no tiene personajes que participan
almacenados, el nombre de la pel�cula debe aparecer igualmente. Utiliza alias para el nombre de
los personajes y en el resultado que salga el valor NULL, debes poner "A�n no se han a�adido
personajes.*/
SELECT pel.titulo, pel.director, IIF(per.nomper IS NULL, 'A�n no se han a�adido personajes', per.nomper) AS 'NombrePersonaje'
FROM pelicula pel
LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
LEFT JOIN personaje per ON p.CodPer = per.CodPer
WHERE per.CodPer IS NULL OR per.CodPer <> pel.CodPerProtagonista

/*EJERCICIO 2
Obtener el nombre de cada personaje y en cu�ntas pel�culas ha participado, pero solo deben
salir los personajes que hayan participado en m�s de dos pel�culas. Utiliza alias para las
columnas. Ordena por nombre de personaje descendentemente.*/
SELECT per.nomper AS 'Nombre Personaje', COUNT(p.codpel) 'Numero Participaciones'
FROM personaje per JOIN participa_pel p ON per.CodPer = p.CodPer 
GROUP BY per.NomPer
HAVING COUNT(p.codpel) > 2
ORDER BY per.NomPer DESC

/*EJERCICIO 3
Obtener el nombre y el apellido del actor m�s joven almacenado en la base de datos a d�a de
hoy, junto con el nombre del personaje que interpreta, as� como la edad que tiene el actor.*/
SELECT a.nomact, a.apeact, p.nomper
FROM actor a JOIN personaje p ON a.CodAct = p.CodAct
WHERE a.Edad IN (SELECT MAX(edad)
				 FROM actor)

/*EJERCICIO 4
Utilizando la sentencia adecuada del LMD de SQL, modifica la pel�cula que contiene la palabra
"Bosque" (solo conoces esta palabra del t�tulo de la pel�cula), para que el a�o de lanzamiento
sea igual al a�o de lanzamiento de la pel�cula m�s antigua almacenada en la base de datos. La
sentencia debe estar dentro de una transacci�n y cuando hayas comprobado que has realizado
el ejercicio correctamente, debes deshacerla.*/
BEGIN TRANSACTION

UPDATE pelicula
SET Lanzamiento = (SELECT MIN(Lanzamiento)
				   FROM pelicula)
WHERE Titulo LIKE '%Bosque%'

ROLLBACK TRANSACTION

/*EJERCICIO 5
Borra las pel�culas en las que a�n no existe ning�n personaje que participe. No tienes m�s
informaci�n que la que se te indica en el enunciado. La sentencia debe estar dentro de una
transacci�n y cuando hayas comprobado que has realizado el ejercicio correctamente, debes
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
Para todos los actores mayores de edad a d�a de hoy, obtener el nombre y el apellido, la fecha de
nacimiento en formato espa�ol, la correspondiente edad a d�a de hoy, junto con el nombre del
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
nombre del personaje que interpreta y el t�tulo de las pel�culas de las que es protagonista, si no
es protagonista a�n de ninguna pel�cula, en lugar de salir el valor NULL, debe salir el mensaje
"No es protagonista�. Utiliza alias para el t�tulo de la pel�cula que protagonizan.*/
SELECT a.NomAct,
	   a.ApeAct,
	   p.NomPer,
	   ISNULL(pel.Titulo, 'No es protagonista')
FROM actor a JOIN personaje p ON a.CodAct = p.CodAct
			 LEFT JOIN pelicula pel ON pel.CodPerProtagonista = p.CodPer

/*EJERCICIO 8
Por cada pel�cula mostrar el t�tulo y la edad media de los actores que interpretan los personajes
que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
salir con uno o dos decimales. Ordenar ascendentemente por nombre de pel�cula. Utiliza alias
para la columna edad media.*/
SELECT pel.Titulo AS 'TituloPelicula',
	   ROUND(AVG(CONVERT(FLOAT, DATEDIFF(DAY, a.Edad, GETDATE())/365)),2,1) AS 'EdadMedia'
FROM pelicula pel JOIN participa_pel pa ON pel.CodPel = pa.CodPel
				  JOIN personaje p ON pa.CodPer = p.CodPer
				  JOIN actor a ON p.CodAct = a.CodAct
GROUP BY pel.Titulo
ORDER BY pel.Titulo

/*EJERCICIO 9
Obtener con una sola sentencia el t�tulo de todas las pel�culas, el a�o de lanzamiento y nombre
del personaje protagonista, para las pel�culas con un a�o de lanzamiento anterior a 2020. Y para
las pel�culas de 2020 o posteriores, obtener el t�tulo de la pel�cula, el a�o de lanzamiento y el
nombre del director. Ordenar ascendentemente por a�o de lanzamiento. Utiliza como alias de
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
siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna pel�cula y
su nombre empiece por la letra E. La sentencia debe estar dentro de una transacci�n y cuando
hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/
BEGIN TRANSACTION

DELETE FROM personaje
WHERE (CodPer NOT IN (SELECT CodPerProtagonista FROM pelicula)
	   AND CodPer NOT IN (SELECT CodPer FROM participa_pel)
	   AND NomPer LIKE 'E%')

ROLLBACK TRANSACTION

/*EJERCICIO 11
Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
Isabel S�nchez. Precisamente, Isabel S�nchez naci� el mismo d�a que Javier D�az. Utilizando la
sentencia adecuada del LMD de SQL, modifica la fecha de nacimiento de Isabel S�nchez para
que sea la misma que la de Javier D�az. Solo conoces los nombres de los actores. La sentencia
debe estar dentro de una transacci�n y cuando hayas comprobado que has realizado el
ejercicio correctamente, debes deshacerla.*/
BEGIN TRANSACTION

UPDATE actor
SET Edad = (SELECT Edad
			FROM actor
			WHERE NomAct = 'Javier' AND ApeAct = 'D�az')
WHERE NomAct = 'Isabel' AND ApeAct = 'S�nchez'

ROLLBACK TRANSACTION

/*EJERCICIO 12
Obtener el t�tulo de cada pel�cula y la cantidad total de actores que han participado en 
ella (incluyendo al protagonista y a los personajes secundarios). Si una pel�cula no tiene 
actores asociados, debe aparecer el valor 0 en la columna de cantidad. Utiliza alias para 
las columnas y ordena por el t�tulo de la pel�cula.*/
SELECT pel.Titulo, ISNULL(COUNT(p.CodPel), 0)
FROM pelicula pel LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
GROUP BY pel.Titulo

/*EJERCICIO 13
Obtener el nombre completo (nombre y apellido) del actor y el t�tulo de la pel�cula en 
la que su personaje es protagonista, pero solo para aquellas pel�culas estrenadas despu�s 
del a�o 2020. Adem�s, mostrar la cantidad de a�os transcurridos desde el lanzamiento de 
la pel�cula hasta el d�a de hoy, utilizando el alias AniosTranscurridos. Ordena los 
resultados de forma descendente seg�n los a�os transcurridos.*/
SELECT a.NomAct + ' ' + a.ApeAct AS 'Actor',
	  pel.Titulo,
	  DATEDIFF(YEAR, CONCAT(pel.Lanzamiento, '-01-01'), GETDATE()) AS AniosTranscurridos
FROM actor a JOIN personaje per ON a.CodAct = per.CodAct
			 JOIN pelicula pel ON per.CodPer = pel.CodPerProtagonista
WHERE pel.Lanzamiento > 2020
ORDER BY AniosTranscurridos DESC

/*EJERCICIO 14
Obtener el t�tulo de cada pel�cula y el n�mero de personajes que participan en ella 
(excluyendo al protagonista). Si una pel�cula a�n no tiene personajes almacenados en 
participa_pel, debe aparecer igualmente con el n�mero 0.*/
SELECT pel.Titulo, COUNT(p.CodPel)
FROM pelicula pel LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
GROUP BY pel.Titulo

/*EJERCICIO 15
Obtener el nombre de los personajes que han participado en exactamente 2 pel�culas.*/
SELECT per.NomPer
FROM personaje per JOIN participa_pel p ON per.CodPer = p.CodPer
GROUP BY per.NomPer
HAVING COUNT(p.CodPer) = 2;

/*EJERCICIO 16
Obtener el nombre y apellido del actor m�s viejo en la base de datos junto con la 
edad que tiene actualmente.*/
SELECT a.NomAct, a.ApeAct, DATEDIFF(DAY, a.Edad, GETDATE()) / 365
FROM actor a
WHERE a.Edad IN (SELECT MIN(Edad)
				 FROM actor)

/*EJERCICIO 17
Modificar el director de la pel�cula m�s reciente almacenada en la base de datos 
y luego deshacer la transacci�n.*/
BEGIN TRANSACTION

UPDATE pelicula
SET DIRECTOR = 'TU SABRAS'
WHERE Lanzamiento = ANY (SELECT MAX(Lanzamiento)
						 FROM pelicula)

select * from pelicula

ROLLBACK TRANSACTION

/*EJERCICIO 18
Eliminar todos los personajes que no sean protagonistas, que no participen en ninguna 
pel�cula y cuyo nombre termine en "a". La operaci�n debe estar dentro de una transacci�n 
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
Para cada pel�cula, mostrar el t�tulo y la cantidad de personajes �nicos que han 
participado en ella. Ordenar por cantidad de personajes de mayor a menor.*/
SELECT pel.Titulo, COUNT(p.CodPer)
FROM pelicula pel LEFT JOIN participa_pel p ON pel.CodPel = p.CodPel
GROUP BY pel.Titulo
ORDER BY pel.Titulo

/*EJERCICIO 21
Obtener todas las pel�culas lanzadas antes del 2015 mostrando su t�tulo, 
a�o de lanzamiento y el nombre del director. Para pel�culas de 2015 en adelante, 
mostrar el t�tulo, a�o de lanzamiento y el nombre del protagonista. 
Ordenar ascendentemente por a�o de lanzamiento.*/
SELECT pel.Titulo, pel.Lanzamiento, pel.Director
FROM pelicula pel
WHERE pel.Lanzamiento < 2015
UNION
SELECT pel.Titulo, pel.Lanzamiento, per.NomPer
FROM pelicula pel JOIN personaje per ON pel.CodPerProtagonista = per.CodPer
WHERE pel.Lanzamiento >= 2015
ORDER BY pel.Lanzamiento ASC


select * from pelicula
