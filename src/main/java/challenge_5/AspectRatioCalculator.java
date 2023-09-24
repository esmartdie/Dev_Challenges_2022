package challenge_5;

/*
Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
        * - Nota: Esta prueba no se puede resolver con el playground online de Kotlin. Se necesita Android Studio.
        * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
        * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.

 */


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AspectRatioCalculator {


    public static String calculateAspectRatio(String imageUrl){

        int[] dimensions = getImageDimensionsFromInternet(imageUrl);
        int height = dimensions[0];
        int width = dimensions[1];
        int greatterCommonDivisor = calculateGCD(width, height);

        return String.format("%d:%d", width / greatterCommonDivisor, height / greatterCommonDivisor);

    }

    public static int[] getImageDimensionsFromInternet(String imageUrl){
        try {
            URI url= new URI(imageUrl);
            BufferedImage image = ImageIO.read(url.toURL());
            int height = image.getHeight();
            int width = image.getWidth();
            return new int[]{height, width};
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
