package Evaluacion2;

public class Materias extends Caracteristicas {

	private float nota;
	private Estudiante est;

	public Materias(Integer id, String nombre, float nota, Estudiante est) {

		super(nombre, id);

		this.nota = nota;
		this.est = est;

	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Estudiante getEst() {
		return est;
	}

	public void setEst(Estudiante est) {
		this.est = est;
	}

	@Override
	public void validar() throws Excepcion {

		if (nota < 5.00f) {

			System.out.println("Materia: " + nombre + " / id: " + id);
			System.out.println("Nota: " + nota);
			System.out
					.println("Estudiante: " + est.getNombre() + " / id: " + est.getId() + " / edad: " + est.getEdad());

		} else {

			throw new Excepcion("La nota ingresada es invalida");

		}

	}

}
