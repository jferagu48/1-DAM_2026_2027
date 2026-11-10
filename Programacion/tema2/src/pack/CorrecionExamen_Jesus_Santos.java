package pack;
import java.util.Scanner;
public class CorrecionExamen_Jesus_Santos {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int edad;
		double precio,preciocarnet,precio18,precio65,precioJubilacion,precioF;
		System.out.println("Dime tu edad");
		edad = sc.nextInt();
		System.out.println("Dime el precio del producto");
		precio = sc.nextDouble();
		preciocarnet = precio * 0.10;
		precio18 = precio * 0.05;
		precio65 = precio *0.08;
		preciojubulacion = precio *0.11;
		if(edad<18) {
			System.out.println("Tienes carnet de estudiante");
			boolean carnet = sc.nextBoolean();
			if(carnet == true) {
				precioF = precio((precio*precio18)+(precio*preciocarnet));
				System.out.println("El precio inicial del producto es de:" + precio);
				System.out.println("El precio con descuento es de:" + precio);

		}
				}
		else {
			precioF = (precio-(precio*precio18);
			System.out.println("El producto sin descuento es de" + precio);
			System.out.println("El precio con descuento es de" + precioF);
		}
		

	}

}
