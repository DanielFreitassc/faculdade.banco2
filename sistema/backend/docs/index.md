# Como Executar a aplicação
--- 
- Clone o repositorio
- Abra a pasta onde tem a imagem Dockerfile
- Cole o comando abaixo

&nbsp;

```json
docker build -t api .
``` 
&nbsp;

- Agora execute o Dockerfile
```json
docker run -dti -p 8080:8080 api
```

&nbsp;

--- 
# Testes da API
## Cadastro de clientes
--- 

&nbsp;
### **Base URL: http://localhost:8080**

&nbsp;

### Endpoint: Cadastro cliente

- **URL**: `/cliente`
- **Método**: `POST`
- **Payload**:
  
```json
{
        "nome":"Fulano",
        "sobrenome":"de tal",
        "cpf":"110.110.110-10",
        "contato":"(55) 55555555"
}
```
&nbsp;

  - **Resposta (201 CREATED)**: 
    - **Resposta**: Retorna a entiade cliente criada.
   
  - **Exceções**:
      - **400 Bad Request**: Se o payload não estiver conforme esperado ou se houver erros de validação nos campos.
---

&nbsp;
### Endpoint: Consultar clientes cadastrados

- **URL**: `/cliente`

- **Método**: `GET`
    - **Resposta**: Retorna uma lista de todos os clientes cadastrados.
---
&nbsp;
### Endpoint: Atualizar cadastro de Cliente

- **URL**: `/cliente/{id}`
- **Método**: `PUT`
- **Payload**:
  
```json
{
        "nome":"Fulano",
        "sobrenome":"atualizado de tal",
        "cpf":"110.110.110-10",
        "contato":"(55) 55555555"
}
```
&nbsp;

- **Resposta**: Retorna a entidade cliente atualizada.
  
- **Exceções**:
  - **400 Bad Request**: Se o payload não estiver conforme esperado ou se houver erros de validação nos campos.
  - **404 Not Found**: Se o cliente com o `id` especificado não existir.

&nbsp;
---
### Endpoint: Excluir cadastro de cliente
&nbsp;

- **URL**: `/cliente/{id}`
&nbsp;

- **Método**: `DELETE`
  
- **Resposta**: Retorna a entiade cliente excluída.
  
- **Exceções**:
  - **404 Not Found**: Se o formulário com o `id` especificado não existir.

--- 

## Cadastro de celular
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
## .