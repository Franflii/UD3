package ud3;

import java.util.Scanner;

public class Act13Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		String password;

		do {
			System.out.println("Escribe una contraseña de 10 o más caracteres: ");
			password = sc.next();
		}
		while(password.length() < 10);
		
		
		
		int contadorLetrasMayusculas = 0;
		int contadorLetrasMinusculas = 0;
		int contadorNum = 0;
		int contadorCaracteres = 0;
		
		for(int i = 0; i < password.length() ; i++) {
			
			String caracter = password.substring(i , i+1);
			
			if(caracter.matches("[a-z]" )) {
				contadorLetrasMinusculas++;
			}
			else if(caracter.matches("[A-Z]")) {
				contadorLetrasMayusculas++;
			}
			else if(caracter.matches("[0-9]")) {
				contadorNum++;
			}
			else if(caracter.matches("[@#*%&/]")) {
				contadorCaracteres++;
			}
		}
		
		if(contadorLetrasMinusculas >= 2 && contadorLetrasMayusculas >= 2 && contadorNum >= 2 && contadorCaracteres >= 2) {
			
			System.out.println("La contraseña es valida.");
		}
		else {
			System.out.println("La contraseña no es valida.");
		}

	}

}
