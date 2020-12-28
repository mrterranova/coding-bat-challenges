package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestLove6 {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testLove61(){
        //Given
        int a = 6;
        int b = 4;
        //When
        boolean outcome = logic1.love6(a, b);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testLove62(){
        //Given
        int a = 4;
        int b = 5;
        //When
        boolean outcome = logic1.love6(a, b);
        //Then
        Assert.assertFalse(outcome);
    }
    @Test
    public void testLove63(){
        //Given
        int a = 1;
        int b = 5;
        //When
        boolean outcome = logic1.love6(a, b);
        //Then
        Assert.assertTrue(outcome);
    }
}
