import java.util.Scanner;
public class ActividadAplicacion4_12 {

	static double distancia(double x1, double y1, double x2, double y2) {
		double tramo1= Math.pow(x1-x2, 2);
		double tramo2= Math.pow(y1-y2, 2);
		double distancia= Math.sqrt(tramo1 + tramo2);
		return(distancia);
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double x1, x2, y1, y2;
	double resultadodistancia;
	System.out.println("Introduce x1:");
	x1=sc.nextDouble();
	System.out.println("Introduce x2:");
	x2=sc.nextDouble();
	System.out.println("Introduce y1:");
	y1=sc.nextDouble();
	System.out.println("Introduce y1:");
	y2=sc.nextDouble();
	resultadodistancia=distancia(x1,y1,x2,y2);
	System.out.println("La distancia euclidea de los valores "+"( "+ x1+","+ x2+")"+ "( "+ y1+","+ y2+")"+" = "+ resultadodistancia);;
	

	}

}
