package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestSleepIn {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testSleepIn1(){
        //Given
        boolean weekday = false;
        boolean vacation = false;
        //When
        boolean outcome = warmups1.sleepIn(weekday, vacation);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testSleepIn2(){
        //Given
        boolean weekday = true;
        boolean vacation = false;
        //When
        boolean outcome = warmups1.sleepIn(weekday, vacation);
        //Then
        Assert.assertFalse(outcome);
    }
    @Test
    public void testSleepIn3(){
        //Given
        boolean weekday = false;
        boolean vacation = true;
        //When
        boolean outcome = warmups1.sleepIn(weekday, vacation);
        //Then
        Assert.assertTrue(outcome);
    }
}
