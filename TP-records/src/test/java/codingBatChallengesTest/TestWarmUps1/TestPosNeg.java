package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestPosNeg {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testPosNeg1(){
        //Given
        int a = 1;
        int b = -1;
        boolean negative = false;
        //When
        boolean outcome = warmups1.posNeg(a,b, negative);
        //THen
        Assert.assertTrue(outcome);
    }
    @Test
    public void testPosNeg2(){
        //Given
        int a = -1;
        int b = 1;
        boolean negative = false;
        //When
        boolean outcome = warmups1.posNeg(a,b, negative);
        //THen
        Assert.assertTrue(outcome);
    }
    @Test
    public void testPosNeg3(){
        //Given
        int a = -4;
        int b = -5;
        boolean negative = true;
        //When
        boolean outcome = warmups1.posNeg(a,b, negative);
        //THen
        Assert.assertTrue(outcome);
    }
}
