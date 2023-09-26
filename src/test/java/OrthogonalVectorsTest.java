import challenge_27.OrthogonalVectors;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrthogonalVectorsTest {

    private OrthogonalVectors orthogonalVectors;

    @BeforeClass
    public void setUp() {
        orthogonalVectors = new OrthogonalVectors();
    }

    @Test
    public void testOrthogonalVectors() {
        int[] vector1 = {1, -2};
        int[] vector2 = {2, 1};
        boolean result = orthogonalVectors.areOrthogonal(vector1, vector2);
        Assert.assertTrue(result, "Vectors should be orthogonal");

        int[] vector3 = {1, 2};
        int[] vector4 = {2, 1};
        result = orthogonalVectors.areOrthogonal(vector3, vector4);
        Assert.assertFalse(result, "Vectors should not be orthogonal");

        int[] vector5 = {3, 4};
        int[] vector6 = {-4, 3};
        result = orthogonalVectors.areOrthogonal(vector5, vector6);
        Assert.assertTrue(result, "Vectors should be orthogonal");
    }

    @Test
    public void testVectorsWithDifferentLengths() {
        int[] vector1 = {1, 2, 3};
        int[] vector2 = {2, 1};
        boolean result = orthogonalVectors.areOrthogonal(vector1, vector2);
        Assert.assertFalse(result, "Vectors with different lengths should not be compared");
    }
}
