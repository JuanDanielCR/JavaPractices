create database platzi_java;
use platzi_java;
show tables;
desc vehiculo;
create table vehiculo(
	vehiculo_id int primary key,
    placa nvarchar(10) not null default 'XXX',
    nombre nvarchar(15) not null,
    marca nvarchar(15) not null
);
insert into vehiculo values
(1,'PLACA2','IBIZA','SEAT'),
(2,'PLACA3','GOL','NISSAN'),
(3,'PLACA4','SUNFIRE','PONTIAC'),
(4,'PLACA5','CRV','NISSAN'),
(5,'PLACA6','A3','AUDI');
select * from vehiculo;
update vehiculo set nombre='Modificado' where vehiculo_id=1;
drop table vehiculo;
#Ver Conexiones Activas
	show processlist;
#Ver Conecciones y datos de la session
	show session status;