DROP SCHEMA IF EXISTS bilutleie;
CREATE SCHEMA bilutleie;
DROP TABLE IF EXISTS utleie;
DROP TABLE IF EXISTS bil;
DROP Table IF EXISTS kunde;
DROP TABLE IF EXISTS utleiekontor;

CREATE TABLE utleiekontor (
        nummer INTEGER,
        gateadresse VARCHAR (32),
        postnummer INTEGER,
        poststed VARCHAR (15),
        tlf int,
        PRIMARY KEY (nummer)
);
CREATE TABLE bil (
        regnummer VARCHAR(7),
        merke VARCHAR(15),
        modell VARCHAR (32),
        farge VARCHAR (15),
        ledig BOOLEAN,
        utleiegruppe CHAR (1),
        kilometerstand INTEGER,
        utleiekontor INTEGER,
        PRIMARY KEY (regnummer),
        FOREIGN KEY (utleiekontor) REFERENCES utleiekontor(nummer)
);
CREATE TABLE kunde (
        tlf VARCHAR (15),
        fornavn VARCHAR (15),
        etternavn VARCHAR (15),
        kredittkort int,
        PRIMARY KEY (tlf)
);

INSERT INTO Utleiekontor VALUES
        ('1', 'Huttiheitaveien', '5052', 'Bergen', '19996661'),
        ('2', 'Skrullerudveien', '1189', 'Oslo', '22225555');

INSERT INTO Bil VALUES
        ('BM19551', 'BMW', 'Isetta', 'Bavarian Blue', 'true', 'A', '10000', '1'),
        ('ME19571', 'Messerschmitt', 'KR200', 'Pastellgrün', 'true', 'A', '129381', '2'),
        ('PE19621', 'Peel', 'P50', 'Capri Blue', 'true', 'A', '14533', '1'),
        ('FR19951', 'Ferrari', '456', 'Rosso Fiorano', 'true', 'B', '197000','1'),
        ('VW19641', 'Volkswagen', 'T1 Type2 Samba', 'Sea Blue', 'true', 'C', '172836', '1'),
        ('VO19731', 'Volvo', 'P1800 ES', 'Cypress Green', 'true', 'D', '4890992', '2');