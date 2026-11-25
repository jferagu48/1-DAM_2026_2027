import java.util.Arrays;
import java.util.Scanner;
public class ActividadPropuestaCompleja {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        
        int t[] = new int[0];          // la tabla empieza vacía
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:  // Inserción
                    t = menuInsercion(t);
                    break;
                case 2:  // Modificación
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
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);
    }
	public static int menuInsercion(t) {
		int opcion;
		do {
			mostrarSubmenu();
			opcion= sc.nexInt();
			
			switch(opcion) {
			case 1:
				
				
			}
		}
		
		
	}
	
}

