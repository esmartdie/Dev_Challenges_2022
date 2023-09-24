import challenge_10.BalancedExpressions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BalancedExpressionsTest {

    @DataProvider(name = "bracketTestData")
    public Object[][] bracketTestData() {
        return new Object[][] {
                {"{a + b [c] * (2x2)}}}}"},
                {"{ [ a * ( c + d ) ] - 5 }"},
                {"{ a * ( c + d ) ] - 5 }"},
                {"{a^4 + (((ax4)}"},
                {"{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"},
                {"{{{{{{(}}}}}}"},
                {"(a"}
        };
    }

    @Test(dataProvider = "bracketTestData")
    public void isBalanceTheNextExpresions(String test){

        boolean balance = BalancedExpressions.isBalanced(test);
        System.out.println(balance);
    }
}
