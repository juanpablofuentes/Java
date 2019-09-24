create database compras;

use compras;

create table categorias
(
    idcategoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

create table productos(
  idproducto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(300),
    stock int,
    idcategoria int
);

create table proveedores(
  idproveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    nif VARCHAR(15),
    poblacion VARCHAR(150)
);

create table producto_proveedor(
idproducto_proveedor int auto_increment primary key,
idproducto int not null,
idproveedor int not null,
precio decimal(10,4) not null
);

alter table productos add
FOREIGN KEY fk_categoria (idcategoria)
REFERENCES categorias(idcategoria)
ON DELETE restrict
ON UPDATE cascade;

alter table producto_proveedor add
FOREIGN KEY fk_producto (idproducto)
REFERENCES productos(idproducto)
ON DELETE restrict
ON UPDATE cascade;

alter table producto_proveedor add
FOREIGN KEY fk_proveedor (idproveedor)
REFERENCES proveedores(idproveedor)
ON DELETE restrict
ON UPDATE cascade;

insert into categorias (nombre) values ("Fruta"),("Verdura"),("Pescados");

insert into productos (nombre,descripcion,stock,idcategoria) values
("Manzana","Manzana saludable",3,1),
("Pera","No ha salido de un olmo",13,1),
("Brócoli","Verdura fractal",5,2),
("Salmonete","Salmón chiquitín",30,3);

insert into proveedores(nombre, nif, poblacion) values
("De fruta madre","B1231231","Lleida"),
("L'hort de l'avia","B716721","Girona"),
("De la mar el mero","B2334231","Tarragona");

insert into producto_proveedor(idproducto,idproveedor,precio) values
(1,1,20),(1,2,19),(2,1,10),(3,2,10),(4,3,80);