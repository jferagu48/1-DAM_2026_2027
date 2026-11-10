import java.util.Scanner;

public class ActividadAplicacion4_15 {
	
	static int distanciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		int h1= hora1*60;
		int h2= hora2*60;
		int instancia1= h1+minuto1;
		int instancia2= h2+minuto2;
		int calculo= instancia1 - instancia2;
		return(calculo);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int hora1, hora2,minuto1,minuto2;
		int diferencia;
		System.out.println("Introduce primera hora:");
		hora1=sc.nextInt();
		System.out.println("Introduce primeros minutos:");
		minuto1=sc.nextInt();
		System.out.println("Introduce segunda hora:");
		hora2=sc.nextInt();
		System.out.println("Introduce segundos minutos:");
		minuto2=sc.nextInt();
		
		diferencia=distanciaMin(hora1, minuto1, hora2, minuto2);
		System.out.println("Los minutos de diferencia que existen entre "+ "(h= "+hora1+" m= "+minuto1+")"+"(h= "+hora2+" m= "+minuto2+")"+" es de "+diferencia+" minutos");
		
	}

}
