package tema3vis;

import java.util.Scanner;

public class ActividadRectangulo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero n:");
		int n=sc.nextInt();
		int m= n*2;
		
		for(int fila=1; fila <= n;fila++) {
		
			for(int columna=1; columna <= m; columna++) {
				System.out.print("* ");
			
			}
			System.out.println("");
		}

	}

}
