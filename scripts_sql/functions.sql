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
