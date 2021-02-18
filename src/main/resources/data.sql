CREATE TABLE bil (

        regNummer varchar(7),
        merke VARCHAR(15),
        farge VARCHAR (15),
        modell VARCHAR (15),
        ledig BOOL,
        utleiegruppe CHAR (1),
        kilometerstand int,

        PRIMARY KEY (regNummer),
        FOREIGN KEY (nummer) REFERENCES Utleiekontor
);

CREATE TABLE utleiekontor (

        nummer INTEGER (15),
        postnummer INTEGER (15),
        gateadresse VARCHAR (15),
        postnummer VARCHAR (15),
        poststed VARCHAR (15),
        tlf INTEGER (9)
        PRIMARY KEY (nummer)
);


CREATE TABLE Kunde (

        tlf CHAR (9),
        fornavn VARCHAR (15),
        etternavn VARCHAR (15),
        kredittkort INTEGER (16),
        PRIMARY KEY (tlf)
);