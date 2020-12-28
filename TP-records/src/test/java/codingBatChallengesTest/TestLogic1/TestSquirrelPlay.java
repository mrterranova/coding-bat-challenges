package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestSquirrelPlay{
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testSquirrelPlay1(){
        // : Given
        int temp = 70;
        boolean isSummer = false;
        // : When
        boolean outcome = logic1.squirrelPlay(temp, isSummer);
        // : Then
        Assert.assertTrue(outcome);
    }

    @Test
    public void testSquirrelPlay2(){
        // : Given
        int temp = 95;
        boolean isSummer = false;
        // : When
        boolean outcome = logic1.squirrelPlay(temp, isSummer);
        // : Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void testSquirrelPlay3(){
        // : Given
        int temp = 95;
        boolean isSummer = true;
        // : When
        boolean outcome = logic1.squirrelPlay(temp, isSummer);
        // : Then
        Assert.assertTrue(outcome);
    }
}
