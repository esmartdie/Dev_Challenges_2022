package challenge_16;

/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class CapitalCase {

    public static String setCapitalCase(String text){

        StringBuilder builder = new StringBuilder(text.toLowerCase());

        for (int i = 0; i < builder.length(); i++) {
            char currentChar = builder.charAt(i);

            if(i==0){
                builder.setCharAt(i,Character.toUpperCase(builder.charAt(i)));
            }
            if (currentChar == ' ' || currentChar == '\n') {
                if (i + 1 < builder.length()) {
                    char nextChar = builder.charAt(i + 1);
                    char uppercaseChar = Character.toUpperCase(nextChar);
                    builder.setCharAt(i + 1, uppercaseChar);
                }
            }
        }

        return builder.toString();

    }
}
