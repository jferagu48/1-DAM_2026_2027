package pack;

import java.util.Scanner;

public class ActividadFinal2_16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular su valor absoluto");
		
		int numero = sc.nextInt();
		
		int absoluto= numero >= 0 ? numero : -numero;
		
		System.out.println("El valor absoluto es " + absoluto);
		

	}

}
