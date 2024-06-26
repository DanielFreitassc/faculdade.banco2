
### GET All
```yml
http://localhost:8080/funcionario
```
Endpoint para listar todos os funcionários.

**Exemplo de Resposta:**
```
HTTP 200 OK
[
    {
        "id": 1,
        "nome": "Maria",
        "sobrenome": "Santos",
        "cpf": "23456789012",
        "contato": "(21)91234-5678",
        "salario": 5500.0,
        "funcao": "Gerente de Vendas"
    },
    {
        "id": 2,
        "nome": "João",
        "sobrenome": "Silva",
        "cpf": "12345678901",
        "contato": "(11)98765-4321",
        "salario": 5000.0,
        "funcao": "Analista de Sinistros"
    }
]
```

### GET BY ID

```yml
http://localhost:8080/funcionario/1
```

Endpoint para listar um funcionário específico pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "nome": "Maria",
    "sobrenome": "Santos",
    "cpf": "23456789012",
    "contato": "(21)91234-5678",
    "salario": 5500.0,
    "funcao": "Gerente de Vendas"
}
```

### POST 

```yml
http://localhost:8080/funcionario
```

Endpoint para cadastrar um novo funcionário.

**Exemplo de Corpo da Requisição:**
```json
{
    "nome":"Fulano",
    "sobrenome":"de tal",
    "cpf":"11011011010",
    "contato":"(55)55555555",
    "salario": 999,
    "funcao":"Estoquista"
}
```

**Exemplo de Resposta:**
```
HTTP 201 Created
{
    "id": 21,
    "nome": "Fulano",
    "sobrenome": "de tal",
    "cpf": "11011011010",
    "contato": "(55) 55555555",
    "salario": 999.0,
    "funcao": "Estoquista"
}
```

### PUT 

```yml
http://localhost:8080/funcionario/1
```

Endpoint para atualizar um funcionário existente pelo seu ID.

**Exemplo de Corpo da Requisição:**
```json
{
    "nome":"Fulano",
    "sobrenome":"de tal atualizado",
    "cpf":"11011011010",
    "contato":"(55) 55555555",
    "salario": 999,
    "funcao":"Estoquista"
}
```

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "nome": "Fulano",
    "sobrenome": "de tal atualizado",
    "cpf": "11011011010",
    "contato": "(55) 55555555",
    "salario": 999.0,
    "funcao": "Estoquista"
}
```

### DELETE 

```yml
http://localhost:8080/funcionario/1
```

Endpoint para remover um funcionário pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 2,
    "nome": "Fulano",
    "sobrenome": "de tal atualizado",
    "cpf": "11011011010",
    "contato": "(55) 55555555",
    "salario": 999.0,
    "funcao": "Estoquista"
}
```