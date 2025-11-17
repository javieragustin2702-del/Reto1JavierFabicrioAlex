package reto;



public class funciones1 {
	
	public static int maximo3(int num1, int num2, int num3) {
		int mayor1 = Math.max(num1, num2);
		int mayor2 = Math.max(mayor1, num3);
		return mayor2;
	}

	public static int minimo3(int num1, int num2, int num3) {
		int menor1 = Math.min(num1, num2);
		int menor2 = Math.min(menor1, num3);
		return menor2;
	}


}
