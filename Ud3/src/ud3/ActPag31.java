package ud3;

import java.util.Scanner;

public class ActPag31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("----MENÚ----");
			System.out.println("1. Opción 1.");
			System.out.println("2. Opción 2.");
			System.out.println("3. Opción 3.");
			System.out.println("4. Opción 4.");
			System.out.println("5. Salir.");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ejecutando la opcion 1...");
				break;
			case 2:
				System.out.println("Ejecutando la opcion 2...");
				break;
			case 3:
				System.out.println("Ejecutando la opcion 3...");
				break;
			case 4:
				System.out.println("Ejecutando la opcion 4...");
				break;
			
			default:
				System.out.println("Saliendo...");
			
				
			}
			


		}
		while(opcion >= 1 && opcion <=4);

	}

}
