import challenge_16.CapitalCase;
import org.testng.annotations.Test;

public class CapitalCaseTest {

    @Test
    public void setCapitalCase_1(){

        String text = "hOlA, comO EsTaS hoY";
        String capitalTest = CapitalCase.setCapitalCase(text);
        System.out.println(capitalTest);
    }
}
