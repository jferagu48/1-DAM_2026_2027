import java.util.Scanner;

public class CreacionFuncion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el numero de veces que quieres saludar:");
		int n= sc.nextInt();
		variosSaludos(n);//Lo asocia a raiz de aqui
	}
		static void variosSaludos(int veces) {//(Definimos el tipo de dato en el parentesis)
			System.out.println("Voy a saludar varias veces");
			for(int i=0; i<veces;i++) {//int veces se va asociar a el valor de nuestra variable=n(numero introduccido) de nuestro main
				System.out.println("Hola");
			}
		}

}


