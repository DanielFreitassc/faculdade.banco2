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
  - **Resposta (201 CREATED)**: 
    - **Resposta**: Retorna a entiade cliente criada.
   
  - **Exceções**:
      - **400 Bad Request**: Se o payload não estiver conforme esperado ou se houver erros de validação nos campos.

### Endpoint: Cunsultar clientes cadastrados

- **URL**: `/cliente`

- **Método**: `GET`
  
    - **Resposta**: Retorna uma lista de todos os clientes cadastrados.
 
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
  
- **Resposta**: Retorna a entidade cliente atualizada.
  
- **Exceções**:
  - **400 Bad Request**: Se o payload não estiver conforme esperado ou se houver erros de validação nos campos.
  - **404 Not Found**: Se o cliente com o `id` especificado não existir.


### Endpoint: Excluir cadastro de cliente

- **URL**: `/cliente/{id}`
- **Método**: `DELETE`
  
- **Resposta**: Retorna a entiade cliente excluída.
  
- **Exceções**:
  - **404 Not Found**: Se o formulário com o `id` especificado não existir.


