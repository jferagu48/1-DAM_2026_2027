package tema3vis;
import java.util.Scanner;
public class ActividadPropuesta3_3 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int numero;
	do {
		System.out.println("Introduce un numero positivo:");
		numero= sc.nextInt();
		if(numero<=0) {//Aqui estamos negando la posibilidad de numero negativo
			System.out.println("Error el numero no es positivo");
		}
	}//Una vez se cumpla que sea positivo continua con el while en caso contrario no parara hasta que le des el n positivo
		while(numero<=0); //While se termina cuando es false
			System.out.println("Has introducido el"+ " " +numero);
		
	//Este apartado es la descomosicion de Numero
	int u= (numero%10);
	numero= (numero/10);
	int d= (numero%10);
	numero=(numero/10);
	int c= (numero%10);
	
	System.out.println(u);
	System.out.println(d);
	System.out.println(c);
	
	
}
}