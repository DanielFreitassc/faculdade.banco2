## Projeto Sistema de Atividades Especiais - GRUPO A

### Integrantes
Luiz Felipe Zomer - [@LuizZomer](https://github.com/luizZomer)<br>
Luiz Filipe Linhares - [@LuizFilipeLinhares](https://github.com/LuizFilipeLinhares)<br>
Willian Minatto - [@willianminatto](https://github.com/willianminatto)<br>
Daniel Freitas - [@DanielFreitassc](https://github.com/DanielFreitassc)<br>
Augustos Preis - [@AugustoPreis](https://github.com/AugustoPreis)

---

### Modelo Físico
Utilizamos a ferramenta de modelagem de dados [dbdiagram.io](https://dbdiagram.io/) para criação do modelo físico do banco de dados, para posterior exportação dos scripts DDL das tabelas e relacionamentos.<br>
Arquivo fonte: [Modelo Fisico](https://dbdiagram.io/d/6660f7fe8f6e135d4a671308).<br>

![Nodelo Fisico](image.png)
  
### Dicionário de Dados
As informações sobre as tabelas e índices foram documentados na planilha [dicionarioDeDados.xlsx](dicionario_dados/dicionarioDeDados.xlsx).

### Scripts SQL
Para este projeto foi utilizado o banco de dados [Azure SQL](https://azure.microsoft.com/pt-br/products/azure-sql/database) <br>
Este é o procedimento para criação do banco de dados Azure SQL [Criando SQL Azure serverless no Azure gratuito - Sem cartão de crédito](https://github.com/jlsilva01/sql-azure-satc).

Abaixo, segue os scripts SQL separados por tipo:
+ DDL [ddl.sql](scripts_sql/ddl.sql)
+ Índices [indices.sql](scripts_sql/indices.sql)
+ DML [dml.sql](scripts_sql/dml.sql)
+ Triggers [triggers.sql](scripts_sql/triggers.sql)
+ Stored Procedures [stored_procedures.sql](scripts_sql/stored_procedures.sql)
+ Functions [functions.sql](scripts_sql/functions.sql)

### Código Fonte do CRUD
- Linguagem de Programação Java, Javascript.<br>
- Framework Spring,
- Lib React
[Documentação da API](https://danielfreitassc.github.io/ProjetoFinalBD2/cliente/)
[Codigo Fonte](sistema/)

### Relatório Final
O relatório final está disponível no arquivo [template1.docx](relatorio/template1.docx).
