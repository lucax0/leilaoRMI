drop database leilao;
create database leilao;
use leilao;
create table Usuario (
	id int auto_increment unique,
	nome varchar(30) not null,
    email varchar(60) not null unique,
    cpf varchar(14) not null unique primary key,
    senha varchar(10) not null,    
    tipo int);

create table Leilao (
	id int auto_increment primary key,
    criadoPor int,
	nome varchar(30) not null,
    dataInicio datetime not null DEFAULT CURRENT_TIMESTAMP,
    descricao varchar(250),
    sstatus int not null,
    duracao float(05),
    dataFim date);

create table Item (
	id int auto_increment primary key,
    idLeilao int,
	nome varchar(30) not null,
    vendedor varchar(30) ,
    cpf varchar(11) not null unique,
    descricao varchar(250),
	lance float(11) ,
    valormin float(11) ,
    senha varchar(11),
    valorarremate float(11)
    );
    
create table Participante(
cpf varchar(11) not null unique,
FOREIGN KEY (cpf) REFERENCES Usuario(cpf),
idtemcomprado int(10)
);
create table Leiloeiro(
cpf varchar(11) not null unique,
FOREIGN KEY (cpf) REFERENCES Usuario(cpf),
id int(10)
);
