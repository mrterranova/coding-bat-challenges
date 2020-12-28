package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestDiff21 {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testDiff21a(){
        //Given
        int n = 19;
        int expected = 2;
        //When
        int outcome = warmups1.diff21(n);
        //Then
        Assert.assertEquals(expected,outcome);
    }
    @Test
    public void testDiff21b(){
        //Given
        int n = 19;
        int expected = 2;
        //When
        int outcome = warmups1.diff21(n);
        //Then
        Assert.assertEquals(expected,outcome);
    }
    @Test
    public void testDiff21c(){
        //Given
        int n = 19;
        int expected = 2;
        //When
        int outcome = warmups1.diff21(n);
        //Then
        Assert.assertEquals(expected,outcome);
    }
}
