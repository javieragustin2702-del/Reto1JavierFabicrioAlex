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
				System.out.println("Elige la operación:\n0. Salir\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Par\n6. Impar\n7. Positivo\n8. Negativo\n9. Máximo de 3\n10. Mínimo de 3\n");
				opciones = Integer.parseInt(sc.nextLine());
				switch (opciones) {
				case 0: 
					salir = false;
					break;
				case 1: 
					System.out.println("Escribe 2 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones2.sumar(num1, num2));
					break;
				case 2:
					System.out.println("Escribe 2 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones2.restar(num1, num2));

					break;
				case 3:
					System.out.println("Escribe 2 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones3.multiplicar(num1,num2));
					break;
				case 4:
					System.out.println("Escribe 2 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones3.dividir(num1,num2));
					break;
				case 5: 
					System.out.println("Escribe un número");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones2.esPar(num1));
					break;
				case 6:
					System.out.println("Escribe un número");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones2.esImpar(num1));

					break;
				case 7:
					System.out.println("Escribe un número");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones3.EsPositivo(num1));
					break;
				case 8:
					System.out.println("Escribe un número");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones3.EsNegativo(num1));
					break;
				case 9:
					System.out.println("Escribe 3 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					num3 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones1.maximo3(num1, num2, num3));
					break;
				case 10:
					System.out.println("Escribe 3 números");
					num1 = Integer.parseInt(sc.nextLine());
					num2 = Integer.parseInt(sc.nextLine());
					num3 = Integer.parseInt(sc.nextLine());
					System.out.println(funciones1.minimo3(num1, num2, num3));
					break;
				default:
					System.out.println("que me des un número del 0 al 10");
				}
			} catch (Exception e) {
			}
		} while (salir != false);
		
	}

}
