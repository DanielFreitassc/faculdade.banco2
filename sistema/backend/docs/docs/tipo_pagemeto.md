### GET All

```yml
http://localhost:8080/tipo-pagamento
```

Endpoint para listar tipos de pagamento.

**Exemplo de Resposta:**
```
HTTP 200 OK
[
    {
        "id": 1,
        "descricao": "Cartão de Crédito"
    },
    {
        "id": 2,
        "descricao": "Cartão de Débito"
    }
]
```

### GET BY ID

```yml
http://localhost:8080/tipo-pagamento/1
```

Endpoint  para buscar tipo de pagamento por um ID especifico.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "descricao": "Cartão de Crédito"
}
```

### POST

```yml
http://localhost:8080/tipo-pagamento
```

Endpoint to create a new tipo de pagamento.

**Exemplo de Corpo da Requisição:**
```json
{
    "descricao": "Cartão"
}
```

**Exemplo de Resposta:**
```
HTTP 201 Created
{
    "id": 1,
    "descricao": "Cartão"
}
```

### PUT

```yml
http://localhost:8080/tipo-pagamento/1
```

Atualizar tipo de pagameto por ID.

**Exemplo de Corpo da Requisição:**
```json
{
    "descricao": "Cartão atualizado"
}
```

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "descricao": "Cartão atualizado"
}
```

### DELETE

```yml
http://localhost:8080/tipo-pagamento/1
```

Remover tipo de pagamento por ID.

**Exemplo de Resposta:**
```
HTTP 200 OK
{
    "id": 1,
    "descricao": "Cartão atualizado"
}
```
