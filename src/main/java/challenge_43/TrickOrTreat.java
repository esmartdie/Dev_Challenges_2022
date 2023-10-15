package challenge_43;


import java.util.Random;

/*
 * Enunciado: Este es un reto especial por Halloween.
 * Deberemos crear un programa al que le indiquemos si queremos realizar "Truco
 * o Trato" y un listado (array) de personas con las siguientes propiedades:
 * - Nombre de la niña o niño
 * - Edad
 * - Altura en centímetros
 *
 * Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 * siguiendo estos criterios:
 * - Un susto por cada 2 letras del nombre por persona
 * - Dos sustos por cada edad que sea un número par
 * - Tres sustos por cada 100 cm de altura entre todas las personas
 * - Sustos: 🎃 👻 💀 🕷 🕸 🦇
 *
 * Si las personas han pedido trato, el programa retornará dulces (aleatorios)
 * siguiendo estos criterios:
 * - Un dulce por cada letra de nombre
 * - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 * - Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 * - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
 */
public class TrickOrTreat {

    public void chooseTrickOrTreat(Halloween halloween, Person[] persons) {

        int count = countTricksOrTreats(halloween, persons);

        if (halloween == Halloween.TRICK) {
            for (int i=0; i<=count; i++){
                int randomTrick = getRandomNumber(0,Trick.length-1);
                System.out.print(Trick[randomTrick]+ " ");
            }
        } else if (halloween == Halloween.TREAT) {
            for (int i=0; i<=count; i++){
                int randomTreat = getRandomNumber(0,Treat.length-1);
                System.out.print(Treat[randomTreat]+ " ");
            }
        }
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public int countTricksOrTreats(Halloween halloween, Person[] persons) {
        int totalScaresOrTreats = 0;
        int height = 0;

        if (halloween == Halloween.TRICK) {
            for (Person person : persons) {
                totalScaresOrTreats += (person.getName().length() / 2);
                if (person.getAge() % 2 == 0) {
                    totalScaresOrTreats += 2;
                }
                height+=person.getHeightInCm();
            }
            totalScaresOrTreats += ((height/100)*3);
        } else if (halloween == Halloween.TREAT) {
            for (Person person : persons) {
                totalScaresOrTreats += person.getName().length();
                totalScaresOrTreats += Math.min(10, person.getAge() / 3);
                totalScaresOrTreats += (Math.min(3, person.getHeightInCm() / 50))*2;
            }
        }
        return totalScaresOrTreats;
    }

    public enum Halloween {TRICK, TREAT};
    private String[] Trick = new String[]  {"🎃", "👻",  "💀",  "🕷", "🕸", "🦇"};
    private String[] Treat = new String [] {"🍰", "🍬", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩"};

}
