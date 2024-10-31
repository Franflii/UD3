package ud3;

import java.util.Scanner;

public class Act13Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca = new Scanner(System.in);

		String contra;

		int mayusculas = 0;

		int minusculas = 0;

		int numeros = 0;

		int especiales = 0;



		do {

			System.out.println("Mete una contraseña: ");

			contra = sca.next();

			for (int i = 0; i < contra.length(); i++) {

				String caracater = contra.substring(i, i + 1);



				if (caracater.matches("[A-Z]")) {

					mayusculas++;

				} else if (caracater.matches("[a-z]")) {

					minusculas++;

				} else if (caracater.matches("[0-9]")) {

					numeros++;

				} else if (caracater.matches("[@#*%&/]")) {

					especiales++;

				}

			}

		

		} while (contra.length() < 10 || (mayusculas < 2 || minusculas < 2 || numeros < 2 || especiales < 2));

		System.out.println("Contraseña VALIDA");

		



		



	}

}