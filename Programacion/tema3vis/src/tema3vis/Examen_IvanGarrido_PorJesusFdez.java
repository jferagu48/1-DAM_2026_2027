package tema3vis;
import java.util.Scanner;
public class Examen_IvanGarrido_PorJesusFdez {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int altura;
		do {
			System.out.print("Introduce la altura del triangulo (entero > 0):");
			altura= scan.nextInt();
		}while(altura < 1);
		for (int i=1; i<=altura; i++) {
			for(int j= num-1; j>=i; j--) {//Programa perfecto sale la figura, pero num no existe entiendo que queria poner altura.
			System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if (j==1||j==i||i==altura) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		scan.close();
	}

}

