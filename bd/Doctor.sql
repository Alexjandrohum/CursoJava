ALTER SESSION SET "_ORACLE_SCRIPT" = true;

CREATE USER banco IDENTIFIED BY banco;

GRANT connect, resource, dba TO banco;

GRANT
    CREATE SESSION
TO banco WITH ADMIN OPTION;

GRANT
    UNLIMITED TABLESPACE
TO banco;

CREATE TABLE doctor (
    id_doctor     NUMBER(10),
    nombre        VARCHAR(100),
    apellidos     VARCHAR(250),
    direccion     VARCHAR(250),
    telefono      VARCHAR(250),
    rfc           VARCHAR(50),
    especialidad  VARCHAR(100),
    sexo          VARCHAR(50),
    correo        VARCHAR(100),
    contra        VARCHAR(50),
    CONSTRAINT doctor_pk PRIMARY KEY ( id_doctor )
);

CREATE SEQUENCE seq_doc START WITH 1 INCREMENT BY 1 NOMAXVALUE;

INSERT INTO doctor (
    id_doctor,
    nombre,
    apellidos,
    direccion,
    telefono,
    rfc,
    especialidad,
    sexo,
    correo,
    contra
) VALUES (
    seq_doc.NEXTVAL,
    'Alejandro',
    'Herrera Mendoza',
    'Privada 16 de septiembre',
    '24937474',
    'HEMAHDHF76',
    'Java',
    'Hombre',
    'alex',
    'pass'
);

select id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra FROM doctor;

CREATE TABLE itinerario (
    id_itinerario  NUMBER,
    no_semana      NUMBER(10),
    iniciol        NUMBER(10),
    terminol       NUMBER(10),
    dialunes       VARCHAR(50),
    iniciom        NUMBER(10),
    terminom       NUMBER(10),
    diamartes      VARCHAR(50),
    iniciomie      NUMBER(10),
    terminomie     NUMBER(10),
    diamiercoles   VARCHAR(50),
    inicioj        NUMBER(10),
    terminoj       NUMBER(10),
    diajueves      VARCHAR(50),
    iniciov        NUMBER(10),
    terminov       NUMBER(10),
    diaviernes     VARCHAR(50),
    id_doctor      NUMBER(10),
    CONSTRAINT itinerario_pk PRIMARY KEY ( id_itinerario ),
    CONSTRAINT itinerario_doctor_fk FOREIGN KEY ( id_doctor )
        REFERENCES doctor ( id_doctor )
);

SELECT * FROM itinerario;

CREATE SEQUENCE seq_iti START WITH 1 INCREMENT BY 1 NOMAXVALUE;


CREATE TABLE Person(
nombre VARCHAR(100) PRIMARY KEY,
edad NUMBER,
direccion VARCHAR(200)
);

SELECT nombre, edad, direccion FROM person;

INSERT INTO Person(nombre, edad, direccion) VALUES('Alejandro',23,'privada');
INSERT INTO Person(nombre, edad, direccion) VALUES('Marco',25,'av 4 norte');
INSERT INTO Person(nombre, edad, direccion) VALUES('Alexander',24,'av 5 sur');


SELECT nombre, apellidos, telefono from doctor where id_doctor = 21;


SELECT id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra from doctor where nombre like '%l%';
SELECT id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra from doctor where nombre like '%l%';

CREATE PROCEDURE sp_getusuariodic20(d_id IN NUMBER, d_nombre OUT VARCHAR, d_apellido OUT VARCHAR, d_telefono OUT VARCHAR)
IS
BEGIN
    SELECT nombre, apellidos, telefono
    into d_nombre, d_apellido, d_telefono 
    FROM doctor 
    where id_doctor = d_id;
END;

DECLARE
id_doctor NUMBER(10);
nombre VARCHAR(80);
apellidos VARCHAR(100);
telefono VARCHAR(10);
begin
id_doctor := 21;
DBMS_OUTPUT.PUT_LINE(id_doctor);
sp_getusuariodic20(id_doctor,nombre,apellidos, telefono);
DBMS_OUTPUT.PUT_LINE(nombre);
DBMS_OUTPUT.PUT_LINE(apellidos);
DBMS_OUTPUT.PUT_LINE(telefono);
end;


