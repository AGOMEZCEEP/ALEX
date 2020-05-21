package aaa;

public class bbbe {
	/**
	 *
	 * @author Alex Gómez
	 * @version 1.0.1
	 */
	public int ingresar(int cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");

		return cantidad;
	}

	/*
	 * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
	 */
}
