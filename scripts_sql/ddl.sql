-- Create table
Create table cliente (

Id serial PRIMARY KEY,

Contato character varying(255),

Cpf character varying(11),

Nome character varying(255),

Sobrenome character varying(255)

);

Create table celular (

Id serial primary key,

Cliente integer references cliente,

Ano integer not null,

Marca character varying(255),

Modelo character varying(255)

);

Create table funcionario (

Id serial primary key,

Salario double precision,

Contato character varying(14),

Cpf character varying(11),

Funcao character varying(255),

Nome character varying(255),

Sobrenome character varying(255)

);

Create table fornecedor (

Id serial primary key,

Cnpj character varying(14),

Descricao character varying(255),

Nome character varying(255)

);


Create table apolice (

Id serial primary key,

Celular integer references celular,

Cliente integer references cliente,

Funcionario integer references funcionario,

Valor double precision,

Inicio date,

Fim date
);

create table sinistro (
	id serial primary key,
	celular integer references celular,
	cliente integer references cliente,
	data date,
	fornecedor integer references fornecedor,
	horario time without time zone,
	descricao character varying (255),
	local character varying (255),
	Apolice integer references apolice
);


Create table tipo_pagamento (

Id serial primary key,

Descricao character varying(255)

);

Create table pagamento (

Id serial primary key,

Data timestamp without time zone not null,

Celular integer,

Cliente integer,

Valor numeric(10, 2),

Tipo_pagamento integer,

Descricao character varying(255),
Sinistro integer references sinistro

);


create table total_tipo_pagamento (
	id serial primary key,
	tipo_pagamento int not null references tipo_pagamento,
	valor numeric (10,2) not null
);



-- Drop tables
DROP TABLE IF EXISTS total_tipo_pagamento;
DROP TABLE IF EXISTS pagamento;
DROP TABLE IF EXISTS sinistro;
DROP TABLE IF EXISTS apolice;
DROP TABLE IF EXISTS tipo_pagamento;
DROP TABLE IF EXISTS fornecedor;
DROP TABLE IF EXISTS funcionario;
DROP TABLE IF EXISTS celular;
DROP TABLE IF EXISTS cliente;
