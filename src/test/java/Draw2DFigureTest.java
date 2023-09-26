import challenge_26.Draw2DFigure;
import org.testng.annotations.Test;

public class Draw2DFigureTest {

    @Test
    public void drawTriangleTest(){
        int size = 10;
        int polygonType = 3;

        Draw2DFigure draw = new Draw2DFigure();
        draw.drawFigure(polygonType, size);
    }

    @Test
    public void drawSquareTest(){
        int size = 10;
        int polygonType = 4;

        Draw2DFigure draw = new Draw2DFigure();
        draw.drawFigure(polygonType, size);
    }
}
