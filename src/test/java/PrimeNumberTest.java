import challenge_3.PrimeNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberTest {

    @Test
    public void testHavePrimeNumber() {
        // Redirigir la salida estándar a un ByteArrayOutputStream para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Caso de prueba: Comprobación de los números primos entre 1 y 10
        PrimeNumber.havePrimeNumber(10);

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Obtener la salida capturada y separar los números primos en una lista
        String[] primesArray = outputStream.toString().trim().split("\\s+");
        List<Integer> actualPrimes = new ArrayList<>();
        for (String prime : primesArray) {
            actualPrimes.add(Integer.parseInt(prime));
        }

        // Lista de números primos esperados
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);

        // Verificar que los números primos generados coincidan con los esperados
        Assert.assertEquals(actualPrimes, expectedPrimes);
    }
}
