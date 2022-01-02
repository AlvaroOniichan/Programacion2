package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int N = 0;
		int A = 0;
		int A2 = 0;
		String OP;
		int T = 0;
		boolean T1;

		int num, f1, f2, i;

		do {
			System.out.println("*****************************");
			System.out.println(" 1) Operaciones con numeros ");
			System.out.println(" 2) Operaciones con vectores ");
			System.out.println(" 3) Operaciones con matrices ");
			System.out.println(" 4) salir ");
			System.out.println("*****************************");
			N = sc.nextInt();
			if (N == 1) {
				System.out.println("*****************************");
				System.out.println(" 1) Operaciones aritmeticas ");
				System.out.println(" 2) Operaciones logicas ");
				System.out.println(" 3) Operaciones especiales (Fibonacci) ");
				int x = sc.nextInt();
				switch (x) {
				case 1:
					System.out.println(" CALCULADORA ARITMETICA");
					System.out.println("INGRESE 1ª NUMERO ");
					A = sc.nextInt();
					System.out.println("INGRESE 2ª NUMERO ");
					A2 = sc.nextInt();
					System.out.println("Que operacion desea realizar ?  + ; - ; * ; / : ");
					OP = sc1.nextLine();

					if (OP.equals("+")) {
						T = A + A2;
						System.out.println(T);
					}
					if (OP.equals("-")) {
						T = A - A2;
						System.out.println(T);
					}
					if (OP.equals("*")) {
						T = A * A2;
						System.out.println(T);
					}
					if (OP.equals("/")) {
						T = A / A2;
						System.out.println(T);
					}
					break;
				case 2:
					System.out.println("INGRESE 1ª NUMERO ");
					A = sc.nextInt();
					System.out.println("INGRESE 2ª NUMERO ");
					A2 = sc.nextInt();
					if (A > A2) {
						System.out.println(A + " es mayor que  " + A2);
					}
					if (A < A2) {
						System.out.println(A + " es menor que  " + A2);
					}
					if (A == A2) {
						System.out.println(A + " es igual que  " + A2);
					}

					break;

				case 3:
					do {
						System.out.print("Introduce numero mayor que 1: ");
						num = sc.nextInt();
					} while (num <= 1);
					f1 = 1;
					f2 = 1;
					System.out.print(f1 + " ");
					for (i = 2; i <= num; i++) {
						System.out.print(f2 + " ");
						f2 = f1 + f2;
						f1 = f2 - f1;
					}
					System.out.println();
					break;
				}
			}

		} while (N != 4);

	}

}
