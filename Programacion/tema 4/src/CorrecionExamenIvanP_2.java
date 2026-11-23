import java.util.Scanner;
public class CorrecionExamenIvanP_2 {
	
	static final Scanner scam= new Scanner (System.in);
	
	public static void main(String[] args) {
	//final int clave=generarClave();
	int clave=generarClave();
	juego(clave);
	
	}
static void juego(int c) {
	int intentos=0;
	boolean acertado;
	do {
		int guess= pedirGuess();
		intentos ++;
		acertado=comprobarIntento(guess,c,intentos);
	} while (!(acertado)&&intentos<5);
	if(!(acertado)) {
		System.out.print("Mensaje de fallo");
	}
	System.out.print("¿Jugar otra vez(0,1)?");
	int seguir=scam.nextInt();
	if(seguir==1) {
		juego(c);
	}
}
static int generarClave() {
	return (int)(Maht.Random*100+1);
	
}

static int pedirGuess() {
	int g;
	boolean valido;
	do {
		valido=true;
		System.out.print("Intenta acertar la clave");
		g= scam.nextInt();
		if (g<1) {
			valido=false;
			System.out.print("Numero invalido");
		}
		
	}while();
	return g;
}
static boolean comprobarIntento(int g, int c, int intentos) {
	boolean 
}
}
