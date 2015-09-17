package Chapter_1_Fundamentals.BagsQueuesStacks.solutions.test;

import Chapter_1_Fundamentals.BagsQueuesStacks.solutions.Ex1_3_4;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Sergei Zarochentsev on 02.09.2015.
 */
public class Ex1_3_4Test extends Assert {

    private Map<String, Boolean> tests;
    @org.junit.Before
    public void setUp() throws Exception {
        tests = new TreeMap<>();
        tests.put("()", true);
        tests.put("(", false);
        tests.put(")", false);
        tests.put("{ [ ( ) ] } ", true);
        tests.put("{ [ ( ) ) } ", false);
        tests.put("[ ( ( ) ) ", false);
        tests.put("( [ { 1 } ] ) ", true);
        tests.put("[ ( ] ) ", false);
        tests.put("[ ( ) ] { } { [ ( ) ( ) ] ( ) }", true);
    }

    @Test
    public void testBracket()
    {

        for (Map.Entry<String, Boolean> testCase : tests.entrySet()) {
            assertEquals(testCase.getValue(), Ex1_3_4.checkBrackets( testCase.getKey() ));
        }
    }

    @org.junit.After
    public void tearDown() throws Exception {
        tests.clear();
    }
}