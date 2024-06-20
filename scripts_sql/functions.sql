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