package reto;

import java.util.Locale;
import java.util.Scanner;
import reto.funciones1;
import reto.funciones2;
import reto.funciones3;

public class reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		boolean salir = true;
		int opciones = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		do {
			try {
				System.out.println("Elige la operación:\n 1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Par\n6. Impar\n7. Positivo\n8. Negativo\n");
				opciones = Integer.parseInt(sc.nextLine());
				switch (opciones) {
				case 0: 
					salir = false;
					break;
				case 1: 
					System.out.println("Escribe 2 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					break;
				case 2:
					
				default:
				}
			} catch (Exception e) {
			}
		} while (salir != false);
		salir = true;
		
	}

}
