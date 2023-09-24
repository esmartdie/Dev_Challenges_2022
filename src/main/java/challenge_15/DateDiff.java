package challenge_15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */
public class DateDiff {

    public static int calculateDateDiff(String date1, String date2) {
        try {
            LocalDate dateA = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dateB = LocalDate.parse(date2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            long daysDiff = ChronoUnit.DAYS.between(dateA, dateB);
            return Math.abs(Math.toIntExact(daysDiff));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("El formato de fecha es inválido");
        }
    }
}
