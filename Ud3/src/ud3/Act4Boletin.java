package ud3;

import java.util.Scanner;

public class Act4Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ac = new Scanner(System.in);

		System.out.println("Dime una cadena:");
		String cadena = ac.next();
		String caracter1;
		String caracter2;
		String cadenaFinal = "";

		do {

			System.out.println("Dime el primer caracter: ");
			caracter1 = ac.next();

		} while (caracter1.length() != 1);

		do {
			System.out.println("Dime el segundo caracter: ");
			caracter2 = ac.next();

		} while (caracter2.length() != 1);
		
		   for(int i=0; i<cadena.length(); i++) {
			   String letra = cadena.substring(i, i+1);
			   
			   if(letra.equalsIgnoreCase(caracter1)) {
				   cadenaFinal = cadenaFinal + caracter2;
			   }
			   else {
				   cadenaFinal = cadenaFinal + letra;
			   }
			   
		   }
		   	System.out.println(cadenaFinal);

		}

	}


