package challenge_17;

/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

public class ObstaculeCourse {

    public static boolean evaluateRace(String[] actions, String track){

        StringBuilder builder = new StringBuilder(track);

        if (actions.length == builder.length()){

            for (int i=0; i<actions.length; i++){
                String action = actions[i];
                char currentSymbol = builder.charAt(i);

                if (action.equals("run")) {
                    if (currentSymbol == '_') {
                        continue;
                    } else if (currentSymbol == '|') {
                        builder.setCharAt(i, '/');
                    }
                } else if (action.equals("jump")) {
                    if (currentSymbol == '_') {
                        builder.setCharAt(i, 'x');
                    } else if (currentSymbol == '|') {
                        continue;
                    }
                }

            }

            boolean raceStatus = track.equals(builder.toString());
            System.out.println("The athlete finish the race: " + builder.toString() + ",  with a result: " +
                    raceStatus);
            return track.equals(builder.toString());
        }else {
            System.out.println("There is a difference between the track and the athlete's actions");
            return false;
        }
    }


}

