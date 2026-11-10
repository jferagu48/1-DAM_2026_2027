package tema3vis;
import java.util.Scanner;
public class ActividadResuelta3_4 {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int etiquetaArbolMasAlto; //Numero identificativo de que arbol es mas alto
		int alturaArbolMasAlto;//altura de arbol mas alto
		int etiqueta= 0; //Numero identificativo(Referencia) de arbol que piden los datos
		int altura; //La altura del del arbol que piden los datos 
		
		System.out.println("Altura del arbol ("+ etiqueta +"): ");
		altura= sc.nextInt();
		alturaArbolMasAlto = altura;
		while (altura != -1) {
			if(altura > alturaArbolMasAlto) { //Hemos encontrado el arbol mas alto por lo cual actualizamos informacion
				alturaArbolMasAlto = altura;
				etiquetaArbolMasAlto = etiqueta;
			}
		}
		etiqueta ++;//Incrementamos el valor de etiqueta para que nos solicite altura del siguiente
		System.out.println("Altura del arbol ("+ etiqueta +"): ");
		altura= sc.nextInt();
			if(alturaArbolMasAlto == -1) {
				System.out.println("No existe nigun arbol");
			}
			else {
				System.out.println("El arbol mas alto mide:" + alturaArbolMasAlto);
				
				System.out.println("Etiqueta del arbol"  + etiquetaArbolMasAlto);
			}
		}

	}


