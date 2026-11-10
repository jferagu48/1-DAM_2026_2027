
public class ActividadResuelta4_9 {
	
	static int maximo (int a, int b) {
		int max;
		if(a>b) {
			max=a;
		}
		else {
			max=b;
		}
		return(max);
	}
	static int maximo (int a, int b, int c) {
		int auxiliar= maximo (a,b);
		return(maximo(auxiliar, c));
	}
	public static void main(String[] args) {
		int resultado= maximo(2,9,7);
		System.out.println("El mayor es: " + resultado);
	}

}
