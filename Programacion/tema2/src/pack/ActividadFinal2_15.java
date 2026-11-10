
package pack;

import java.util.Scanner;

public class ActividadFinal2_15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la base");
		double base= sc.nextDouble();
		
		// Aqui estamos preguntado que si la base es negativo que nos de un new number sino continuamos
		if(base < 0) {
			System.out.println("La base no puede ser negativa, introduce la base de nuevo");	
			base= sc.nextDouble();
		}
		//Arremos lo mismo con altura para comprobar que el numero que nos esta dando no es negativo
		System.out.println("Introduce la altura");
		double altura= sc.nextDouble();
		
		
		// Aqui estamos preguntado que si la base es negativo que nos de un new number sino continuamos
		if(base < 0) {
			System.out.println("La altura no puede ser negativa, introduce la altura de nuevo");
			
			altura= sc.nextDouble();
			
		}
		double area = (base*altura/2);
		
		System.out.println("El area del triangulo es " + area);
		
		
		
	}

}
