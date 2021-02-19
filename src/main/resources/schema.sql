DROP SCHEMA IF EXISTS bilutleie;
CREATE SCHEMA bilutleie;
DROP TABLE IF EXISTS bil;
DROP TABLE IF EXISTS Kunde;
DROP Table IF EXISTS kunde;
DROP TABLE IF EXISTS utleiekontor;
CREATE TABLE utleiekontor (
        nummer INTEGER,
        gateadresse VARCHAR (15),
        postnummer INTEGER,
        poststed VARCHAR (15),
        tlf int,
        PRIMARY KEY (nummer)
);
CREATE TABLE bil (
        regNummer VARCHAR(7),
        merke VARCHAR(15),
        modell VARCHAR (15),
        farge VARCHAR (15),
        ledig BOOLEAN,
        utleiegruppe CHAR (1),
        kilometerstand INTEGER,
        utleiekontor INTEGER,
        PRIMARY KEY (regNummer),
        FOREIGN KEY (utleiekontor) REFERENCES utleiekontor(nummer)
);
CREATE TABLE kunde (
        tlf CHAR (9),
        fornavn VARCHAR (15),
        etternavn VARCHAR (15),
        kredittkort int,
        PRIMARY KEY (tlf)
);