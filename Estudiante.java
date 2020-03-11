package Evaluacion2;

public class Estudiante extends Caracteristicas {

	private Integer edad;
	private Materias mat;

	public Estudiante(Integer id, String nombre, Integer edad, Materias mat) {
		super(nombre, id);

		this.edad = edad;
		this.mat = mat;

	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Materias getMat() {
		return mat;
	}

	public void setMat(Materias mat) {
		this.mat = mat;
	}

	@Override
	public void validar() throws Excepcion {
		// TODO Auto-generated method stub

		if (mat.getNota() < 5.00f) {

			System.out.println("Estudiante: " + nombre + " / id: " + id + "/ edad: " + edad);
			System.out.println("Materia: " + mat.getNombre() + " / id: " + mat.getId());
			System.out.println("Nota: " + mat.getNota());

		} else {

			throw new Excepcion("La nota ingresada es invalida");

		}

	}

}
