package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestCaughtSpeeding {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testCaughtSpeeding1(){
        //Given
        int speed = 60;
        boolean isBirthday = false;
        int expected = 0;
        //When
        int outcome = logic1.caughtSpeeding(speed, isBirthday);
        //Then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testCaughtSpeeding2(){
        //Given
        int speed = 65;
        boolean isBirthday = false;
        int expected = 1;
        //When
        int outcome = logic1.caughtSpeeding(speed, isBirthday);
        //Then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testCaughtSpeeding3(){
        //Given
        int speed = 65;
        boolean isBirthday = true;
        int expected = 0;
        //When
        int outcome = logic1.caughtSpeeding(speed, isBirthday);
        //Then
        Assert.assertEquals(expected, outcome);
    }
}
