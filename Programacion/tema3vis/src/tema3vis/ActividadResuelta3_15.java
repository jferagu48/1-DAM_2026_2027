package tema3vis;
import java.util.Scanner;
public class ActividadResuelta3_15 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Escribe un numero n:");
	int n= sc.nextInt();
	for(int fila=1; fila <= n; fila++) {
		for(int columna = fila; columna <= n; columna++) {
		System.out.println("* ");
	}
		System.out.println("");
	}
}
}
