package tema3vis;
import java.util.Scanner;
public class ActividadesAplicacion3_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un Numero:");
		int n= sc.nextInt();
		String binario ="";
		while(n>0) {
			int resto =(n % 2);
			binario= (resto + binario);
			//mandamos el binario hacia la izquierda
			//El nuevo binario es: primero el resto, y después todo lo que binario ya tenía.
			n = (n/2);
		}
		System.out.println(binario);
		

	}

}
