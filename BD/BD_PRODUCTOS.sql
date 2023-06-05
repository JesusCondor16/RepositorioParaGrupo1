CREATE DATABASE productos;

use productos;

create table productos(
	id int auto_increment primary key,
	nombre varchar(100),
    cantidad int,
    precioUnit float
);

insert into productos(nombre, cantidad, precioUnit) values ("Arroz Costeño 5kg", 200, 17.50);
insert into productos(nombre, cantidad, precioUnit) values ("Arroz Paisana 5kg", 200, 19.90);
insert into productos(nombre, cantidad, precioUnit) values ("Arroz Bell's 5kg", 200, 23.70);
insert into productos(nombre, cantidad, precioUnit) values ("Arroz Costeño 5kg", 200, 21.8);
insert into productos(nombre, cantidad, precioUnit) values ("Arroz Pacasmayo 5kg", 200,22.7);
insert into productos(nombre, cantidad, precioUnit) values ("Aceite Primor 1L", 500, 12);
insert into productos(nombre, cantidad, precioUnit) values ("Aceite Uno 1L", 500, 9);
insert into productos(nombre, cantidad, precioUnit) values ("Aceite Cil 1L", 500, 10);
insert into productos(nombre, cantidad, precioUnit) values ("Aceite Primor Premium 1L", 500, 16);
insert into productos(nombre, cantidad, precioUnit) values ("Gaseosa Inka Cola Six Pack", 400, 15.5);
insert into productos(nombre, cantidad, precioUnit) values ("Gaseosa Coca Cola Six Pack", 400, 14.8);
insert into productos(nombre, cantidad, precioUnit) values ("Six Pack Pilsen 473mL", 800, 39.4);
insert into productos(nombre, cantidad, precioUnit) values ("Six Pack Cristal 473mL", 800, 36.5);
insert into productos(nombre, cantidad, precioUnit) values ("Six Pack Tres Cruces 473mL", 4, 36);
insert into productos(nombre, cantidad, precioUnit) values ("Atun Carabella", 60, 8);
insert into productos(nombre, cantidad, precioUnit) values ("Atun Florida", 70, 7);
insert into productos(nombre, cantidad, precioUnit) values ("Pan de Molde Bimbo", 10, 19);
insert into productos(nombre, cantidad, precioUnit) values ("Yogurt Gloria 1L", 50, 12.40);
insert into productos(nombre, cantidad, precioUnit) values ("Six Pack Leche Gloria en caja", 30, 16.70);
insert into productos(nombre, cantidad, precioUnit) values ("Sopa Ajinomen", 100, 1.5);
insert into productos(nombre, cantidad, precioUnit) values ("Queso Philadelphia", 20, 9.8);
insert into productos(nombre, cantidad, precioUnit) values ("Mayonesa Alacena 475g", 30, 16);
insert into productos(nombre, cantidad, precioUnit) values ("Piqueo Snacks", 50, 9.5);

select * from productos;