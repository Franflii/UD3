package ud3;

import java.util.Scanner;

public class Act1Moodle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        
        String resultado = "";  
        
        for (int i = 0; i < cadena.length(); i++) {
            String caracter = cadena.substring(i, i + 1);
            
            if (caracter.equals(caracter.toUpperCase())) {
                resultado = resultado + caracter.toLowerCase();
            } 
            else {
                resultado = resultado + caracter.toUpperCase();
            }
        }
        
        System.out.println("Resultado: " + resultado);

	}

}
