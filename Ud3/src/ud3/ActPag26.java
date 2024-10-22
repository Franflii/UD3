package ud3;

import java.util.Scanner;

public class ActPag26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Dime un numero: ");
			num = sc.nextInt();
		}while (num<=0 || num>=10);
			System.out.println("La tabla del "+num);
			
		for(int i = 1; i<=10; i++) {
			System.out.println(num + "X" + i + "=" + num*i);
		}
		}

}
