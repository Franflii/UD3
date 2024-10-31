package ud3;

import java.util.Scanner;

public class Act6Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una palabra: ");
		
		String palabra = sc.next();
		String palabraFinal = "";
		
		// el .lenght nos dice el número de digitos que tenemos y empieza por el final
		for(int i = palabra.length()-1; i>=0 ;i--) {
			
			String caracter = palabra.substring(i, i+1);
			
			palabraFinal = palabraFinal + caracter;
		}
		
		// al ser un string para decir que es igual a otra cosa 
		//usamos .equals porque no son números no podemos usar operadores
		if(palabra.equalsIgnoreCase(palabraFinal)) {
			System.out.println("Es una palabra palíndroma");
		}
		else {
			System.out.println("No es una palabra palíndroma");
		}
		

	}

}
