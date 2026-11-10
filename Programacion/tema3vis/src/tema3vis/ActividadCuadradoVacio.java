package tema3vis;

import java.util.Scanner;

public class ActividadCuadradoVacio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero n:");
		int n=sc.nextInt();
		for(int fila=1; fila <= n;fila++) {
		
			for(int columna=1; columna <= n; columna++) {
			
			if (fila==1|| fila==n||columna==1||columna==n) {
				System.out.print("* ");	
			}
			else {System.out.print("  ");}
		
			}
			
			System.out.println("");
		}
	}

}
