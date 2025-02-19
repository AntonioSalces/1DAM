USE examen_febrero_2025_dam




--EJERCICIO 1
--Verificar codigos utilizados para no repetir PKs
SELECT * FROM hospital

--Ver como es la tabla "propio" para ver que datos añadir
SELECT * FROM propio

--**SOLUCIÓN**:
INSERT INTO hospital (CodHos, NomHos, NumCam, Tipo)
VALUES (7, 'Clínica Local para Béticos', 200, 'Propio'), 
	   (8, 'Hospital pedíátrico de Montalbán de Córdoba', 10, 'Propio');

INSERT INTO propio (CodHos, Presupuesto, TipSer)
VALUES (7, 1000000, 'Cuidado de atención al Bético'),
	   (8, 15000, 'Sanación de los habitantes');




--EJERCICIO 2
--Ver estructura de la tabla "hospital"
SELECT * FROM hospital

--Ver estructura de la tabla "propio"
SELECT * FROM propio

--Verificar si me salen correctamente los hospitales a actualizar
SELECT * FROM hospital WHERE NomHos LIKE '%Málaga%' OR NomHos LIKE '%Sevilla%'

--**SOLUCIÓN CON SUBCONSULTA**:
BEGIN TRANSACTION

UPDATE propio
SET Presupuesto = Presupuesto * 1.15
WHERE CodHos = ANY (SELECT CodHos FROM hospital WHERE NomHos LIKE '%Málaga%' OR NomHos LIKE '%Sevilla%')

ROLLBACK TRANSACTION

--**SOLUCIÓN CON JOIN**:
BEGIN TRANSACTION

UPDATE propio 
SET Presupuesto = Presupuesto * 1.15
FROM propio JOIN hospital ON propio.CodHos = hospital.CodHos
WHERE hospital.NomHos LIKE '%Málaga%' OR NomHos LIKE '%Sevilla%'

ROLLBACK TRANSACTION




--EJERCICIO 3
--Verificar estructuras de las tablas a utilizar
SELECT * FROM hospital

SELECT * FROM trabaja

SELECT * FROM medico

--**SOLUCIÓN**:
SELECT h.NomHos AS 'NombreHospital', 
	   h.NumCam AS 'NumeroCamasHospital', 
	   c.Caracteristicas as 'CaracteristicasHospital', 
	   m.NomMed AS 'NombreMédico', 
	   FORMAT(t.Fecha, 'd') AS 'FechaInicioMédico'
FROM hospital h JOIN concertado c ON h.CodHos = c.CodHos
				JOIN trabaja t ON h.CodHos = t.CodHos
				JOIN medico m ON t.CodMed = m.CodMed
ORDER BY FechaInicioMédico ASC




--EJERCICIO 4
--**SOLUCIÓN**:
SELECT h.CodHos AS 'CódigoHospital', 
	   h.NomHos AS 'NombreHospital', 
	   h.NumCam AS 'NumeroCamasHospital', 
	   c.Caracteristicas 'Características o presupuesto'
FROM hospital h JOIN concertado c ON h.CodHos = c.CodHos
UNION
SELECT h.CodHos AS 'CódigoHospital', 
	   h.NomHos AS 'NombreHospital', 
	   h.NumCam AS 'NumeroCamasHospital', 
	   CONVERT(VARCHAR, p.Presupuesto) AS 'Características o presupuesto'
FROM hospital h JOIN propio p ON h.CodHos = p.CodHos




--EJERCICIO 5
--Ver la estructura de la tabla "médico"
SELECT * FROM medico

--Ver la estructura de la trabla "trabaja" para ver que médicos no tiene asignado ningún hospital
SELECT * FROM trabaja

--**SOLUCIÓN**:
SELECT m.NomMed, ISNULL(h.NomHos, 'Pendiente de contratar')
FROM medico m LEFT JOIN trabaja t ON m.CodMed = t.CodMed
			  LEFT JOIN hospital h ON t.CodHos = h.CodHos




--EJERCICIO 6
--Ver la estructura de las tablas con las que trabajaré
SELECT * FROM hospital

SELECT * FROM trabaja

--**SOLUCIÓN**:
SELECT DISTINCT h.CodHos, 
				h.NomHos, 
				ROUND(AVG(CONVERT(float, DATEDIFF(DAY, t.Fecha, GETDATE())) / 365), 2) AS 'PromedioDeDiasTrabajados'
FROM hospital h JOIN trabaja t ON h.CodHos = t.CodHos
GROUP BY h.CodHos, h.NomHos
HAVING COUNT(t.CodMed) > 1