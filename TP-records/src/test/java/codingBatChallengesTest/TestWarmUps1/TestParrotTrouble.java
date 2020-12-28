package codingBatChallengesTest.TestWarmUps1;

import codingBatChallenges.Warmups1;
import org.junit.Assert;
import org.junit.Test;

public class TestParrotTrouble {
    private static volatile Warmups1 warmups1 = new Warmups1();

    @Test
    public void testParrotTrouble1(){
        //Given
        boolean talking = true;
        int hours = 6;
        //When
        boolean outcome = warmups1.parrotTrouble(talking, hours);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void testParrotTrouble2(){
        //Given
        boolean talking = true;
        int hours = 7;
        //When
        boolean outcome = warmups1.parrotTrouble(talking, hours);
        //Then
        Assert.assertFalse(outcome);
    }
    @Test
    public void testParrotTrouble3(){
        //Given
        boolean talking = false;
        int hours = 6;
        //When
        boolean outcome = warmups1.parrotTrouble(talking, hours);
        //Then
        Assert.assertFalse(outcome);
    }
}
