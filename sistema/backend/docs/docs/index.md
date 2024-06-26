


# Como Executar a Aplicação

## Pré-requisitos
- Git instalado para clonar o repositório.
- Docker instalado e configurado.

## Passos para Executar

### 1. Clonar o Repositório


Clone o repositório do GitHub:

```bash
git clone https://github.com/DanielFreitassc/ProjetoFinalBD2?tab=readme-ov-file
```

```bash
cd .\ProjetoFinalBD2\sistema\backend\
```

### 2. Subir o Banco de Dados PostgreSQL

No diretório onde está localizado o arquivo `docker-compose.yml`, execute o seguinte comando para iniciar o banco de dados PostgreSQL:

```bash
docker compose up -d
```

### 3. Construir e Executar a Imagem Docker do Backend

No diretório onde está localizado o arquivo `Dockerfile`, construa a imagem Docker para o backend:

```bash
docker build -t api .
```

Após a construção da imagem, execute o contêiner Docker:

```bash
docker run -dti -p 8080:8080 api
```

### 4. Acessar a Aplicação

A aplicação estará disponível em `http://localhost:8080`. Você pode acessar este endereço no seu navegador para interagir com a aplicação.

## Documentação Adicional

Para mais detalhes sobre a aplicação, consulte a documentação nas outras paginas:

