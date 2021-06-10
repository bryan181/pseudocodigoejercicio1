import java.util.*;
public class ejercicio1 {
public static void main(String args[]) {
		int contador, n, ni;
		System.out.println("CUANTOS NUMEROS ALEATORIOS DESEA GENERAR: ");
		contador = 1;
		ni = 0;
		Scanner scanner = new Scanner(System.in);


		System.out.print("numeros aleatorios: ");
		n = scanner.nextInt();
		System.out.print("Núumeros generados:");

		while (contador<=n) {
			contador++;
			ni = (int)(Math.random()*100)+1;

			if (ni % 2 == 0) {
				System.out.println(ni+" es par.");
			} else {
				System.out.println(ni+" es impar.");
			}
		}
	}
}
