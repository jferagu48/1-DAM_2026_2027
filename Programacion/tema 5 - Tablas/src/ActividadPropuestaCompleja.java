import java.util.Arrays;
import java.util.Scanner;

public class ActividadPropuestaCompleja {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        
        int t[] = new int[0];          // la tabla empieza vacía
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:  // Inserción
                    menuInsercion(t);
             		
                    break;
                /*case 2:  // Modificación
                    modificar(sc, t);
                    break;
                case 3:  // Búsqueda
                    // pedir valor, llamar a buscar(), mostrar resultado
                    break;
                case 4:  // Eliminar
                    // pedir valor, t = eliminar(t, valor)
                    break;
                case 5:  // Listar
                    System.out.println(Arrays.toString(t));
                    break;
                case 6:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");*/
            }
        } while (opcion>6 || opcion<1);
    }
	public static void mostrarMenu() {
		System.out.println("Menu:");
		System.out.println("1.Insercion");
		System.out.println("2.Modificacion");
		System.out.println("3.Busqueda");
		System.out.println("4.Eliminar");
		System.out.println("5.Listar");
		System.out.println("6.Salir");
		System.out.println();
		System.out.println("Introduce el numero para el modo que quieres utilizar:");
	}
	public static void menuInsercion(int t[]){
		int opcion;
		int insertar;
		do {
			System.out.println("Submenu:");
			System.out.println("1.1.Al inicio");
			System.out.println("1.2.Posicion Especifica");
			System.out.println("1.3.Al final");
			System.out.println("Introduce el modo que quieres utilizar:");
			opcion= sc.nextInt();
			
			}while(opcion>3||opcion<1);
		switch (opcion) {
		case 1:
			insertar= insertarInicio(t[]);
			
		}

	}
	public static int[] insertarInicio(int t[]) {
	System.out.println("Introduce un valor:");
	int valor= sc.nextInt();
	t[t.length]=6;
	return t[t.length];
	}
		
}
	


