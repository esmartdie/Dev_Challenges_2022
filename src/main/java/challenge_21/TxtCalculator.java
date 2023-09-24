package challenge_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su
 * resultado e imprímelo.
 * - El .txt se corresponde con las entradas de una calculadora.
 * - Cada línea tendrá un número o una operación representada por un
 *   símbolo (alternando ambos).
 * - Soporta números enteros y decimales.
 * - Soporta las operaciones suma "+", resta "-", multiplicación "*"
 *   y división "/".
 * - El resultado se muestra al finalizar la lectura de la última
 *   línea (si el .txt es correcto).
 * - Si el formato del .txt no es correcto, se indicará que no se han
 *   podido resolver las operaciones.
 */
public class TxtCalculator {

    public static void calculateOperations(String locationFile){

        File operationsFile = new File(locationFile);

        BigDecimal result = BigDecimal.ZERO;

        try {
            Scanner scanner = new Scanner(operationsFile);

            while (scanner.hasNextLine()){

                String line = scanner.nextLine();

                if (!line.matches("[0-9,+=\\-*\\/]+")) {
                    throw new IllegalArgumentException("Invalid line: " + line);
                }

                result = readOperations(line);

                System.out.println(line + " " + result);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static BigDecimal readOperations (String line){

        int opPosition = operatorPosition(line);

        BigDecimal result = BigDecimal.ZERO;

        String operator = line.substring(opPosition, opPosition+1);
        String operand1 = line.substring(0, opPosition);
        String operand2 = line.substring(opPosition + 1, line.length() - 1);

        try {
            BigDecimal num1 = new BigDecimal(operand1.trim());
            BigDecimal num2 = new BigDecimal(operand2.trim());

            switch (operator) {
                case "+":
                    result = num1.add(num2);
                    break;
                case "-":
                    result = num1.subtract(num2);
                    break;
                case "*":
                    result = num1.multiply(num2);
                    break;
                case "/":
                    result = num1.divide(num2);
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        return result;
    }

    private static int operatorPosition(String line){

        int opPosition = 0;

        for (int i = 0; i<line.length(); i++){
            char character = line.charAt(i);

            if (String.valueOf(character).matches("[+\\-*/]")){
                opPosition = i;
            }
        }

        return opPosition;
    }
}
