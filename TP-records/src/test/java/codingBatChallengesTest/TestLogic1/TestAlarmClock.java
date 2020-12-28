package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestAlarmClock {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testAlarmClock1(){
        //Given
        int day = 1;
        boolean vacation = false;
        String expected = "7:00";
        //When
        String outcome = logic1.alarmClock(day, vacation);
        //Then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testAlarmClock2(){
        //Given
        int day = 5;
        boolean vacation = false;
        String expected = "7:00";
        //When
        String outcome = logic1.alarmClock(day, vacation);
        //Then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testAlarmClock3(){
        //Given
        int day = 0;
        boolean vacation = false;
        String expected = "10:00";
        //When
        String outcome = logic1.alarmClock(day, vacation);
        //Then
        Assert.assertEquals(expected, outcome);
    }
}
