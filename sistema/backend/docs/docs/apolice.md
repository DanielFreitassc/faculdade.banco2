Aqui estão os exemplos de markdown para cada método HTTP da sua API de apólice de seguro:

### GET All

```yml
http://localhost:8080/apolice
```

Endpoint para listar todas as apólices.

**Exemplo de Resposta:**
```
HTTP 200 OK
[
    {
        "id": 1,
        "cliente": {
            "id": 1,
            "nome": "Ana",
            "sobrenome": "Silva",
            "cpf": "12345678900",
            "contato": "(11) 91234-5678"
        },
        "inicio": "01/01/2023",
        "fim": "01/01/2024",
        "valor": 499.99,
        "celular": {
            "id": 1,
            "modelo": "iPhone 13",
            "ano": 2021,
            "marca": "Apple",
            "cliente": {
                "id": 1,
                "nome": "Ana",
                "sobrenome": "Silva",
                "cpf": "12345678900",
                "contato": "(11) 91234-5678"
            }
        },
        "funcionario": {
            "id": 1,
            "nome": "Maria",
            "sobrenome": "Santos",
            "cpf": "23456789012",
            "contato": "(21)91234-5678",
            "salario": 5500.0,
            "funcao": "Gerente de Vendas"
        }
    },
    {
        "id": 2,
        "cliente": {
            "id": 2,
            "nome": "Bruno",
            "sobrenome": "Souza",
            "cpf": "23456789011",
            "contato": "(21) 98765-4321"
        },
        "inicio": "05/02/2023",
        "fim": "05/02/2024",
        "valor": 299.99,
        "celular": {
            "id": 2,
            "modelo": "Galaxy S21",
            "ano": 2021,
            "marca": "Samsung",
            "cliente": {
                "id": 2,
                "nome": "Bruno",
                "sobrenome": "Souza",
                "cpf": "23456789011",
                "contato": "(21) 98765-4321"
            }
        },
        "funcionario": {
            "id": 2,
            "nome": "Fulano",
            "sobrenome": "de tal atualizado",
            "cpf": "11011011010",
            "contato": "(55) 55555555",
            "salario": 999.0,
            "funcao": "Estoquista"
        }
    }
]
```

### GET BY ID

```yml
http://localhost:8080/apolice/1
```

Endpoint para listar uma apólice específica pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "cliente": {
        "id": 1,
        "nome": "Ana",
        "sobrenome": "Silva",
        "cpf": "12345678900",
        "contato": "(11) 91234-5678"
    },
    "inicio": "01/01/2023",
    "fim": "01/01/2024",
    "valor": 499.99,
    "celular": {
        "id": 1,
        "modelo": "iPhone 13",
        "ano": 2021,
        "marca": "Apple",
        "cliente": {
            "id": 1,
            "nome": "Ana",
            "sobrenome": "Silva",
            "cpf": "12345678900",
            "contato": "(11) 91234-5678"
        }
    },
    "funcionario": {
        "id": 1,
        "nome": "Maria",
        "sobrenome": "Santos",
        "cpf": "23456789012",
        "contato": "(21)91234-5678",
        "salario": 5500.0,
        "funcao": "Gerente de Vendas"
    }
}
```

### POST

```yml
http://localhost:8080/apolice
```

Endpoint para cadastrar uma nova apólice.

**Exemplo de Corpo da Requisição:**
```json
{
    "cliente": {
        "id": 1
    },
    "inicio": "07/02/2023",
    "fim": "07/02/2032",
    "valor": 200,
    "celular": {
        "id": 1
    },
    "funcionario": {
        "id":1
    },
    "sinistro": {
        "id":1
    }
}
```

**Exemplo de Resposta:**
```
HTTP 201 Created
{
    "id": 1,
    "cliente": {
        "id": 1,
        "nome": null,
        "sobrenome": null,
        "cpf": null,
        "contato": null
    },
    "inicio": "07/02/2023",
    "fim": "07/02/2032",
    "valor": 200.0,
    "celular": {
        "id": 1,
        "modelo": null,
        "ano": 0,
        "marca": null,
        "cliente": null
    },
    "funcionario": {
        "id": 1,
        "nome": null,
        "sobrenome": null,
        "cpf": null,
        "contato": null,
        "salario": null,
        "funcao": null
    }
}
```

### PUT

```yml
http://localhost:8080/apolice/1
```

Endpoint para atualizar uma apólice existente pelo seu ID.

**Exemplo de Corpo da Requisição:**
```json
{
    "cliente": {
        "id": 1
    },
    "inicio": "07/02/2023",
    "fim": "07/02/2032",
    "valor": 200,
    "celular": {
        "id": 1
    },
    "funcionario": {
        "id":1
    },
    "sinistro": {
        "id":1
    }
}
```

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "cliente": {
        "id": 1,
        "nome": "Ana",
        "sobrenome": "Silva",
        "cpf": "12345678900",
        "contato": "(11) 91234-5678"
    },
    "inicio": "07/02/2023",
    "fim": "07/02/2032",
    "valor": 200.0,
    "celular": {
        "id": 1,
        "modelo": "iPhone 13",
        "ano": 2021,
        "marca": "Apple",
        "cliente": {
            "id": 1,
            "nome": "Ana",
            "sobrenome": "Silva",
            "cpf": "12345678900",
            "contato": "(11) 91234-5678"
        }
    },
    "funcionario": {
        "id": 1,
        "nome": "Maria",
        "sobrenome": "Santos",
        "cpf": "23456789012",
        "contato": "(21)91234-5678",
        "salario": 5500.0,
        "funcao": "Gerente de Vendas"
    }
}
```

### DELETE

```yml
http://localhost:8080/apolice/1
```

Endpoint para remover uma apólice pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "cliente": {
        "id": 1,
        "nome": "Ana",
        "sobrenome": "Silva",
        "cpf": "12345678900",
        "contato": "(11) 91234-5678"
    },
    "inicio": "07/02/2023",
    "fim": "07/02/2032",
    "valor": 200.0,
    "celular": {
        "id": 1,
        "modelo": "iPhone 13",
        "ano": 2021,
        "marca": "Apple",
        "cliente": {
            "id": 1,
            "nome": "Ana",
            "sobrenome": "Silva",
            "cpf": "12345678900",
            "contato": "(11) 91234-5678"
        }
    },
    "funcionario": {
        "id": 1,
        "nome": "Maria",
        "sobrenome": "Santos",
        "cpf": "23456789012",
        "contato": "(21)91234-5678",
        "salario": 5500.0,
        "funcao": "Gerente de Vendas"
    }
}
```