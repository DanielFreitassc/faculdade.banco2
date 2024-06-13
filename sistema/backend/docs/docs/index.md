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

