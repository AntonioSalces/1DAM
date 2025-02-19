CREATE DATABASE FACTURACION;
GO
USE FACTURACION;

CREATE TABLE cliente 
	(CodCli INT PRIMARY KEY, 
	NomCli VARCHAR(45), 
	ApeCli VARCHAR(45), 
	DNICli CHAR(9) UNIQUE CHECK (DNICli LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][A-Z]'),
	Sexo VARCHAR(20) CHECK (Sexo IN ('Masculino', 'Femenino', 'No especificado')),
	Ciudad VARCHAR(20)
);

CREATE TABLE articulo 
	(CodArt INT PRIMARY KEY IDENTITY (1, 1),
	NomArt VARCHAR(30),
	Stock INT CHECK (Stock >= 0)
);

CREATE TABLE factura
	(NumFac INT PRIMARY KEY IDENTITY (1, 1),
	FechFac DATE DEFAULT (GETDATE()),
	CodCli INT FOREIGN KEY REFERENCES cliente(CodCli)
							ON DELETE SET NULL
							ON UPDATE SET NULL
);

CREATE TABLE def_factura
	(NumFac INT,
	CodArt INT,
	Cantidad INT,
	PRIMARY KEY (NumFac, CodArt),
	FOREIGN KEY (NumFac) REFERENCES factura(NumFac),
	FOREIGN KEY (CodArt) REFERENCES articulo(CodArt)
);

INSERT INTO cliente(CodCli, NomCli, ApeCli, DNICli, Sexo, Ciudad)
VALUES(3, 'Javier', 'Ballesteros', '12245679B', 'Masculino','Córdoba');

--Comprobar CHECK DNICli
INSERT INTO cliente(CodCli, NomCli, ApeCli, DNICli, Sexo, Ciudad)
VALUES(2, 'Antonio', 'Salces', '123456789B', 'Femenino','Córdoba');

--Comprobar CHECK Sexo
INSERT INTO cliente(CodCli, NomCli, ApeCli, DNICli, Sexo, Ciudad)
VALUES(2, 'Antonio', 'Salces', '12345678B', 'F','Córdoba');

INSERT INTO factura(CodCli)
VALUES(1);

SELECT * FROM factura

INSERT INTO factura(CodCli)
VALUES(3);


--Crear vista de una única tabla
CREATE VIEW primerasFacturas
AS (SELECT * FROM factura WHERE NumFac < 9);

SELECT * FROM primerasFacturas;

--Crear vista de dos tablas unidas
CREATE VIEW facturasClienteTres
AS (SELECT c.NomCli, c.ApeCli, c.Ciudad, f.NumFac, f.FechFac FROM cliente c 
	JOIN factura f ON f.CodCli = c.CodCli
	WHERE c.CodCli = 3);

SELECT * FROM facturasClienteTres;

--Modificar datos de primerasFacturas
SELECT * FROM primerasFacturas;

UPDATE primerasFacturas
SET FechFac = GETDATE()
WHERE NumFac = 3;

--Intertar modificar un dato que no se puede ver en primerasFacturas. No se puede hacer
UPDATE primerasFacturas
SET FechFac = GETDATE()
WHERE NumFac = 9;

--Modificar datos de facturasClienteTres. Se puede hacer
SELECT * FROM facturasClienteTres;

UPDATE facturasClienteTres
SET NomCli = 'Antonio'
WHERE NomCli = 'Javier';

--Aqui podemos ver como ha cambiado el nombre de "Javier" a "Antonio"
SELECT * FROM cliente;