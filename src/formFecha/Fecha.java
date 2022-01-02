package formFecha;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fecha {
	static int G;
	static int G2;
	static int G3;
	static int vector[] = new int[3];

	static Scanner qd = new Scanner(System.in);
	static Opcionu opc1 = new Opcionu();

	public static void opcuno() {
		System.out.println("ingrese fecha en formato dd/mm/aa");
		int g = qd.nextInt();
		int g1 = qd.nextInt();
		int g2 = qd.nextInt();
//		LocalDate fechaEspecifica = LocalDate.of(g,g1,g2);
//		System.out.println(fechaEspecifica.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		opc1.setDia(g);
		opc1.setMes(g1);
		opc1.setAnio(g2);
		System.out.println(opc1);
	}

	public static void opcdos() {
		System.out.println("Ingrese dia");
		G = qd.nextInt();
		if (G <= 31) {
			vector[0] = G;
			
			System.out.println("Ingrese mes");
			G2 = qd.nextInt();
			if (G2 <= 12) {
				vector[1] = G2;

				System.out.println("Ingrese año");
				G3 = qd.nextInt();
				vector[2] = G3;

				System.out.println(vector[0] + "/" + vector[1] + "/" + vector[2]);
			} else {
				System.out.println("MES MAL INGRESADO");
			}

		} else {
			System.out.println("DIA MAL INGRESADO");
		}

	}
}
