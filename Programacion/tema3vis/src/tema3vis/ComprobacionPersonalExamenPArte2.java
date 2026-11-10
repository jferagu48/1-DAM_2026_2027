package tema3vis;
import java.util.Scanner;
public class ComprobacionPersonalExamenPArte2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int altura;
		int impar= 0;
		do {
			System.out.println("Introduce la altura:");
			altura= sc.nextInt();
		}while(altura<0);
		
		for(int i =1; i<=altura; i++) {
			for(int j=1; j<=impar; j++) {
				for(int k= 1; k<=impar;k--) {
					System.out.print("-");
				}
				
			}
		}

	

}
}
