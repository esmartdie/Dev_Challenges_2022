import challenge_44.Boomerang;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoomerangTest {

    @Test
    public void testDetectBoomerang() {
        Boomerang boomerang = new Boomerang();
        int[] numArray = {2, 1, 2, 3, 3, 4, 2, 4};

        List<Integer> boomerangs = boomerang.detectBoomerang(numArray);

        assertEquals(6, boomerangs.size());

        assertEquals(Integer.valueOf(2), boomerangs.get(0));
        assertEquals(Integer.valueOf(1), boomerangs.get(1));
        assertEquals(Integer.valueOf(2), boomerangs.get(2));
        assertEquals(Integer.valueOf(4), boomerangs.get(3));
        assertEquals(Integer.valueOf(2), boomerangs.get(4));
        assertEquals(Integer.valueOf(4), boomerangs.get(5));
    }

    @Test
    public void testDetectBoomerangNoBoomerangs() {
        Boomerang boomerang = new Boomerang();
        int[] numArray = {1, 2, 3, 4, 5};

        List<Integer> boomerangs = boomerang.detectBoomerang(numArray);

        // Comprobamos que la lista esté vacía
        assertEquals(0, boomerangs.size());
    }
}
