package reto;


public class funciones3 {

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int dividir(int a, int b) {
		if (b<0) {
			return 0;
		}
		return a / b;
	}
	public static boolean EsPositivo(int n) {
		if (n>=0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean EsNegativo(int n) {
		if (n<0) {
			return true;
		} else {
			return false;
		}
	}
}
