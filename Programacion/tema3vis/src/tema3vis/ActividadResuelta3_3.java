package tema3vis;
import java.util.Scanner;
public class ActividadResuelta3_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numSecreto =(int) (Math.random() * 100 + 1 );
		System.out.println("Introduce un numero entre 1 y 100:");
		int num= sc.nextInt();
		while (numSecreto != num && num != -1) {
			if(numSecreto < num) {
				System.out.print("El numero secreto es menor\n");
			}
			else {
				System.out.println("El numero secreto es mayor");
			}
			
		System.out.println("Introduce otro numero:");
		num = sc.nextInt();
		}
			if(numSecreto== num){
				System.out.println("Enhorabuena");
		}
			else { 
				System.out.println("Otra vez sera");
			}
	}
	

}

