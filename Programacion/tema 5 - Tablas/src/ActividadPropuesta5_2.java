
public class ActividadPropuesta5_2 {

	public static void main(String[] args) {
		int tabla[], tabla2[];
		tabla= new int [10];
		tabla[0]= 1;
		tabla[1]= 2;
		tabla[2]= 3;
		tabla[3]= 4;
		tabla[4]= 5;
		tabla[5]= 6;
		tabla[6]= 7;
		tabla[7]= 8;
		tabla[8]= 9;
		tabla[9]= 10;
		tabla2= tabla;
		System.out.println(tabla);
		System.out.println(tabla2);
		for(int i=0; i<10; i++) {
			System.out.println(tabla2[i]);
		}
		for(int j=0; j<10; j++) {
			System.out.println(tabla[j]);
		}
		
	

	}

}
