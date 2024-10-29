package ud3;

import java.util.Scanner;

public class Act1Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String letra = "";
		
		while(letra.equalsIgnoreCase(".")) {
			System.out.println("Dime una letra: ");
			letra = sc.next();
			
			if(letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u")) {
				
				System.out.println("Es vocal");
				
			}
			else if (letra.equalsIgnoreCase(".")){
				System.out.println("Saliendo...");
			}
			else {
				System.out.println("No es vocal");
			}
		}
		
		
	}

}
