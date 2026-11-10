package pack;

import java.util.Scanner;

public class ActividadAplicacion2_11 {
	
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Introduce un numero ");
	
	int numero= sc.nextInt();
	
	int u = (numero%10);
	
	numero= (numero/10);
	
	int d =(numero%10);
	
	numero= (numero/10);
	
	int c= (numero%10);
	
	int m = (numero/10);
	
if((m==u && c==d)||(c==u)||(d==u)) {
	System.out.println("Este numero es capicua ");
}

else {
	System.out.println("No es capicua");
}

	
	

}
}