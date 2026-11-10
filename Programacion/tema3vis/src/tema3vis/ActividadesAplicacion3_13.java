package tema3vis;
import java.util.Scanner;
public class ActividadesAplicacion3_13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escribe la hora:");
	int horas= sc.nextInt();
	System.out.println("Escribe la minutos:");
	int minutos= sc.nextInt();
	System.out.println("Escribe la segundos:");
	int segundos= sc.nextInt();
	
	System.out.println("Cuantos segundos quieres implementar:");
	int incremento= sc.nextInt();
	
	horas=(horas*3600);
	minutos =(minutos*60);//Aqui tenemos ambos ya en segundos por lo tanto podemos sumarlos
	int sumatorio=(horas+minutos+segundos);
	
	int total= (incremento + sumatorio);
		total= total % 86400;//Reseteamos el dia ya que 1 dia tiene 86400s
		
		horas= (total/3600);
		total=(total%3600);
		minutos=(total/60);
		total=(total%60);
		segundos= total;
		
		System.out.print("La hora ha aumentado a:");
		
		if(horas<10) {
			System.out.print("0"); 
		}
		System.out.print(horas);
		System.out.print(":");
			
		if(minutos<10) {
			System.out.print("0"); //Ejem. minutos 5 para no salir:5 saldra antes el :05 y si es mayor que 10 el if no ejercerea
		}
		System.out.print(minutos);
		System.out.print(":");
		
		if(segundos<10) {
			System.out.print("0"); 
		}
		System.out.print(segundos);

			
	} 
	
	
}



