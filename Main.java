package Evaluacion2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opt;

		Estudiante est = null;
		Materias mat = null;

		Materias mt1 = new Materias(1, "Matematicas", 4.5f, est);
		Materias mt2 = new Materias(2, "Sociales", 6.7f, est);

		Estudiante es1 = new Estudiante(1001, "Andres Quintero", 16, mat);
		Estudiante es2 = new Estudiante(1002, "Juana Padilla", 14, mat);

		System.out.println("Elija una opcion para averiguar notas.");
		System.out.println("1. Materias");
		System.out.println("2. Estudiante");

		opt = sc.nextInt();

		switch (opt) {

		case 1:

			System.out.println("¿Que materia desea averiguar?");
			System.out.println("1. Matematicas");
			System.out.println("2. Sociales");

			opt = sc.nextInt();

			switch (opt) {

			case 1:

				System.out.println("¿Que estudiante desea averiguar?");
				System.out.println("1. Andres Quintero");
				System.out.println("2. Juana Padilla");

				opt = sc.nextInt();

				switch (opt) {

				case 1:

					mt1.setEst(es1);

					break;
				case 2:

					mt1.setEst(es2);
					break;

				default:
					System.out.println("No existe esa opcion");
					break;

				}

				try {
					mt1.validar();
				} catch (Excepcion ex) {

					System.out.println("Operacion invalida");
					System.out.println(ex.getMessage());

				} catch (NullPointerException ex) {
					System.out.println("Excepcion por un valor nulo");
				} finally {
					System.out.println("Fin de la operacion");

				}
				break;

			case 2:

				System.out.println("¿Que estudiante desea averiguar?");
				System.out.println("1. Andres Quintero");
				System.out.println("2. Juana Padilla");

				opt = sc.nextInt();

				switch (opt) {

				case 1:
					mt2.setEst(es1);

					break;
				case 2:

					mt2.setEst(es2);
					break;

				default:
					System.out.println("No existe esa opcion");
					break;

				}

				try {
					mt2.validar();
				} catch (Excepcion ex) {

					System.out.println("Operacion invalida");
					System.out.println(ex.getMessage());

				} catch (NullPointerException ex) {
					System.out.println("Excepcion por un valor nulo");
				} finally {
					System.out.println("Fin de la operacion");

				}
				break;

			default:
				System.out.println("");

			}
			break;
		case 2:

			System.out.println("¿Que estudiante desea averiguar?");
			System.out.println("1. Andres Quintero");
			System.out.println("2. Juana Padilla");

			opt = sc.nextInt();

			switch (opt) {

			case 1:

				System.out.println("¿Que materia desea averiguar?");
				System.out.println("1. Matematicas");
				System.out.println("2. Sociales");

				opt = sc.nextInt();

				switch (opt) {

				case 1:

					es1.setMat(mt1);

					break;
				case 2:

					es1.setMat(mt2);
					break;

				default:
					System.out.println("No existe esa opcion");
					break;

				}

				try {
					es1.validar();
				} catch (Excepcion ex) {

					System.out.println("Operacion invalida");
					System.out.println(ex.getMessage());

				} catch (NullPointerException ex) {
					System.out.println("Excepcion por un valor nulo");
				} finally {
					System.out.println("Fin de la operacion");

				}
				break;

			case 2:

				System.out.println("¿Que materia desea averiguar?");
				System.out.println("1. Matematicas");
				System.out.println("2. Sociales");

				opt = sc.nextInt();

				switch (opt) {

				case 1:
					es2.setMat(mt1);

					break;
				case 2:

					es2.setMat(mt2);
					break;

				default:
					System.out.println("No existe esa opcion");
					break;

				}

				try {
					es2.validar();
				} catch (Excepcion ex) {

					System.out.println("Operacion invalida");
					System.out.println(ex.getMessage());

				} catch (NullPointerException ex) {
					System.out.println("Excepcion por un valor nulo");
				} finally {
					System.out.println("Fin de la operacion");

				}
				break;

			default:
				System.out.println("");

			}
			break;

		default:
			System.out.println("Opcion invalida.");

		}

	}
}