  package ud3;

import java.util.Scanner;

public class Act3Boletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine(); // Leer la frase completa

        // Eliminar espacios al inicio y al final
        frase = frase.trim();

        int contador = 0;

        // Contar palabras usando for
        for (int i = 0; i < frase.length(); i++) {
            // Si encontramos un espacio y no estamos en el inicio, incrementamos el contador
            if (frase.charAt(i) == ' ' && i > 0 && frase.charAt(i - 1) != ' ') {
                contador++;
            }
        }

        // Contamos la última palabra si la frase no está vacía
        if (frase.length() > 0) {
            contador++;
        }

        // Mostrar el resultado
        System.out.println("La frase tiene " + contador + " palabras.");
        
	}
	
}