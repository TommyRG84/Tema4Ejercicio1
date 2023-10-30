import java.util.Scanner;

public class EjercicioSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la primera cifra que quieras sumar: ");
		double cifra1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Introduce la segunda cifra que quieras sumar: ");
		double cifra2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("El resultado de la suma es " + (cifra1 + cifra2));
	}

}
