import java.util.Scanner;
public class EjercicioRecursividadMultiplicar2 {

	static int multiplicar(int a, int b ) {
	int resultado;
	if(b==0) {
		resultado=0;
	}
	else {
		resultado= a + multiplicar(a,b-1);
	}
	return resultado;
	}
	
	
	public static void main(String[] args) {
	int resultado,a,b;
	Scanner sc= new Scanner (System.in);
	System.out.println("Introduce dos numeros:");
	a=sc.nextInt();
	b=sc.nextInt();
	resultado= multiplicar(a,b-1);
	System.out.println(resultado);

	}

}
