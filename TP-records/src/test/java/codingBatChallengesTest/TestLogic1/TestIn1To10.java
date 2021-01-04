package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestIn1To10 {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void TestIn1To10a(){
        //Given
        int n = 5;
        boolean outsideMode = false;
        //When
        boolean outcome = logic1.in1To10(n, outsideMode);
        //Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void TestIn1To10b(){
        //Given
        int n = 11;
        boolean outsideMode = false;
        //When
        boolean outcome = logic1.in1To10(n, outsideMode);
        //Then
        Assert.assertFalse(outcome);
    }
    @Test
    public void TestIn1To10c(){
        //Given
        int n = 11;
        boolean outsideMode = true;
        //When
        boolean outcome = logic1.in1To10(n, outsideMode);
        //Then
        Assert.assertTrue(outcome);
    }
}
