package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestNearHundred {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testNearHundred1(){
        //Given
        int n = 93;
        //When
        boolean outcome = warmups1.nearHundred(n);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testNearHundred2(){
        //Given
        int n = 90;
        //When
        boolean outcome = warmups1.nearHundred(n);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testNearHundred3(){
        //Given
        int n = 89;
        //When
        boolean outcome = warmups1.nearHundred(n);
        //Then
        Assert.assertFalse(outcome);
    }
}
