CREATE OR REPLACE PROCEDURE pr_deleta_pagamentos(pr_cliente int)
LANGUAGE plpgsql AS
$procedure$
DECLARE
	qtd_clientes int;
BEGIN
	SELECT
		count(cliente.id)
	INTO qtd_clientes
	FROM cliente
	WHERE cliente.id = pr_cliente;

	IF (qtd_clientes = 0) THEN
		RAISE EXCEPTION 'Cliente inexistente';
	END IF;
	
	DELETE FROM pagamento
	WHERE cliente = pr_cliente; 
END;
$procedure$;
