
/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora
	(horas y minutos), calcule cuántos minutos faltan para el fin de semana. Se
	considerará que el fin de semana comienza el viernes a las 15:00h. Se da
	por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
	a las 15:00h.*/
public class EjercicioRepasoFuncion1 {
	
	// Devuelve 1 para lunes, 2 para martes... 5 para viernes
	public static int numeroDia(String dia) {
		int resultado;
		if(dia.equalsIgnoreCase("lunes")) {
			resultado=1;
		}
		else if (dia.equalsIgnoreCase("martes")) {
			resultado=2;
		}
		else if (dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("miércoles")) {
			resultado=3;
		}
		else if (dia.equalsIgnoreCase("jueves")) {
			resultado=4;
		}
		else {
		System.out.println("viernes");
		resultado=5;
		
		}
	}
	
	// Pasa el día y la hora a minutos desde el lunes a las 00:00
	 public static int minutosDesdeLunes(int dia, int horas, int minuto) {
		 int resultado;
		 resultado=
	 }
	
	public static void main(String[] args) {
		


	}

}
