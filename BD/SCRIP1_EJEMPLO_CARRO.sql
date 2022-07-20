-- CREATE SCHEMA concesionario;
USE concesionario;

CREATE TABLE cliente(
cli_cedula INT NOT NULL primary key,
cli_nombre varchar(20) NOT NULL,
cli_apellido varchar(20) NOT NULL,
cli_telefono INT NOT NULL,
cli_direccion varchar(20) NULL
);


CREATE TABLE tienda(
tie_NIT INT NOT NULL,
tie_nombre varchar(30) NOT NULL,
tie_direccion varchar(20) NOT NULL,
tie_telefono INT NOT NULL,
tie_correo varchar(30) NULL,
primary key(tie_NIT)
);

CREATE TABLE carro(
car_placa varchar(6) NOT NULL,
car_marca varchar(20) NOT NULL,
car_modelo INT NOT NULL,
car_tipo_motor ENUM('ELECTRICO', 'COMBUSTIBLE') default 'COMBUSTIBLE',
car_cli_cedula INT NOT NULL,
car_tie_NIT INT NOT NULL,
primary KEY(car_placa),
foreign key(car_cli_cedula) references cliente(cli_cedula),
foreign key(car_tie_NIT) references tienda(tie_NIT)
);

show tables;
show columns from carro;
describe carro;
-- drop table carro;

INSERT INTO tienda(tie_NIT, tie_nombre, tie_direccion, tie_telefono)
values(123456, 'tienda2', 'calle falsa 1234', 4644124);

INSERT INTO cliente(cli_cedula, cli_nombre, cli_telefono, cli_apellido)
values(1022, 'Daniel', 304390, 'Salazar');

INSERT INTO cliente(cli_cedula, cli_nombre, cli_telefono, cli_apellido)
values(1032, 'Jose', 304392, 'Mora');


INSERT INTO carro(car_placa, car_marca, car_modelo, car_tipo_motor, car_cli_cedula, car_tie_NIT)
values('ABC001', 'Toyota', 2023, 'ELECTRICO', 1022, 12345);

SELECT * from carro;
SELECT * from cliente;

UPDATE carro SET car_tipo_motor='ELECTRICO', car_marca='MAZDA' where car_placa='ABC001';

INSERT INTO carro(car_placa, car_marca, car_modelo, car_tipo_motor, 
car_cli_cedula, car_tie_NIT, cilindraje)
values('CDE003', 'FORD', 2023, 'COMBUSTIBLE', 1022, 12345, 3000);

-- DELETE FROM carro where car_modelo=2022;

ALTER TABLE carro ADD cilindraje INT not null;

ALTER TABLE carro DROP dia;

ALTER TABLE carro RENAME column cilindraje to car_cilindraje;

-- drop table carro;

INSERT INTO carro(car_placa, car_marca, car_modelo, car_tipo_motor, 
car_cli_cedula, car_tie_NIT, car_cilindraje)
values('MNO004', 'RENAULT', 2023, 'COMBUSTIBLE', 1032, 12345, 2000);

DELETE FROM carro where car_cli_cedula=1032;

DELETE FROM cliente where cli_cedula=1032;

SELECT cli_cedula, cli_nombre from cliente;

SELECT car_placa, car_modelo, car_marca FROM carro where car_modelo >= 2022;

SELECT * FROM carro where car_modelo > 2022 and car_tipo_motor = 'COMBUSTIBLE'
AND car_cli_cedula=1032;

SELECT car_modelo as anno_fabricacion from carro where car_placa='ABC001';

SELECT * from carro;

select car_marca, car_placa, cli_cedula from
carro, cliente WHERE carro.car_cli_cedula=cliente.cli_cedula;

SELECT * from carro JOIN cliente ON (carro.car_cli_cedula = cliente.cli_cedula);
