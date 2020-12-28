package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestSumDouble {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testSumDouble1(){
        //Given
        int a = 1;
        int b = 2;
        int expected = 3;
        //When
        int outcome = warmups1.sumDouble(a, b);
        //Then
        Assert.assertEquals(expected,outcome);
    }
    @Test
    public void testSumDouble2(){
        //Given
        int a = 3;
        int b = 2;
        int expected = 5;
        //When
        int outcome = warmups1.sumDouble(a, b);
        //Then
        Assert.assertEquals(expected,outcome);
    }
    @Test
    public void testSumDouble3(){
        //Given
        int a = 2;
        int b = 2;
        int expected = 8;
        //When
        int outcome = warmups1.sumDouble(a, b);
        //Then
        Assert.assertEquals(expected,outcome);
    }
}
