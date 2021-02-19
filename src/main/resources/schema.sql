DROP SCHEMA IF EXISTS bilutleie;
CREATE SCHEMA bilutleie;

DROP TABLE IF EXISTS bil;
DROP TABLE IF EXISTS Kunde;
DROP Table IF EXISTS kunde;
DROP TABLE IF EXISTS utleiekontor;

CREATE TABLE utleiekontor (
        nummer integer,
        postnummer integer,
        gateadresse VARCHAR (15),
        poststed VARCHAR (15),
        tlf int,
        PRIMARY KEY (nummer)
);
CREATE TABLE bil (
        regNummer varchar(7),
        merke VARCHAR(15),
        modell VARCHAR (15),
        farge VARCHAR (15),
        ledig boolean,
        utleiegruppe CHAR (1),
        kilometerstand integer,
        utleiekontor integer,
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