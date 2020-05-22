package aaa;

/**
 *
 * @author Alex Gómez
 * @version 1.0.1
 */
public class bbbe {

	public int ingresar(int cantidad) throws Exception {
		/*
		 * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
		 */
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");

		return cantidad;
	}

}
