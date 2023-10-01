package challenge_31;

/*
 * Crea una función que imprima los 30 próximos años bisiestos
 * siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 */

public class Next30LeapYears {

    public static void main(String[] args) {

        printNextYear(2021);
    }

    public static void printNextYear(int year){

        int nextYear= year;
        boolean leapYear = isALeapYear(nextYear);

        while(leapYear==false){
            leapYear = isALeapYear(nextYear);
            if(leapYear==true)
                break;
            else
                nextYear++;
        }
        System.out.println("The next 30 leap years: ");
        for(int i = 1; i<=30; i++){
            System.out.println(i +"º - " + nextYear);
            nextYear +=4;
        }
    }

    private static boolean isALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
