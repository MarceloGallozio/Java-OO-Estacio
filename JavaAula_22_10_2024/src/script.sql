create database db1;

use db1;

show tables();

create table cliente (id int primary key auto_increment, nome varchar(250), email varchar(250) unique);

insert into cliente values (1, 'marcelo', 'marcelo@gmail.com');

desc cliente;

select * from cliente;