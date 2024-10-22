package ud3;

import java.util.Random;
import java.util.Scanner;

public class ActPag18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int aleatorio1;
		int aleatorio2;
		int suma;
		int aciertos = 0;
		
		do {
			aleatorio1 = random.nextInt(100)+1;
			aleatorio2 = random.nextInt(100)+1;
			System.out.printf("%d + %d = ",aleatorio1,aleatorio2);
			suma = sc.nextInt();
			
			if(aleatorio1+aleatorio2 == suma) {
				aciertos++;
				System.out.println("Enhorabuena");
			}
		}
		while(aleatorio1+aleatorio2 == suma);
			System.out.printf("Has acertado %d veces",aciertos);
		
		}

}
