CREATE OR REPLACE FUNCTION fn_total_pagamentos_cliente(pr_cliente int)
RETURNS numeric(10, 2)
LANGUAGE plpgsql
AS $function$
DECLARE
	total numeric(10, 2);
BEGIN
	SELECT
		sum(pagamento.valor)
	INTO total
	FROM pagamento
	WHERE pagamento.cliente = pr_cliente;

	IF (total IS NULL) THEN
		total := 0;
	END IF;

	RETURN total;
END;
$function$;

CREATE OR REPLACE FUNCTION fn_formata_celular(pr_celular int)
RETURNS varchar
LANGUAGE plpgsql
AS $function$
DECLARE
	formatado varchar(150);
BEGIN
	SELECT
		CONCAT_WS(' ', celular.marca, celular.modelo, celular.ano)
	INTO formatado
	FROM celular
	WHERE celular.id = pr_celular;

	RETURN formatado;
END;
$function$;

CREATE OR REPLACE FUNCTION fn_lucro_celular(pr_celular int)
RETURNS numeric(10, 2)
LANGUAGE plpgsql
AS $function$
DECLARE
	valor numeric(10, 2);
BEGIN
	SELECT
		sum(pagamento.valor)
	INTO valor
	FROM pagamento
	WHERE pagamento.celular = pr_celular;

	RETURN COALESCE(valor, 0);
END;
$function$;

CREATE OR REPLACE FUNCTION fn_prejuizo_celular(pr_celular int)
RETURNS numeric(10, 2)
LANGUAGE plpgsql
AS $function$
DECLARE
	valor numeric(10, 2);
BEGIN
	SELECT
		sum(apolice.valor)
	INTO valor
	FROM apolice
	WHERE apolice.celular = pr_celular;

	RETURN COALESCE(valor, 0);
END;
$function$;