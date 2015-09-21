package Chapter_1_Fundamentals.BagsQueuesStacks.solutions.test;

import Chapter_1_Fundamentals.BagsQueuesStacks.solutions.Ex1_3_10;
import Chapter_1_Fundamentals.BagsQueuesStacks.solutions.Ex1_3_11;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Sergei Zarochentsev on 21.09.2015.
 */
public class Ex1_3_11Test {



    @DataProvider(name = "postfix_expressions")
    public static Object[][] postfix_expressions() {
        return new Object[][] {
                {"3 + 4", 7.0},
                {"3 + 4 + 5", 12.0},
                {"( 1 + 2 ) * 4 + 3", 15.0},
                {"7 - 2 * 3", 1.0},
                {"7 * 2 - 3", 11.0},
                {"7 * ( 2 - 3 )", -7.0}
        };

    }

    @Test(dataProvider = "postfix_expressions")
    public void testCalcPostfixExpr(String defExpr, double expected) throws Exception {
        assertEquals( Ex1_3_11.calcPostfix(Ex1_3_10.toPostfix(defExpr)), expected);

    }
}