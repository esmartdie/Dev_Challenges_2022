import challenge_41.OhmsLaw;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OhmsLawTest {

    OhmsLaw oh;
    @BeforeClass
    public void setUp(){
      oh = new OhmsLaw();
    }

    @Test
    public void calculateMissingV(){

        double V=0;
        double R=10;
        double I=4;

        V= oh.calculateMissValue(V, R, I);
        Assert.assertEquals(40.0, V);
    }

    @Test
    public void calculateMissingR(){

        double V=40;
        double R=0;
        double I=4;

        R= oh.calculateMissValue(V, R, I);
        Assert.assertEquals(10, R);
    }

    @Test
    public void calculateMissingI(){

        double V=40;
        double R=10;
        double I=0;

        I= oh.calculateMissValue(V, R, I);
        Assert.assertEquals(4, I);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculateMissingAllValues() {
        double V = 0;
        double R = 0;
        double I = 0;

        I = oh.calculateMissValue(V, R, I);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculateMissingTwoValues() {
        double V = 40;
        double R = 0;
        double I = 0;

        I = oh.calculateMissValue(V, R, I);
    }
}
