package ud3;

import java.util.Scanner;

public class ActPag28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		do {
			System.out.println("Dime un numero positivo: ");
			 num = sc.nextInt();

		} while (num <= 0);

		while (num > 0) {
			int digito = num % 10;
			System.out.println(digito);
			num = num / 10;
		}

	}

}
