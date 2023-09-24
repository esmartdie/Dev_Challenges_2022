package challenge_19;
/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */
public class TimeConverter {

    public static long milliseconds(int days, int hours, int minutes, int seconds){

        int day = days * 86400 * 1000;
        int hour = hours * 3600 * 1000;
        int minute = minutes * 60 * 1000;
        int second = seconds * 1000;

        return day + hour + minute + second;
    }
}
