CREATE OR REPLACE FUNCTION tr_calcula_total_tipo_pagamento()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $function$
declare
	id int;
BEGIN
	SELECT
		tab.id
	INTO id
	FROM total_tipo_pagamento tab
	WHERE tab.tipo_pagamento = NEW.tipo_pagamento;

	IF (id IS NULL) THEN
		SELECT
			COALESCE(max(tab.id) + 1, 1)
		INTO id
		FROM total_tipo_pagamento tab;
	
		INSERT INTO total_tipo_pagamento (
			id,
			tipo_pagamento,
			valor
		) VALUES (
			id,
			NEW.tipo_pagamento,
			NEW.valor
		);
	ELSE
		UPDATE total_tipo_pagamento
		SET valor = valor + NEW.valor
		WHERE tipo_pagamento = NEW.tipo_pagamento;
	END IF;

	RETURN NEW;
END;
$function$;

CREATE TRIGGER tr_insere_pagamento AFTER INSERT ON pagamento
FOR EACH ROW EXECUTE FUNCTION tr_calcula_total_tipo_pagamento();
