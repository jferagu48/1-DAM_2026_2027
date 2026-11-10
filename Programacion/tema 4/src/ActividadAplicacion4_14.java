import java.util.Scanner;
public class ActividadAplicacion4_14 {

	static int segundostotales(int d, int h, int m) {
		int dia= d*86400;
		int horas= d*3600;
		int minutos= m*60;
		int suma=(dia + horas + minutos);
		return (suma);
	}
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int d, h, m;
	int segundosT;
	System.out.println("Introduce el numero de dia:");
	d=sc.nextInt();
	System.out.println("Introduce el numero de horas:");
	h=sc.nextInt();
	System.out.println("Introduce el numero de minutos:");
	m=sc.nextInt();
	
	segundosT=segundostotales(d,h,m);
	System.out.println("Los segundos totales de "+"Dias: "+ d+","+"Horas: "+ h + ","+"Minutos: "+ m +" = "+ segundosT+"s");
	}

}
