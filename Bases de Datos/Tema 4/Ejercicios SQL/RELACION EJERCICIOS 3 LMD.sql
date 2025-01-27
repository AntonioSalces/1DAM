﻿/*Consultas con JOIN, predicados compuestos, subselects y predicados: IN,
ANY, ALL, BETWEEN, LIKE y EXISTS.*/

/*Relación de Ejercicios 3*/

USE EMPRESA;

/*1. Obtener por orden alfabético los nombres de los empleados cuyos salarios superen la mitad del
salario del empleado 180.*/
SELECT NOMEM
FROM temple
WHERE salar > (SELECT salar
			  FROM temple
			  WHERE NUMEM = 180)/2
ORDER BY 1 ASC

/*2. Obtener por orden alfabético los nombres de los empleados cuyos salarios superen dos veces al
mínimo salario de los empleados del departamento 121.*/
SELECT NOMEM
FROM temple 
WHERE salar > (SELECT MIN(salar)
			   FROM temple
			   WHERE NUMDE = 121) * 2
ORDER BY 1 ASC;

/*3. Obtener por orden alfabético los nombres y los salarios de los empleados cuyo salario es inferior
a tres veces la comisión más baja existente distinta de NULL.*/
SELECT *
FROM temple
WHERE salar < (SELECT MIN(COMIS)
			   FROM temple
			   WHERE COMIS <> null) / 3;

/*4. Obtener, utilizando el predicado BETWEEN, por orden alfabético los números (identificador
único), los nombres y los salarios de los empleados con hijos cuyo salario dividido por su número
de hijos cumpla una, o ambas, de las dos condiciones siguientes:
• Que sea inferior a 1200 euros.
• Que sea superior al doble de su comisión.*/


/*5. Obtener por orden alfabético los nombres de los empleados cuyo primer apellido es Mora o
empieza por Mora.*/


/*6. Obtener por orden alfabético los nombres de los empleados cuyo primer apellido termina en EZ y
su nombre de pila termina en O y tiene al menos tres letras.*/


/*7. Obtener, utilizando el predicado IN, por orden alfabético los nombres de los empleados del
departamento 111 cuyo salario es igual a alguno de los salarios del departamento 112.
¿Cómo lo obtendrías con el predicado ANY?*/


/*8. A. Obtener por orden alfabético los nombres y comisiones de los empleados del
departamento 110 si hay en él algún empleado que tenga comisión.*/


/*9. Obtener por orden alfabético los nombres de los departamentos que tienen algún empleado
sin comisión. Hacer el ejercicio de cuatro formas diferentes:
❑ Con predicado EXISTS.
❑ Con predicado ANY
❑ Con predicado IN
❑ Usando JOIN.*/


/*10. Para los departamentos cuyo nombre empieza por las letras O o P, mostrar el nombre del
departamento y el nombre del departamento del que depende.*/


/*11. Para los departamentos del centro 20 obtener el nombre del departamento y el nombre del
director.*/


/*12. Obtener el nombre de los departamentos que no tienen empleados con menos de dos hijos.
Realiza la consulta primero con un predicado ALL y después con un predicado EXISTS.*/
