package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestOld35 {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void TestOld35a(){
        //Given
        int n = 5;
        boolean outsideMode = false;
        //When
        boolean outcome = logic1.in1To10(n, outsideMode);
        //Then
        Assert.assertTrue(outcome);
    }

}
