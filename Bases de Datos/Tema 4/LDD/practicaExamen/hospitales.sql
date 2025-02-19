CREATE DATABASE ANTONIO;
GO
USE ANTONIO;

CREATE TABLE hospital (
	CodHos int IDENTITY(1,1) PRIMARY KEY, 
	NomHost varchar(255) NOT NULL,
	NumCam int NOT NULL,
	TipHos varchar(255) NOT NULL CHECK (TipHos IN ('Propio', 'Concertado')) DEFAULT 'Propio',
	Presupuesto float,
	TipSer varchar(255),
	Caracteristicas varchar(255)
);


CREATE TABLE medico (
	CodMed int PRIMARY KEY,
	NomMed varchar(255) NOT NULL,
	TfnMed char(9) NOT NULL CHECK (TfnMed LIKE '6________' OR TfnMed LIKE '7________' OR TfnMed LIKE '9________'),
	esJefe int NULL,
	FOREIGN KEY (esJefe) REFERENCES medico(CodMed)
						 ON DELETE NO ACTION
						 ON UPDATE NO ACTION
);

CREATE TABLE HosMed (
	CodHos int NOT NULL,
	CodMed int NOT NULL,
	FecIni date NOT NULL,
	PRIMARY KEY(CodHos, CodMed),
	FOREIGN KEY (CodHos) REFERENCES hospital(CodHos)
						 ON DELETE CASCADE
						 ON UPDATE CASCADE,
	FOREIGN KEY (CodMed) REFERENCES medico(CodMed)
						 ON DELETE NO ACTION
						 ON UPDATE CASCADE
);

DROP TABLE HOSMED

INSERT INTO hospital(NomHost, NumCam, TipHos, Presupuesto, TipSer, Caracteristicas)
VALUES ('Pies', 100, 'Concertado', 3000, 'Podología', 'Gran hospital con muchas camas'),
	   ('Montalbán', 20, 'Concertado', 500, 'Centro de salud', 'Pequeño hospital de pueblo'),
	   ('Málaga', 150, 'Propio', 4000, 'Centro de Málaga', 'Todo tipo de pacientes'
);

INSERT INTO medico(CodMed, NomMed, TfnMed)
VALUES(1, 'Antonio Salces Alcaraz', '644611004'),
	  (2, 'Javier Ballesteros', '728392039'),
	  (3, 'Alberto Maldonado', '928927389'),
	  (4, 'Guillermo Diañez', '738394034'),
	  (5, 'Eva Perales', '976543265'
);


INSERT INTO HosMed(CodHos, CodMed, FecIni)
VALUES(1, 1, 17/10/2010),
	  (1, 3, GETDATE()),
	  (1, 4, GETDATE()),
	  (2, 2, 10/01/2021),
	  (2, 5, GETDATE()
);


BEGIN TRANSACTION

UPDATE hospital
SET presupuesto = Presupuesto + 1.02
WHERE CodHos IN(SELECT CodHos
				FROM HosMed
				GROUP BY CodHos
				HAVING COUNT(*) > 1
);

ROLLBACK TRANSACTION

BEGIN TRANSACTION

DELETE FROM hospital
WHERE (Presupuesto < 5000) AND
	  CodHos NOT IN(SELECT CodHos
					FROM HosMed
);
		

ROLLBACK TRANSACTION