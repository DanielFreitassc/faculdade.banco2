Aqui estão os endpoints e exemplos atualizados para a entidade "sinistro":

### GET All
```yml
http://localhost:8080/sinistro
```
Endpoint para listar todos os sinistros.

**Exemplo de Resposta:**
```
HTTP 200 OK
[
    {
        "id": 1,
        "data": "2023-01-10",
        "cliente": {
            "id": 1,
            "nome": "Ana",
            "sobrenome": "Silva",
            "cpf": "12345678900",
            "contato": "(11) 91234-5678"
        },
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
        "local": "São Paulo",
        "horario": "10:30:00",
        "fornecedor": {
            "id": 1,
            "nome": "AlphaTech Ltda",
            "cnpj": "12345678000101",
            "descricao": "Fornecedor de soluções tecnológicas e eletrônicos"
        },
        "descricao": "Queda acidental do celular",
        "apolice": {
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
    },
    {
        "id": 2,
        "data": "2023-02-20",
        "cliente": {
            "id": 2,
            "nome": "Bruno",
            "sobrenome": "Souza",
            "cpf": "23456789011",
            "contato": "(21) 98765-4321"
        },
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
        "local": "Rio de Janeiro",
        "horario": "14:45:00",
        "fornecedor": {
            "id": 2,
            "nome": "BetaDistribuidora",
            "cnpj": "23456789000102",
            "descricao": "Distribuidor de materiais de escritório e papelaria"
        },
        "descricao": "Roubo do celular em transporte público",
        "apolice": {
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
    }
]
```

### GET BY ID

```yml
http://localhost:8080/sinistro/1
```

Endpoint para listar um sinistro específico pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "data": "2023-01-10",
    "cliente": {
        "id": 1,
        "nome": "Ana",
        "sobrenome": "Silva",
        "cpf": "12345678900",
        "contato": "(11) 91234-5678"
    },
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
    "local": "São Paulo",
    "horario": "10:30:00",
    "fornecedor": {
        "id": 1,
        "nome": "AlphaTech Ltda",
        "cnpj": "12345678000101",
        "descricao": "Fornecedor de soluções tecnológicas e eletrônicos"
    },
    "descricao": "Queda acidental do celular",
    "apolice": {
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
}
```

### POST 

```yml
http://localhost:8080/sinistro
```

Endpoint para cadastrar um novo sinistro.

**Exemplo de Corpo da Requisição:**
```json
{
    "data":"2023-04-02",
    "cliente":{
        "id": 1
    },
    "celular": {
        "id": 1
    },
    "local":"local tal tal",
    "horario":"18:00:00",
    "fornecedor":{
        "id":1
    },
    "descricao":"descricao tal tal",
    "apolice": {
        "id":1
    }
    
}
```

**Exemplo de Resposta:**
```
HTTP 201 Created
{
    "id": 1,
    "data": "2023-04-02",
    "cliente": {
        "id": 1,
        "nome": null,
        "sobrenome": null,
        "cpf": null,
        "contato": null
    },
    "celular": {
        "id": 1,
        "modelo": null,
        "ano": 0,
        "marca": null,
        "cliente": null
    },
    "local": "local tal tal",
    "horario": "18:00:00",
    "fornecedor": {
        "id": 1,
        "nome": null,
        "cnpj": null,
        "descricao": null
    },
    "descricao": "descricao tal tal",
    "apolice": {
        "id": 1,
        "cliente": null,
        "inicio": null,
        "fim": null,
        "valor": null,
        "celular": null,
        "funcionario": null
    }
}
```

### PUT 

```yml
http://localhost:8080/sinistro/1
```

Endpoint para atualizar um sinistro existente pelo seu ID.

**Exemplo de Corpo da Requisição:**
```json
{
    "data":"2023-04-02",
    "cliente":{
        "id": 1
    },
    "celular": {
        "id": 1
    },
    "local":"local tal tal",
    "horario":"18:00:00",
    "fornecedor":{
        "id":1
    },
    "descricao":"descricao tal tal",
    "apolice": {
        "id":1
    }
    
}
```

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "data": "2023-04-02",
    "cliente": {
        "id": 1,
        "nome": "Ana",
        "sobrenome": "Silva",
        "cpf": "12345678900",
        "contato": "(11) 91234-5678"
    },
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
    "local": "local tal tal",
    "horario": "18:00:00",
    "fornecedor": {
        "id": 1,
        "nome": "AlphaTech Ltda",
        "cnpj": "12345678000101",
        "descricao": "Fornecedor de soluções tecnológicas e eletrônicos"
    },
    "descricao": "descricao tal tal",
    "apolice": {
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
}
```

### DELETE 

```yml
http://localhost:8080/sinistro/1
```

Endpoint para remover um sinistro pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "data": "2023-02-20",
    "cliente": {
        "id": 2,
        "nome": "Bruno",
        "sobrenome": "Souza",
        "cpf": "23456789011",
        "contato": "(21) 98765-4321"
    },
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
    "local": "Rio de Janeiro",
    "horario": "14:45:00",
    "fornecedor": {
        "id": 2,
        "nome": "BetaDistribuidora",
        "cnpj": "23456789000102",
        "descricao": "Distribuidor de materiais de escritório e papelaria"
    },
    "descricao": "Roubo do celular em transporte público",
    "apolice": {
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
}
```