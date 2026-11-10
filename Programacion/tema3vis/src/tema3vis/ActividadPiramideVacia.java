package tema3vis;

import java.util.Scanner;

public class ActividadPiramideVacia {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero n:");
		int impar=1;
		int altura=sc.nextInt();
		
		for (int fila= 1; fila <= altura;fila++) {
			
			for(int columna1=1; columna1<=altura-fila;columna1++) {//Espacios en blanco
				System.out.print(" ");
			}
			
			for (int columna2=1 ; columna2<=impar;columna2++) {
				if(columna2==1||columna2==fila||fila==altura||fila==2||columna2==4) {
					System.out.print("*");
				}
			} 
			impar+=2;
			System.out.println("");
		}

	}

}
