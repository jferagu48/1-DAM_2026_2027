import java.util.Scanner;
/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora
	(horas y minutos), calcule cuántos minutos faltan para el fin de semana. Se
	considerará que el fin de semana comienza el viernes a las 15:00h. Se da
	por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
	a las 15:00h.*/


public class EjercicioRepasoFuncion1 {

    // Devuelve los minutos transcurridos desde el lunes a las 00:00
    // dia: 1 = lunes, 2 = martes, ... 5 = viernes
    static int convertirAMinutos(int dia, int horas, int minutos) {
        int minutosPorHora = 60;
        int minutosPorDia = 24 * minutosPorHora;
        return (dia - 1) * minutosPorDia + horas * minutosPorHora + minutos;
    }

    // Devuelve los minutos que faltan hasta el viernes a las 15:00
    static int minutosHastaFinDeSemana(int dia, int horas, int minutos) {
        int momentoActual = convertirAMinutos(dia, horas, minutos);
        int inicioFinDeSemana = convertirAMinutos(5, 15, 0);
        return inicioFinDeSemana - momentoActual;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia de la semana (1=lunes ... 5=viernes): ");
        int dia = sc.nextInt();
        System.out.print("Horas: ");
        int horas = sc.nextInt();
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();

        int resultado = minutosHastaFinDeSemana(dia, horas, minutos);
        System.out.println("Faltan " + resultado + " minutos para el fin de semana.");

        sc.close();
    }
}
