import java.util.Scanner;

public class FuncionSuma {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		do {
		System.out.println("Introduce el primer numero:");
		a = sc.nextInt();
		} while(a<=0);
		do {
			System.out.println("Introduce el segundo numero:");
			b = sc.nextInt();
		}while(b<=0);
		suma(a,b);
}
	
	static void suma(int a,int b) {
	
			int operacion= a + b;
		System.out.println("La suma de "+a+"+"+b+"="+ operacion);
	}
}
