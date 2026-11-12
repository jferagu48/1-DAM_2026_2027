import java.util.Scanner;
public class EjercicioDorsales_Tablasindicador {

	public static void main(String[] args) {
	
		/*int numdorsales[], n;
		numdorsales= new int [5];
		for (int i=0; i< 5; i++) {
		System.out.println("Introduce un nuevo numero de dorsal");
		n=sc.nextInt();
		numdorsales [i]= n;
		int nuevodorsal=i++;
		}
		System.out.println("Listado de dorsales es:"+ numdorsales[5]);*/
		
		Scanner sc= new Scanner (System.in);
		int seguir, dorsal;
		int dorsales[]= new int [5];
		int numCorredores= 0;
		do {
			if(numCorredores < 5) {
				System.out.println("Introduce nuevo dorsal:");
				dorsal= sc.nextInt();
				dorsales[numCorredores]= dorsal;
				for (int i=0; i<=numCorredores; i++) {
					System.out.println("Dorsal "+ i+" "+ dorsales[i]);	
				}
				numCorredores++;
			}
			else {
				System.out.println("No caben mas dorsales");
			}
			System.out.println("Desea Introducir un nuevo dorsal (0/1):");
			seguir= sc.nextInt();
			
		} while(seguir==1);
		
	}

}
