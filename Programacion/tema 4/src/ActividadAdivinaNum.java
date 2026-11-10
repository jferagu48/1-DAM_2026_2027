
public class ActividadAdivinaNum {

	static int generarNum(int num) {
		int numSecreto;
		for (int i=1; i<=num; i++) {
			numSecreto=(int)(Math.random() * 100+1);
			
		}
		return numSecreto;
	}
	
	static boolean comprobarNum(int numSecreto, int numUsuario) {
		boolean nS;
		if(numSecreto==numUsuario){
			nS=true;
		}
		else if (numSecreto>numUsuario) {
			System.out.println("Es mas grande");
		}
		else if (numSecreto<numUsuario) {
			System.out.println("Es mas chico");
		}
		else {
			nS=false;
		}
		return nS;
	}
	
	public static void main(String[] args) {
		int numUsuario,resultado,genera,num;
		genera= generarNum(num);
		resultado= comprobarNum(numSecreto, numUsuario);

	}

}
