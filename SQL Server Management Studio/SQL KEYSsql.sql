CREATE TABLE PETINFOR (
 PETID                 int NOT NULL,
 PETNAME               VARCHAR(14),
 PETTYPE               VARCHAR(13),
 PETAGE                 int NOT NULL,
PETOWNER		VARCHAR(14),
CONSTRAINT PETINFOR_PRIMARY_KEY PRIMARY KEY (PETID));

INSERT INTO PETINFOR VALUES (1,'DOG','MALE',13,'BOOSTER');
INSERT INTO PETINFOR VALUES (2,'RABBIT','MALE',16,'VIPER');
INSERT INTO PETINFOR VALUES (3,'CAT','FEMALE',17,'DEMON');
INSERT INTO PETINFOR VALUES (4,'SANKE','MALE',31,'DEVIL');
INSERT INTO PETINFOR VALUES (5,'RAT','MALE',18,'SPYDER');
INSERT INTO PETINFOR VALUES (6,'PARROT','FEMALE',25,'TRIGGER');

SELECT *FROM PETINFOR;
