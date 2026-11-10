package tema3vis;

import java.util.Scanner;
public class ActividadesAplicacion3_12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un Numero:");
		int binario= sc.nextInt();
		int decimal= 0;// va a ser nuestra variable que acumule los resultados
		int potencia= 1;//2^0
		while(binario>0) {
			int digito = binario % 10;
				decimal= (decimal+ digito *potencia);
				potencia= potencia*2;
				binario= binario/10;
			}
		System.out.println(decimal);
		}
	

	}


