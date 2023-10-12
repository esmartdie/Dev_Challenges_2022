package challenge_41;

/*
 * Enunciado: Crea una función que calcule el valor del parámetro perdido
 * correspondiente a la ley de Ohm.
 * - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará
 *   el valor del tercero (redondeado a 2 decimales).
 * - Si los parámetros son incorrectos o insuficientes, la función retornará
 *   la cadena de texto "Invalid values".
 */
public class OhmsLaw {

    public double calculateMissValue(double V, double R, double I) {
        if (Double.isNaN(V) || Double.isNaN(R) || Double.isNaN(I) || (V == 0 && R == 0) ||
                (V == 0 && I == 0) || (R == 0 && I == 0)) {
            throw new IllegalArgumentException("More than one missing value");
        }
        if(V == 0){
            V = Math.round(I*R*100)/100;
            System.out.println("The missing value is the Voltage with a value of: " + V);
            return V;
        }
        else if(R == 0){
            R = Math.round((V/I)*100)/100;
            System.out.println("The missing value is the Resistance with a value of: " + R);
            return R;
        }
        else{
            I = Math.round((V/R)*100)/100;
            System.out.println("The missing value is the Current with a value of: " + I);
            return I;
        }
    }

}
