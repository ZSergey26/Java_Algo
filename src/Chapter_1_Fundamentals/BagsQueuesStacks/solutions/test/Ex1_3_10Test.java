package Chapter_1_Fundamentals.BagsQueuesStacks.solutions.test;

import Chapter_1_Fundamentals.BagsQueuesStacks.solutions.Ex1_3_10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Sergei Zarochentsev on 17.09.2015.
 */
public class Ex1_3_10Test {


    @DataProvider(name = "expressions")
    public static Object[][] expressions() {
        return new Object[][] {
                {"3 + 4", "3 4 +"},
                {"3 + 4 + 5", "3 4 + 5 +"},
                {"( 1 + 2 ) * 4 + 3", "1 2 + 4 * 3 +"},
                {"7 - 2 * 3", "7 2 3 * -"},
                {"7 * 2 - 3", "7 2 * 3 -"},
                {"7 * ( 2 - 3 )", "7 2 3 - *"}
        };

    }

    @Test(dataProvider = "expressions")
    public void testPostfixRec(String expression, String expected) throws Exception {
        assertEquals(Ex1_3_10.toPostfix(expression), expected);

    }
}