import challenge_4.PolygonArea;
import challenge_4.Rectangle;
import challenge_4.Square;
import challenge_4.Triangle;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PolygonAreaTest {
    @Test
    public void testPolygonArea(){

        Rectangle rectangleTest=new Rectangle(8,4);
        Triangle triangleTest = new Triangle(8, 4);
        Square squaretest = new Square(2);

        double triangleAreaTest = PolygonArea.polygonArea(triangleTest);
        double rectangleAreaTest = PolygonArea.polygonArea(rectangleTest);
        double squareAreaTest= PolygonArea.polygonArea(squaretest);

        assertEquals(triangleAreaTest,16.0);
        assertEquals(rectangleAreaTest, 32.0);
        assertEquals(squareAreaTest, 4.0);

    }
}
