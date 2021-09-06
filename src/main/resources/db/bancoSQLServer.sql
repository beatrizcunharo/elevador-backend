use master
create database elevador
use elevador

create table historico_andar_tb (
	id_andar int primary key identity,
	numero_andar int not null,
	data_andar datetime not null
)