--PERGUNTA 1
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
SELECT
	fn_formata_celular(celular.id) AS nome,
	fn_lucro_celular(celular.id) AS lucro,
	fn_prejuizo_celular(celular.id) AS prejuizo
FROM celular
ORDER BY 3 DESC;

--PERGUNTA 4
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