package formFecha;

import java.util.Scanner;

public class Main extends Fecha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("****** MENU ******");
			System.out.println(" 1) Ingreso por cadena");
			System.out.println(" 2) ingreso por dia,mes,año");
			System.out.println(" 3) salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				opcuno();
				break;
			case 2:
				opcdos();
				break;
			}
		} while (opc != 3);

	}

}
