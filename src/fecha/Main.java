package fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int N = 0;
		int G, G2, G3;
		Scanner sc = new Scanner(System.in);
		Scanner qd = new Scanner(System.in);
		LocalDate diaHoy = LocalDate.now();
		Datos D = new Datos();
		int vector[] = new int[3];

		do {
			System.out.println("*****************************");
			System.out.println(" 1)_Registro dia, mes , año");
			System.out.println(" 2)_Impresion");
			System.out.println(" 3)_Salir");
			System.out.println("*****************************");
			N = sc.nextInt();

			if (N == 1) {
				System.out.println("Ingrese dia");
				G = qd.nextInt();
				vector[0] = G;

				System.out.println("Ingrese mes");
				G2 = qd.nextInt();
				vector[1] = G2;
				
				System.out.println("Ingrese año");
				G3 = qd.nextInt();
				vector[2] = G3;
			}
			if (N == 2) {
//				for (int i = 0; i < vector.length; i++) {
				System.out.println("El dia ingresado es:");
				System.out.println(vector[0] + "/" + vector[1] + "/" + vector[2]);
				System.out.println("El dia actual es: ");
				System.out.println(diaHoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

				// }

			}

		} while (N != 3);

	}

}
