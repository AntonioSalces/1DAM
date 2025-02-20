CREATE DATABASE EDIFICIOS
GO
USE EDIFICIOS
GO

CREATE TABLE departamento(
	CodDep INT PRIMARY KEY,
	NomDep VARCHAR(255) NOT NULL,
	NumDep INT NOT NULL
);

CREATE TABLE edificio(
	CodEdi INT IDENTITY (10, 10) PRIMARY KEY,
	NomEdi VARCHAR(255) NOT NULL,
	TipVia VARCHAR(255) NOT NULL CHECK (TipVia IN ('Calle', 'Avenida', 'Bulevar', 'Pasaje')),
	NomVia VARCHAR(255) NOT NULL,
	NumVia INT NOT NULL, 
	NumEdi INT NOT NULL,
	CPEdi INT NOT NULL,
	NumDes INT NOT NULL DEFAULT 1
);

CREATE TABLE despachos_dep_edi(
	CodDep INT NOT NULL,
	CodEdi INT NOT NULL,
	NumDes INT NOT NULL,
	PRIMARY KEY (CodDep, CodEdi),
	FOREIGN KEY (CodDep) REFERENCES departamento (CodDep)
									ON DELETE NO ACTION
									ON UPDATE CASCADE,
	FOREIGN KEY (CodEdi) REFERENCES edificio (CodEdi)
									ON DELETE NO ACTION
									ON UPDATE CASCADE,
);

INSERT INTO departamento(CodDep, NomDep, NumDep)
VALUES(1, 'Betis', 50), (2, 'Córdoba', 10), (3, 'Thiago Ferreira', 1), (4, 'Eva', 100
);

SELECT * FROM departamento;

INSERT INTO edificio(NomEdi, TipVia, NomVia, NumVia, NumEdi, CPEdi, NumDes)
VALUES('Alan Turing', 'Calle', 'Frederick Terman', 4, 10, 29010, 5), ('I.E.S. Campanillas', 'Avenida', 'José Calderón', 10, 5, 20908, 6
);

SELECT * FROM edificio;

INSERT INTO despachos_dep_edi(CodEdi, CodDep, NumDes)
VALUES (10, 1, 2), (10, 2, 3), (20, 1, 1), (20, 2, 4), (20, 3, 1
);

SELECT * FROM despachos_dep_edi;

BEGIN TRANSACTION

DELETE FROM despachos_dep_edi 
WHERE CodEdi = (SELECT CodEdi FROM edificio WHERE NomEdi = 'I.E.S. Campanillas')
AND CodDep IN (
	SELECT CodDep FROM despachos_dep_edi
	WHERE NumDes = 1
);

SELECT * FROM despachos_dep_edi

ROLLBACK TRANSACTION

BEGIN TRANSACTION

DELETE FROM departamento
WHERE CodDep = 1;

ROLLBACK TRANSACTION

UPDATE departamento
SET NumDep = 150
WHERE NomDep LIKE 'Betis';

SELECT e.NomEdi, SUM(d.NumDes) AS 'Número de despachos ocupados'
FROM edificio e JOIN despachos_dep_edi d ON e.CodEdi = d.CodEdi
GROUP BY e.NomEdi;

SELECT d.NomDep, ISNULL(e.NomEdi, 'Edificio sin asignar'), SUM(des.NumDes)
FROM departamento d LEFT JOIN despachos_dep_edi des ON des.CodDep = d.CodDep
						 JOIN edificio e ON des.CodEdi = e.CodEdi
GROUP BY d.NomDep, e.NomEdi;