package pack;

import java.util.Scanner;

public class ActividadResuelta2_10b {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce la nota");
		int nota = sc.nextInt();
		
		switch (nota) {// Con switch va ir buscando ese valor hasta que lo encuentre y te muestre el bloque
		case 1,2,3,4 ->
		System.out.println("Suspenso");
		
		case 5 ->
		System.out.println("Aprobado");
		
		
		case 6 ->
		System.out.println("Bien");
		
		case 7,8 ->
		System.out.println("Notable");
		
		case 9,10 ->
		System.out.println("Sobresaliente");
		
		default ->
		System.out.println("Nota no valida");
		
		}
		
	}


}
