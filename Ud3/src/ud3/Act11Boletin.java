package ud3;

import java.util.Scanner;

public class Act11Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int meses = 20;	
		int totalPagado = 0;
		int pagoMensual = 10;
		
		for(int mes = 1; mes <= meses; mes++) {
			System.out.println("Mes " + mes + ": " + pagoMensual + " euros");
			
			totalPagado = totalPagado + pagoMensual;
			
			pagoMensual = pagoMensual * 2;
		}
		
		System.out.println("Total pagado después de 20 meses: " + totalPagado + " euros");

	}

}
