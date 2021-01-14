CREATE PROCEDURE sp_getCliente(
numero IN NUMBER, 
nombre OUT VARCHAR, 
nacimiento OUT DATE, 
rfc OUT VARCHAR, 
domicilio OUT NUMBER, 
estado OUT NUMBER, 
banco OUT NUMBER, 
apellidos OUT VARCHAR, 
sexo OUT VARCHAR)
IS
BEGIN
    SELECT FCNOMBRE,FDFECHANACIMIENTO,FCRFC,FIDOMICILIO,FIESTADOCLIENTE,FIBANCO, FCAPELLIDOS, FCSEXO
    into nombre, nacimiento, rfc, domicilio, estado, banco, apellidos, sexo 
    FROM tacliente 
    where FINUMERO = numero;
END;




CREATE PROCEDURE sp_deleteCiente(
numero IN NUMBER)
IS
BEGIN
    DELETE FROM tacliente where FINUMERO = numero;
END;






CREATE PROCEDURE sp_createCliente(
nombre IN VARCHAR, 
nacimiento IN DATE, 
rfc IN VARCHAR, 
domicilio IN NUMBER, 
estado IN NUMBER, 
banco IN NUMBER, 
apellidos IN VARCHAR, 
sexo IN VARCHAR,

calle IN VARCHAR, 
colonia IN VARCHAR, 
estadodireccion IN VARCHAR, 
postal IN NUMBER, 
estadodomicilio IN NUMBER)
IS
id_temporal number;
BEGIN
    
    INSERT into tadomicilio(FINUMERO,FCCALLE,FCCOLONIA,FCESTADO,FICODIGOPOSTAL,FIESTADODOMICILIO) 
    values(SEQ_IDIRECCION.nextval, calle,colonia,estadodireccion,postal,estadodomicilio) returning FINUMERO into id_temporal;
    
    INSERT INTO tacliente(FINUMERO,FCNOMBRE,FDFECHANACIMIENTO,FCRFC,FIDOMICILIO,FIESTADOCLIENTE,FIBANCO, FCAPELLIDOS, FCSEXO) 
    VALUES(SEQ_CLIENTE.nextval,nombre,nacimiento,rfc,id_temporal,estado,banco,apellidos, sexo);

END;




