import java.util.Scanner;
public class ActividadResuelta4_8 {
	
	static double calculadora(double a, double b, int operacion) {
	double result=0;
	switch (operacion) {
	case 1:
		result=a+b;
		break;
	case 2:
		result=a-b;
		break;
	case 3:
		result= a * b;
	case 4:
		result=a/b;
		break;
	default:
		System.out.println("Operacion no valida.");
	}
	return (result);
	}
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double calcu, a, b;
	int operacion;
	do {
		System.out.println("Introduce la operacion que quieres realizar:");
		System.out.println("1- Sumar");
		System.out.println("2- Restar");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		operacion=sc.nextInt();
	} while(operacion > 4);
		System.out.println("Introduce el primer numero:");
		a=sc.nextDouble();
		System.out.println("Introduce el segundo numero:");
		b=sc.nextDouble();
	
	calcu= calculadora (a,b, operacion);
	System.out.println("El resultado de la operacion "+a+" "+b+" "+"= "+ calcu);

	}

}
