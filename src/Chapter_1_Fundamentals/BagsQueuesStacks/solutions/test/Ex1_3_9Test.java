package Chapter_1_Fundamentals.BagsQueuesStacks.solutions.test;


import Chapter_1_Fundamentals.BagsQueuesStacks.solutions.Ex1_3_9;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Created by Sergei Zarochentsev on 07.09.2015.
 */
public class Ex1_3_9Test {
    @DataProvider
    public Object[][] testBrackets() {
        return new Object[][] {
                {")", "( )"},
                {"- 3 )", "( - 3 )"},
                {"4 - 3 )", "( 4 - 3 )"},
                {"1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )", "( ( 1 + 2 ) * ( ( 3 - 4) * ( 5 - 6 ) ) )"},
                {") )", "( ( ) )"},
        };
    }

    @Test(dataProvider = "testBrackets")
    public void testDecToBin(String testString, String expectedString) {
        final String actual = Ex1_3_9.completeBrackets(testString);
        assertEquals(actual, expectedString);
    }
}
