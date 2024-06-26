
### GET All
```yml
http://localhost:8080/pagamento
```
Endpoint para obter todos os pagamentos.

**Exemplo de Resposta:**
```
HTTP 200 OK
[
    {
        "id": 1,
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        },
        "celular": {
            "id": 1,
            "modelo": "LG-KB009",
            "ano": 2024,
            "marca": "LG",
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            }
        },
        "valor": 200.0,
        "tipo_pagamento": {
            "id": 1,
            "descricao": "Cartão"
        },
        "data": "07/02/2023",
        "descricao": "Concerto de celular",
        "sinistro": {
            "id": 1,
            "data": "2023-04-02",
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            },
            "celular": {
                "id": 1,
                "modelo": "LG-KB009",
                "ano": 2024,
                "marca": "LG",
                "cliente": {
                    "id": 1,
                    "nome": "Fulano",
                    "sobrenome": "de tal",
                    "cpf": "11011011010",
                    "contato": "(55) 55555555"
                }
            },
            "local": "local tal tal",
            "horario": "18:00:00",
            "fornecedor": {
                "id": 1,
                "nome": "Empresa de tal",
                "cnpj": "12345678910",
                "descricao": "Empresa de fornecimento de peças"
            },
            "descricao": "descricao tal tal",
            "apolice": {
                "id": 1,
                "cliente": {
                    "id": 1,
                    "nome": "Fulano",
                    "sobrenome": "de tal",
                    "cpf": "11011011010",
                    "contato": "(55) 55555555"
                },
                "inicio": "07/02/2023",
                "fim": "07/02/2032",
                "valor": 200.0,
                "celular": {
                    "id": 1,
                    "modelo": "LG-KB009",
                    "ano": 2024,
                    "marca": "LG",
                    "cliente": {
                        "id": 1,
                        "nome": "Fulano",
                        "sobrenome": "de tal",
                        "cpf": "11011011010",
                        "contato": "(55) 55555555"
                    }
                },
                "funcionario": {
                    "id": 1,
                    "nome": "Fulano",
                    "sobrenome": "de tal",
                    "cpf": "11011011010",
                    "contato": "(55) 55555555",
                    "salario": 999.0,
                    "funcao": "Estoquista"
                }
            }
        }
    }
]
```

### GET BY ID

```yml
http://localhost:8080/pagamento/1
```

Endpoint para obter um pagamento específico pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "cliente": {
        "id": 1,
        "nome": "Fulano",
        "sobrenome": "de tal",
        "cpf": "11011011010",
        "contato": "(55) 55555555"
    },
    "celular": {
        "id": 1,
        "modelo": "LG-KB009",
        "ano": 2024,
        "marca": "LG",
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        }
    },
    "valor": 200.0,
    "tipo_pagamento": {
        "id": 1,
        "descricao": "Cartão"
    },
    "data": "07/02/2023",
    "descricao": "Concerto de celular",
    "sinistro": {
        "id": 1,
        "data": "2023-04-02",
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        },
        "celular": {
            "id": 1,
            "modelo": "LG-KB009",
            "ano": 2024,
            "marca": "LG",
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            }
        },
        "local": "local tal tal",
        "horario": "18:00:00",
        "fornecedor": {
            "id": 1,
            "nome": "Empresa de tal",
            "cnpj": "12345678910",
            "descricao": "Empresa de fornecimento de peças"
        },
        "descricao": "descricao tal tal",
        "apolice": {
            "id": 1,
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            },
            "inicio": "07/02/2023",
            "fim": "07/02/2032",
            "valor": 200.0,
            "celular": {
                "id": 1,
                "modelo": "LG-KB009",
                "ano": 2024,
                "marca": "LG",
                "cliente": {
                    "id": 1,
                    "nome": "Fulano",
                    "sobrenome": "de tal",
                    "cpf": "11011011010",
                    "contato": "(55) 55555555"
                }
            },
            "funcionario": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555",
                "salario": 999.0,
                "funcao": "Estoquista"
            }
        }
    }
}
```

### POST 

```yml
http://localhost:8080/pagamento
```

Endpoint para criar um novo pagamento.

**Exemplo de Corpo da Requisição:**
```json
{
    "cliente": {
        "id":1
    },
    "celular": {
        "id":1
    },
    "tipo_pagamento": {
        "id" :1
    },
    "valor" : 200,
    "data": "07/02/2023",
    "descricao":"Concerto de celular",
    "sinistro": {
        "id":1
    }
}
```

**Exemplo de Resposta:**
```
HTTP 201 Created
{
    "id": 2,
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
    "valor": 200.0,
    "tipo_pagamento": {
        "id": 1,
        "descricao": null
    },
    "data": "07/02/2023",
    "descricao": "Concerto de celular",
    "sinistro": {
        "id": 1,
        "data": null,
        "cliente": null,
        "celular": null,
        "local": null,
        "horario": null,
        "fornecedor": null,
        "descricao": null,
        "apolice": null
    }
}
```

### PUT 

```yml
http://localhost:8080/pagamento/1
```

Endpoint para atualizar um pagamento existente pelo seu ID.

**Exemplo de Corpo da Requisição:**
```json
{
    "cliente": {
        "id":1
    },
    "celular": {
        "id":1
    },
    "tipo_pagamento": {
        "id" :1
    },
    "valor" : 700,
    "data":"07/02/2023",
    "descricao":"Concerto de celular",
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
        "nome": "Fulano",
        "sobrenome": "de tal",
        "cpf": "11011011010",
        "contato": "(55) 55555555"
    },
    "celular": {
        "id": 1,
        "modelo": "LG-KB009",
        "ano": 2024,
        "marca": "LG",
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        }
    },
    "valor": 700.0,
    "tipo_pagamento": {
        "id": 1,
        "descricao": "Cartão"
    },
    "data": "07/02/2023",
    "descricao": "Concerto de celular",
    "sinistro": {
        "id": 1,
        "data": "2023-04-02",
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        },
        "celular": {
            "id": 1,
            "modelo": "LG-KB009",
            "ano": 2024,
            "marca": "LG",
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            }
        },
        "local": "local tal tal",
        "horario": "18:00:00",
        "fornecedor": {
            "id": 1,
            "nome": "Empresa de tal",
            "cnpj": "12345678910",
            "descricao": "Empresa de fornecimento de peças"
        },
        "descricao": "descricao tal tal",
        "apolice": {
            "id": 1,
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            },
            "inicio": "07/02/2023",
            "fim": "07/02/2032",
            "valor": 200.0,
            "celular": {
                "id": 1,
                "modelo": "LG-KB009",
                "ano": 2024,
                "marca": "LG",
                "cliente": {
                    "id": 1,
                    "nome": "Fulano",
                    "sobrenome": "de tal",
                    "cpf": "11011011010",
                    "contato": "(55) 55555555"
                }
            },
            "funcionario": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555",
                "salario": 999.0,
                "funcao": "Estoquista"
            }
        }
    }
}
```

### DELETE 

```yml
http://localhost:8080/pagamento/1
```

Endpoint para excluir um pagamento pelo seu ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "cliente": {
        "id": 1,
        "nome": "Fulano",
        "sobrenome": "de tal",
        "cpf": "11011011010",
        "contato": "(55) 55555555"
    },
    "celular": {
        "id": 1,
        "modelo": "LG-KB009",
        "ano": 2024,
        "marca": "LG",
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        }
    },
    "valor": 700.0,
    "tipo_pagamento": {
        "id": 1,
        "descricao": "Cartão"
    },
    "data": "07/02/2023",
    "descricao": "Concerto de celular",
    "sinistro": {
        "id": 1,
        "data": "2023-04-02",
        "cliente": {
            "id": 1,
            "nome": "Fulano",
            "sobrenome": "de tal",
            "cpf": "11011011010",
            "contato": "(55) 55555555"
        },
        "celular": {
            "id": 1,
            "modelo": "LG-KB009",
            "ano": 2024,
            "marca": "LG",
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            }
        },
        "local": "local tal tal",
        "horario": "18:00:00",
        "fornecedor": {
            "id": 1,
            "nome": "Empresa de tal",
            "cnpj": "12345678910",
            "descricao": "Empresa de fornecimento de peças"
        },
        "descricao": "descricao tal tal",
        "apolice": {
            "id": 1,
            "cliente": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555"
            },
            "inicio": "07/02/2023",
            "fim": "07/02/2032",
            "valor": 200.0,
            "celular": {
                "id": 1,
                "modelo": "LG-KB009",
                "ano": 2024,
                "marca": "LG",
                "cliente": {
                    "id": 1,
                    "nome": "Fulano",
                    "sobrenome": "de tal",
                    "cpf": "11011011010",
                    "contato": "(55) 55555555"
                }
            },
            "funcionario": {
                "id": 1,
                "nome": "Fulano",
                "sobrenome": "de tal",
                "cpf": "11011011010",
                "contato": "(55) 55555555",
                "salario": 999.0,
                "funcao": "Estoquista"
            }
        }
    }
}
```