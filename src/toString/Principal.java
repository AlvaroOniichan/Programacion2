package toString;

public class Principal {

	public static void main(String[] args) {// java es inmutable no modificado

		int a = 10;
		int b = 20;
		int c = 30;
		int resultado;
		if (a > b) {
			resultado = a;
		} else {
			resultado = b;
		}
		resultado = (a > b) ? a : b;
		System.out.println(resultado);

	}
}
