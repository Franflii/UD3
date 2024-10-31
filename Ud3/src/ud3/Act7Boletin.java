package ud3;

import java.util.Scanner;

public class Act7Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos números vas a introducir: ");
		
		int cantidad = sc.nextInt();
		
		int contadorMas = 0;
		int contadorMenos = 0;
		int contadorIgual = 0;
		int num;
		
		for(int i = 0; i < cantidad; i++) {
			
			System.out.println("Dime el número: ");
			num = sc.nextInt();
			
			if(num>0) {
				contadorMas++;
			}
			else if(num<0) {
				contadorMenos++;
			}
			else if(num == 0) {
				contadorIgual++;
			}
		}
		
		System.out.printf("Hay %d números mayores que 0 .\n",contadorMas);
		System.out.printf("Hay %d números menores que 0 .\n",contadorMenos);
		System.out.printf("Hay %d números iguales que 0.\n",contadorIgual);

	}

}
