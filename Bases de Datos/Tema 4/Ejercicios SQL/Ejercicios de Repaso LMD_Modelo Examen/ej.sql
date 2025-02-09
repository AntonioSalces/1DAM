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


/*EJERCICIO 7
Obtener el nombre y el apellido de cada actor almacenado en la base de datos, junto con el
nombre del personaje que interpreta y el título de las películas de las que es protagonista, si no
es protagonista aún de ninguna película, en lugar de salir el valor NULL, debe salir el mensaje
"No es protagonista”. Utiliza alias para el título de la película que protagonizan.*/


/*EJERCICIO 8
Por cada película mostrar el título y la edad media de los actores que interpretan los personajes
que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
salir con uno o dos decimales. Ordenar ascendentemente por nombre de película. Utiliza alias
para la columna edad media.*/


/*EJERCICIO 9
Obtener con una sola sentencia el título de todas las películas, el año de lanzamiento y nombre
del personaje protagonista, para las películas con un año de lanzamiento anterior a 2020. Y para
las películas de 2020 o posteriores, obtener el título de la película, el año de lanzamiento y el
nombre del director. Ordenar ascendentemente por año de lanzamiento. Utiliza como alias de
columna para el nombre del personaje protagonista o del director el texto: 'Personaje o Director'.*/


/*EJERCICIO 10
Utilizando la sentencia adecuada del LMD de SQL, borra los personajes que cumplen las
siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna película y
su nombre empiece por la letra E. La sentencia debe estar dentro de una transacción y cuando
hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/


/*EJERCICIO 11
Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
Isabel Sánchez. Precisamente, Isabel Sánchez nació el mismo día que Javier Díaz. Utilizando la
sentencia adecuada del LMD de SQL, modifica la fecha de nacimiento de Isabel Sánchez para
que sea la misma que la de Javier Díaz. Solo conoces los nombres de los actores. La sentencia
debe estar dentro de una transacción y cuando hayas comprobado que has realizado el
ejercicio correctamente, debes deshacerla.*/