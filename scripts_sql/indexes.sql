CREATE INDEX idx_cliente_cpf ON cliente(Cpf);
CREATE INDEX idx_cliente_nome ON cliente(Nome);
CREATE INDEX idx_celular_cliente ON celular(Cliente);
CREATE INDEX idx_celular_marca ON celular(Marca);
CREATE INDEX idx_funcionario_cpf ON funcionario(Cpf);
CREATE INDEX idx_funcionario_nome ON funcionario(Nome);
CREATE INDEX idx_apolice_cliente ON apolice(Cliente);
CREATE INDEX idx_apolice_funcionario ON apolice(Funcionario);
CREATE INDEX idx_sinistro_cliente ON sinistro(Cliente);
CREATE INDEX idx_sinistro_data ON sinistro(Data);
