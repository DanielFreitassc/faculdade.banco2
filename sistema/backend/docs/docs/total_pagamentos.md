## Get total de pagamentos

Aqui estão os endpoints e exemplos atualizados para ver total de pagamentos

```yml
http://localhost:8080/total-pagamentos
```
**Exemplo de Resposta:**
```
HTTP 200 OK
[
    {
        "id": 3,
        "tipo_pagamento": {
            "id": 3,
            "descricao": "Boleto Bancário"
        },
        "valor": 989.97
    },
    {
        "id": 1,
        "tipo_pagamento": {
            "id": 1,
            "descricao": "Cartão de Crédito"
        },
        "valor": 2749.96
    },
    {
        "id": 5,
        "tipo_pagamento": {
            "id": 5,
            "descricao": "Pix"
        },
        "valor": 399.97
    },
    {
        "id": 4,
        "tipo_pagamento": {
            "id": 4,
            "descricao": "Transferência Bancária"
        },
        "valor": 1544.97
    },
    {
        "id": 8,
        "tipo_pagamento": {
            "id": 12,
            "descricao": "Vale Alimentação"
        },
        "valor": 885.00
    },
    {
        "id": 9,
        "tipo_pagamento": {
            "id": 15,
            "descricao": "Mercado Pago"
        },
        "valor": 80.00
    },
    {
        "id": 2,
        "tipo_pagamento": {
            "id": 2,
            "descricao": "Cartão de Débito"
        },
        "valor": 2089.96
    },
    {
        "id": 6,
        "tipo_pagamento": {
            "id": 6,
            "descricao": "Dinheiro"
        },
        "valor": 948.97
    },
    {
        "id": 7,
        "tipo_pagamento": {
            "id": 7,
            "descricao": "Cheque"
        },
        "valor": 500.00
    },
    {
        "id": 10,
        "tipo_pagamento": {
            "id": 9,
            "descricao": "Crédito em Conta"
        },
        "valor": 120.00
    }
]
```