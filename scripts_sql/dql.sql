--PERGUNTA 1
/*
1- Quantidade de apólices emitidas para sinistros cadastrados em maio: Considerando o histórico de sinistros registrados no mês de maio, 
gostaria de saber quantas apólices foram efetivamente emitidas para cobrir esses sinistros? 
Essa análise pode nos ajudar a entender a eficácia do sistema de seguro em relação aos eventos ocorridos.
*/

SELECT
	tab.*
FROM (
	SELECT
		cliente.nome,
		CONCAT_WS(' ', celular.marca, celular.modelo, celular.ano) AS celular,
		apolice.valor,
		(
			SELECT
				count(sinistro.id)
			FROM sinistro
			WHERE sinistro.apolice = apolice.id
				AND EXTRACT('month' FROM sinistro.data) = 5
		) AS qtd_sinistros
	FROM apolice
		INNER JOIN celular ON celular.id = apolice.celular
		INNER JOIN cliente ON cliente.id = apolice.cliente
) AS tab
WHERE tab.qtd_sinistros > 0
ORDER BY tab.qtd_sinistros DESC;

--PERGUNTA 2
/*
2 - Tipos de pagamentos relacionados a apólices de seguro em um mês específico: Para um mês X (por exemplo, junho), 
quais são os diferentes tipos de pagamentos associados a apólices de seguro de celulares?
*/
SELECT
	fn_formata_celular(apolice.celular),
	(
		SELECT
			json_agg(tipo_pagamento.descricao)
		FROM tipo_pagamento
		WHERE tipo_pagamento.id IN (
			SELECT
				pagamento.tipo_pagamento
			FROM pagamento
				INNER JOIN sinistro ON sinistro.id = pagamento.sinistro
			WHERE sinistro.apolice = apolice.id
				AND to_char(pagamento.data, 'mm/yyyy') = '06/2023'
		)
	) "tipos_pagamento"
FROM apolice

--PERGUNTA 3
/*
3 - Modelos de celulares com maior margem de prejuizo: Vamos analisar os dados para identificar 
quais modelos específicos de celulares geram maior prejuizo para a empresa. 
Isso envolve considerar os custos de aquisição, os prêmios de seguro associados a esses modelos e as taxas de sinistros.
*/
SELECT
	fn_formata_celular(celular.id) AS nome,
	fn_lucro_celular(celular.id) AS lucro,
	fn_prejuizo_celular(celular.id) AS prejuizo
FROM celular
ORDER BY 3 DESC;

--PERGUNTA 4
/*
4 - Desempenho dos funcionários em relação a apólices de seguro para um mesmo celular: Quais funcionários tiveram mais apólices 
cadastradas para um mesmo celular específico durante o mês X (do fornecedor Y)? Essa análise pode ajudar a otimizar a 
distribuição de tarefas e avaliar o desempenho da equipe.
*/
SELECT
	funcionario.nome,
	(
		SELECT
			count(apolice.id)
		FROM apolice
		WHERE apolice.funcionario = funcionario.id
			AND '2024-01-01' BETWEEN apolice.inicio AND apolice.fim
	) AS qtd_apolices
FROM funcionario
ORDER BY 2 DESC;

--Select usando os indeces
EXPLAIN SELECT * FROM sinistro WHERE Data = '2024-01-01';
EXPLAIN SELECT * FROM funcionario WHERE Nome = 'Maria Oliveira';
EXPLAIN SELECT * FROM cliente WHERE Cpf = '12345678900';
EXPLAIN SELECT * FROM celular WHERE Marca = 'Samsung';
