package pack;

import java.util.Scanner;

public class ActividadResuelta2_10a {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la nota");
		int nota = sc.nextInt();
		
		if (0<=nota && nota< 5){//Aqui decimos que si nota es mayor = que 0 y menos que 5: <=4
			System.out.println("Suspenso");	
		} 
		else if (nota==5) {
			System.out.println("Aprobado");
			
		}
		else if (nota == 6) {
			System.out.println("Bien");
			
		}
		else if (nota >= 7 && nota <= 8) {
			System.out.println("Notable");
		}
		else if(nota >= 9 && nota <=10){
			System.out.println("Sobresaliente");
		}
		else {
			System.out.println("Nota no valida");
		}
	}
}
