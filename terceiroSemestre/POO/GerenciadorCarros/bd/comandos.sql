create database gerenciador_carros;

use gerenciador_carros;

create table carro(
	placa varchar(7) not null,
    marca varchar(50) not null,
    modelo varchar(80) not null,
    ano int not null,
    tipo_carro varchar(9) not null,
    quilometragem int not null,
    tanque varchar(12) not null,
    disponibilidade tinyint not null,
    primary key(placa)
);

create table operacao(
	id_operacao int not null auto_increment,
    tipo_operacao varchar(9) not null,
    data_hora datetime not null,
    valor double not null,
    quilometragem int null,
    tanque varchar(12) null,
    placa varchar(7) not null,
    primary key(id_operacao),
    foreign key(placa) references carro(placa)
);


