
public class EjercicioCuadradoRectanguloFunciones {

	static double calcularArea(double lado) {
		double resultado= lado*lado;
		return resultado;
	}
		
	static double calcularArea(double base, double altura) {
		double area= base* altura;
		return area;
	}
	
	public static void main(String[] args) {
		double lado, base, altura, cuadrado, rectangulo;
		lado=5;
		altura= 10;
		base= 6;
		rectangulo= calcularArea(base, altura);
		System.out.println("El area de un Rectangulo es:" + rectangulo);
		cuadrado= calcularArea(lado);
		System.out.println("El area de un Cuadrado es:" + cuadrado);
		

	}

}
