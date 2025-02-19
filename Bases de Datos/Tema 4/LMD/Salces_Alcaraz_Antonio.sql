USE examen_febrero_2025_dam




--EJERCICIO 1
--Verificar codigos utilizados para no repetir PKs
SELECT * FROM hospital

--Ver como es la tabla "propio" para ver que datos a�adir
SELECT * FROM propio

--**SOLUCI�N**:
INSERT INTO hospital (CodHos, NomHos, NumCam, Tipo)
VALUES (7, 'Cl�nica Local para B�ticos', 200, 'Propio'), 
	   (8, 'Hospital ped��trico de Montalb�n de C�rdoba', 10, 'Propio');

INSERT INTO propio (CodHos, Presupuesto, TipSer)
VALUES (7, 1000000, 'Cuidado de atenci�n al B�tico'),
	   (8, 15000, 'Sanaci�n de los habitantes');




--EJERCICIO 2
--Ver estructura de la tabla "hospital"
SELECT * FROM hospital

--Ver estructura de la tabla "propio"
SELECT * FROM propio

--Verificar si me salen correctamente los hospitales a actualizar
SELECT * FROM hospital WHERE NomHos LIKE '%M�laga%' OR NomHos LIKE '%Sevilla%'

--**SOLUCI�N CON SUBCONSULTA**:
BEGIN TRANSACTION

UPDATE propio
SET Presupuesto = Presupuesto * 1.15
WHERE CodHos = ANY (SELECT CodHos FROM hospital WHERE NomHos LIKE '%M�laga%' OR NomHos LIKE '%Sevilla%')

ROLLBACK TRANSACTION

--**SOLUCI�N CON JOIN**:
BEGIN TRANSACTION

UPDATE propio 
SET Presupuesto = Presupuesto * 1.15
FROM propio JOIN hospital ON propio.CodHos = hospital.CodHos
WHERE hospital.NomHos LIKE '%M�laga%' OR NomHos LIKE '%Sevilla%'

ROLLBACK TRANSACTION




--EJERCICIO 3
--Verificar estructuras de las tablas a utilizar
SELECT * FROM hospital

SELECT * FROM trabaja

SELECT * FROM medico

--**SOLUCI�N**:
SELECT h.NomHos AS 'NombreHospital', 
	   h.NumCam AS 'NumeroCamasHospital', 
	   c.Caracteristicas as 'CaracteristicasHospital', 
	   m.NomMed AS 'NombreM�dico', 
	   FORMAT(t.Fecha, 'd') AS 'FechaInicioM�dico'
FROM hospital h JOIN concertado c ON h.CodHos = c.CodHos
				JOIN trabaja t ON h.CodHos = t.CodHos
				JOIN medico m ON t.CodMed = m.CodMed
ORDER BY FechaInicioM�dico ASC




--EJERCICIO 4
--**SOLUCI�N**:
SELECT h.CodHos AS 'C�digoHospital', 
	   h.NomHos AS 'NombreHospital', 
	   h.NumCam AS 'NumeroCamasHospital', 
	   c.Caracteristicas 'Caracter�sticas o presupuesto'
FROM hospital h JOIN concertado c ON h.CodHos = c.CodHos
UNION
SELECT h.CodHos AS 'C�digoHospital', 
	   h.NomHos AS 'NombreHospital', 
	   h.NumCam AS 'NumeroCamasHospital', 
	   CONVERT(VARCHAR, p.Presupuesto) AS 'Caracter�sticas o presupuesto'
FROM hospital h JOIN propio p ON h.CodHos = p.CodHos




--EJERCICIO 5
--Ver la estructura de la tabla "m�dico"
SELECT * FROM medico

--Ver la estructura de la trabla "trabaja" para ver que m�dicos no tiene asignado ning�n hospital
SELECT * FROM trabaja

--**SOLUCI�N**:
SELECT m.NomMed, ISNULL(h.NomHos, 'Pendiente de contratar')
FROM medico m LEFT JOIN trabaja t ON m.CodMed = t.CodMed
			  LEFT JOIN hospital h ON t.CodHos = h.CodHos




--EJERCICIO 6
--Ver la estructura de las tablas con las que trabajar�
SELECT * FROM hospital

SELECT * FROM trabaja

--**SOLUCI�N**:
SELECT DISTINCT h.CodHos, 
				h.NomHos, 
				ROUND(AVG(CONVERT(float, DATEDIFF(DAY, t.Fecha, GETDATE())) / 365), 2) AS 'PromedioDeDiasTrabajados'
FROM hospital h JOIN trabaja t ON h.CodHos = t.CodHos
GROUP BY h.CodHos, h.NomHos
HAVING COUNT(t.CodMed) > 1