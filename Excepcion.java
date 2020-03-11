package Evaluacion2;

public class Excepcion extends Exception {

	private String message;

	public Excepcion(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
