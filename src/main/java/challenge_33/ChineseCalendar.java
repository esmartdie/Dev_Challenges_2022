package challenge_33;

/*
 * Enunciado: Crea un función, que dado un año, indique el elemento
 * y animal correspondiente en el ciclo sexagenario del zodíaco chino.
 * - Info: https://www.travelchinaguide.com/intro/astrology/60year-cycle.htm
 * - El ciclo sexagenario se corresponde con la combinación de los elementos
 *   madera, fuego, tierra, metal, agua y los animales rata, buey, tigre,
 *   conejo, dragón, serpiente, caballo, oveja, mono, gallo, perro, cerdo
 *   (en este orden).
 * - Cada elemento se repite dos años seguidos.
 * - El último ciclo sexagenario comenzó en 1984 (Madera Rata).
 */

import java.util.ArrayList;

/*
https://en.wikipedia.org/wiki/Sexagenary_cycle

Step-by-step example to determine the sign for 1967:
1967 -4 = 1964 ("subtracting 3 from the Gregorian year"). Rest 1 less because the array start in 0 position
1964 % 60 = 43 At this point, we want to take the 'remainder' of the operation.

 */
public class ChineseCalendar {

    public static void main(String[] args) {

        calculateChineseCalendar(1989);
    }

    public static void calculateChineseCalendar(int gregorianYear){

        String[] animals = new String[]{ "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        String[] elements = new String[]{"Wood", "Fire", "Earth", "Metal", "Water"};

        int animalSelection = (((gregorianYear - 4)%60)%12);
        int elementSelection = (((gregorianYear -4)%60)%10)/2;

        System.out.println(gregorianYear + " | Animal: " + animals[animalSelection] +" - Element: " +elements[elementSelection]);
    }
}
