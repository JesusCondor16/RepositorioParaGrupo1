CREATE DATABASE usuarios;
use usuarios;

Create Table usuarios(
	
	nombre varchar(200),
	apellido varchar(200),
    documento int,
    correo varchar(200),
    clave varchar(16)
);

insert into usuarios(nombre, apellido, documento, correo, clave) values("Marko", "Rique", 71069493, "noesaxabc@gmail.com", "123456789");

select * from usuarios;

alter table usuarios
	    add id int auto_increment primary key;