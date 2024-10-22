package ud3;

import java.util.Scanner;

public class ActPag25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		int suma=0;
		double media;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Escribe un número: ");
			n = sc.nextInt();
			suma+=n;
		}
		media = suma/10.0;
		System.out.println("La media es:"+ media);
		
	}

}
