package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestMakes10 {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testMakes10a(){
        //Given
        int a = 9;
        int b = 10;
        //When
        boolean outcome = warmups1.makes10(a,b);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testMakes10b(){
        //Given
        int a = 9;
        int b = 9;
        //When
        boolean outcome = warmups1.makes10(a,b);
        //Then
        Assert.assertFalse(outcome);
    }
    @Test
    public void testMakes10c(){
        //Given
        int a = 1;
        int b = 9;
        //When
        boolean outcome = warmups1.makes10(a,b);
        //Then
        Assert.assertTrue(outcome);
    }
}
