package challenge_20;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/*
 * Crea una función que sume 2 números y retorne su resultado pasados
 * unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que
 *   debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
 *   asíncrona, es decir, sin detener la ejecución del programa principal.
 *   Se podría ejecutar varias veces al mismo tiempo.
 */
public class TimeStop {

    public static int futureSumResult(int num1, int num2, int seconds) {
        ResultHolder resultHolder = new ResultHolder();

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(seconds * 1000);
                resultHolder.setResult(num1 + num2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        try {
            thread.join(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (thread.isAlive()) {
            // El hilo no ha terminado dentro del tiempo límite
            thread.interrupt();
            return num1 + num2; // Devolver el valor predeterminado
        }

        return resultHolder.getResult();
    }

    private static class ResultHolder {
        private int result;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
    }
}

