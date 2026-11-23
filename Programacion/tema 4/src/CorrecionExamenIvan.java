import java.util.Scanner;
public class CorrecionExamenIvan {

	static final Scanner scam = new Scanner (System.in);

	
	public static void main(String[] args) {
	int entero=pedirEntero();
	esPerfecto(entero);
	}
	 static int pedirEntero() {
		 int e;
		 do {
			 System.out.print("Introduce un entero positivo(<0):");
			 e=scam.nextInt();
		 }while(e<1);
		 return e;
	 }
	 static void esPerfecto(int e) {
		 int sumDivisores=0;
		 for(int i=1;i<e;i++) {
			 if (e%i==0) {
				 sumDivisores+=i;
			 }
		 }
			 if (sumDivisores==e){
				 System.out.printf("%d es un numero perfecto.La suma de sus divisores es %d.%n",e,sumDivisores);
			 }
			 else if(sumDivisores>e) {
				 System.out.printf("%d es un numero abundante.La suma de sus divisores es %d.%n",e,sumDivisores);
			 }
			 else {
				 System.out.printf("%d es un numero defectuoso.La suma de sus divisores es %d.%n",e,sumDivisores);
			 }
		 }
	 }

	


