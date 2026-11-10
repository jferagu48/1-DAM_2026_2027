package tema3vis;
import java.util.Scanner;
public class ActividadResuelta3_9 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num;
	do {
	System.out.println("Introduzca un numero del 1 al 10:");
	num= sc.nextInt();
	}
	while(!(1<= num && num<=10));
	System.out.println("\n\nTabla del"+ ""+num);
	for(int i = 1; i<=10;i++) {
		System.out.println(num+ "x"+ i + "="+ num*i);
	}
	}

}
