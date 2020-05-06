drop table if exists ObjProdutos;

create table Produtos(
id_ObjProdutos bigint auto_increment,
nome varchar(50) not null,
fornecedor varchar(50) not null,
preco float(50.00) not null,
estoque int(1000) not null,
primary key(id_ObjProdutos)
);