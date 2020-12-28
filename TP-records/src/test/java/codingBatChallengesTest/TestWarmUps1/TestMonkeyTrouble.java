package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestMonkeyTrouble {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testMonkeyTrouble1(){
        //Given
        boolean aSmile = true;
        boolean bSmile = true;
        //When
        boolean outcome = warmups1.monkeyTrouble(aSmile, bSmile);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testMonkeyTrouble2(){
        //Given
        boolean aSmile = false;
        boolean bSmile = false;
        //When
        boolean outcome = warmups1.monkeyTrouble(aSmile, bSmile);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testMonkeyTrouble3(){
        //Given
        boolean aSmile = true;
        boolean bSmile = false;
        //When
        boolean outcome = warmups1.monkeyTrouble(aSmile, bSmile);
        //Then
        Assert.assertFalse(outcome);
    }
}
