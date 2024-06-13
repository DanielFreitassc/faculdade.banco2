# Cadastro de celular
### Endpoint: Cadastro cliente

- **URL**: `/celular`
- **Método**: `POST`
- **Payload**:
  
```json
{
    "modelo":"LG-KB009",
    "ano":2024,
    "marca":"LG",
    "cliente": {
        "id":"1"
    }
}
```
&nbsp;

  - **Resposta (201 CREATED)**: 
    - **Resposta**: Retorna a entiade celular criada.
   
  - **Exceções**:
      - **400 Bad Request**: Se o payload não estiver conforme esperado ou se houver erros de validação nos campos.
---
&nbsp;
### Endpoint: Consultar celulares cadastrados

- **URL**: `/celular`

- **Método**: `GET`
    - **Resposta**: Retorna uma lista de todos os celulares cadastrados.
---
&nbsp;
### Endpoint: Atualizar cadastro de celular

- **URL**: `/celular/{id}`
- **Método**: `PUT`
- **Payload**:
  
```json
{
    "modelo":"LG-ATUALIZADO-KB009",
    "ano":2024,
    "marca":"LG",
    "cliente": {
        "id":"1"
    }
}
```
&nbsp;

- **Resposta**: Retorna a entidade celular atualizada.
  
- **Exceções**:
    - **400 Bad Request**: Se o payload não estiver conforme esperado ou se houver erros de validação nos campos.
    - **404 Not Found**: Se o cliente com o `id` especificado não existir.

&nbsp;

---
### Endpoint: Excluir cadastro de celular

- **URL**: `/celular/{id}`
&nbsp;

- **Método**: `DELETE`
  
- **Resposta**: Retorna a entidade celular excluída.
  
- **Exceções**:
    - **404 Not Found**: Se o formulário com o `id` especificado não existir.

--- 