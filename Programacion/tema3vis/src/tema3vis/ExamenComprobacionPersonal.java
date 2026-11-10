package tema3vis;

import java.util.Scanner;

public class ExamenComprobacionPersonal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduce el recibo...");
			num= sc.nextInt();
			
			if(num % 10==0) {
				for(int billete50=1; billete50<=num; billete50++) {
					for(int billete20= 1; billete20<=billete50;billete20++) {
						for(int billete10= 1; billete10<=billete20;billete10++) {
							System.out.println(billete10 + "billete de 10");
						}
						System.out.println(billete20 + "billete de 20");
					}
					System.out.println(billete50 + "billete de 20");
				}
			}
			 
			
		}while(num>0);
		
	}

}
