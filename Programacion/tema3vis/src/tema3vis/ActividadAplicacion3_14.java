package tema3vis;
import java.util.Scanner;
public class ActividadAplicacion3_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean esPrimo= true;//Ponemos true para que nos etre el valor en nuestro for
		int n;
		do {
			System.out.println("Introduce un Numero:");
			n =sc.nextInt();
		}
		while (n<=0);//Aqui validamos si el numero es positivo ya que n va a ser mayor que 0
		for (int i=1; i<=n; i++) {
			//Si es primo
			esPrimo=true;
			for(int j=2; j<i && esPrimo; j++) {//Aqui realizamos la operacion de ejm i=10 cogemos el 10 y lo dividimos entre j que j va a ser nuestro 10-1 osea 9 en el primer caso asi va a proceder consecutivamente hasta llegar al dividor 2,o si encontramos que es primo
				
				if(i % j == 0) { //Aqui conseguimos averiguar si es primo haciendo i=10 %(resto) j=9 en el primer caso del bucle, en el momento que el resto(%) sea = 0 es PRIMO
					esPrimo=false;
				}
				
			}
			if(esPrimo) {
				System.out.println(i+"Es Primo");
				
			}else {
				System.out.println(i+"No es Primo");	
			}
		}
		
		
	}

}
