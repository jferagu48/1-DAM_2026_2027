package tema3vis;
import java.util.Scanner;
public class ActividadResuelta3_8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;//cada dato introducido por el usuario
		int suma = 0;//acumulara la suma de todos los numeros introducidos
		double media;
		for(int i= 1;i<=10; i++ ) {
			System.out.println("Escribe un numero:");
			n= sc.nextInt();
			suma += n;//suma +n
		}
		media= suma/10.0;//Calcularemos la media
		System.out.println("La media es:"+ media);

	}

}
