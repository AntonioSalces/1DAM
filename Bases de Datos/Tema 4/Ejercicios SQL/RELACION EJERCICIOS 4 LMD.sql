/*Consultas con los predicado IN y ANY, cl�usulas GROUP BY y HAVING, producto
cartesiano, JOIN, RIGTH JOIN, LEFT JOIN y FULL JOIN, funciones escalares y de
agregado.*/

USE EMPRESA

/*1. Para cada extensi�n telef�nica, hallar cuantos empleados la usan y salario medio de
estos.*/
SELECT *
FROM temple;

SELECT EXTEL, COUNT(*) AS 'NUMERO PERSONAS POR EXTENSION', AVG(SALAR) AS 'SALARIO MEDIO'
FROM temple
GROUP BY EXTEL;


/*2. Agrupando por departamento y n�mero de hijos, hallar cuantos empleados hay en cada
grupo.*/
SELECT *
FROM temple
ORDER BY NUMDE;

SELECT NUMDE, NUMHI, COUNT(*) AS 'NUMERO EMPLEADOS POR DEPARTAMENTO CON MISMO NUMERO DE HIJOS'
FROM temple
GROUP BY NUMDE, NUMHI

/*3. Hallar por departamentos la edad en a�os cumplidos del empleado m�s mayor, as�
como la edad media del mismo (el empleado debe tener comisi�n). Ordenar el
resultado por edades.*/


/*4. Para los departamentos cuyo salario medio supera al de la empresa, hallar cu�ntas
extensiones telef�nicas tienen. Se debe mostrar el n�mero de departamento (numde) y
el n�mero de extensiones telef�nicas distintas que tiene cada uno de ellos.*/


/*5. Hallar el m�ximo valor de la suma de los salarios de los departamentos. Queremos
obtener n�mero de departamento (numde) y la suma de sus salarios, pero del
departamento cuya suma de salarios es la mayor de todas.*/
SELECT NUMDE, SUM(SALAR) AS TOTAL_SALARIOS
FROM temple
GROUP BY NUMDE
HAVING SUM(SALAR) = (SELECT MAX(TOTAL)
					 FROM (SELECT NUMDE, SUM(SALAR) AS TOTAL
						   FROM temple
						   GROUP BY NUMDE) AS SUBQUERY);

/*6. Para cada departamento con presupuesto inferior a 10000 euros obtener el nombre, el
nombre del centro donde est� ubicado y el m�ximo salario de sus empleados, si �ste
excede de 1500 euros. Clasificar alfab�ticamente por nombre de departamento. Hacer
el ejercicio de dos maneras: con producto cartesiano y con JOIN.*/
SELECT NOMDE, NOMCE, SALAR
FROM tdepto D JOIN tcentr C ON (D.NUMCE = C.NUMCE)
JOIN temple E ON (D.NUMDE = E.NUMDE)
WHERE D.PRESU < 10000
GROUP BY D.NOMDE, C.NOMCE, E.SALAR
HAVING MAX(E.SALAR) > 1500
ORDER BY D.NOMDE

/*7. Hallar por orden alfab�tico los nombres de los departamentos que dependen de los que
tienen un presupuesto inferior a 10000 euros. Mostrar el nombre del departamento y el
nombre del departamento del que dependen. Realizar la consulta de cuatro formas
distintas: con predicado IN, con predicado ANY, con producto cartesiano y con JOIN.


8. Obtener por orden alfab�tico los nombres de los departamentos cuyo presupuesto es
inferior al 10 % de la suma de los salarios anuales de sus empleados (sin tener en
cuenta la comisi�n y son 14 pagas). Hacer el ejercicio con predicado b�sico y con
agrupamiento.*/


/*9. Ejecutar las siguientes sentencias:
 --A�adir los siguientes centros:
INSERT INTO tcentr (numce,nomce,se�as)
VALUES (30,'PRODUCCI�N','C. DEL ARTE, 13, MADRID'),
(40,'INNOVACI�N','AVDA. ANDALUC�A, 20, M�LAGA');
--A�adir los siguientes departamentos:
INSERT INTO tdepto(numde,numce,direc,tidir,presu,depde,nomde)
VALUES (122,NULL,NULL,'F',10000,120,'MARKETING Y PUBLICIDAD'),
(123,20, NULL,'F',10000,120,'COMPRAS Y LOG�STICA');
--A�adir los siguientes empleados:
INSERT INTO temple(numem,numde,extel,fecna,fecin,salar,comis,numhi,nomem)
VALUES (381,122, 350,'12/03/2000','8/1/2025',1800,100,0,'ROMERO, M�RIAM'),
 (382,122, 350,'13/04/1998','8/1/2025',1800,100,1,'S�NCHEZ, LUC�A'),
 (383,NULL,350,'14/05/1997','8/1/2025',1800,100,1,'L�PEZ, LAURA');
--Asignar el empleado 381 como director del departamento 122.
UPDATE tdepto
SET direc =381
WHERE numde=122;
Una vez ejecutadas estas sentencias, consultar las tablas tcentr, tdepto y temple por
separado para comprobar que tenemos:
� Los centros 30 y 40 que a�n no tienen departamentos ubicados en los mismos.*
� El departamento 123 que a�n no tiene empleados.
� El empleado 383 que a�n no se le ha asignado departamento.
� El departamento 122 que a�n no se le ha asignado centro. *
� El departamento 120 (ya exist�a) y el 123 que a�n no tienen directores.
� El departamento 100 (ya exist�a) que no depende de ning�n otro.*/