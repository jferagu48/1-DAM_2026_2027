package tema3vis;
import java.util.Scanner;
public class ActividadResuelta3_5 {

	public static void main(String[] args) {
	int resultado,operando1,operando2;
	int numoperaciones=0;
	do {
		operando1= (int)(Math.random()*100+1);
		operando2= (int)(Math.random()*100+1);
		System.out.println(operando1 + "+"+operando2 +"=" );
		resultado=new Scanner (System.in).nextInt();
		numoperaciones++;//Incrementa el numero de operaciones realizadas
	}
	while (resultado==operando1 + operando2);//Si el resultado es igual a operando1 + operando2 vuelve al do por lo que nos vuelve a generar una operacion
	System.out.println("A conseguido realizar"+ " "+(numoperaciones-1)+ " "+"suma consecutivas");
	}

}
