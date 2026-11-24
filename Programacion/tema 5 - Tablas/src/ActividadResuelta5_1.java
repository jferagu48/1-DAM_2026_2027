import java.util.Arrays;

public class ActividadResuelta5_1 {

	public static void main(String[] args) {
		int valores[];
		valores=new int[10];
		for (int i=0; i<valores.length;i++) {
			valores[i]=(int)Math.random()*100+1;
			Arrays.toString(valores);
		}
		int suma=0;
		for(int valor:valores) {
			suma+=valor;
		}
		System.out.print("la suma de los valores aleatorios es:"+ suma);

	}

}
