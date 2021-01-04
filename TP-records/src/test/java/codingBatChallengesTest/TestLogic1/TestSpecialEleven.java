package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestSpecialEleven {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testSpecialEleven1(){
        //Given
        int n = 22;
        //When
        boolean outcome = logic1.specialEleven(n);
        //THen
        Assert.assertTrue(outcome);
    }
    @Test
    public void testSpecialEleven2(){
        //Given
        int n = 23;
        //When
        boolean outcome = logic1.specialEleven(n);
        //THen
        Assert.assertTrue(outcome);
    }
    @Test
    public void testSpecialEleven3(){
        //Given
        int n = 24;
        //When
        boolean outcome = logic1.specialEleven(n);
        //THen
        Assert.assertFalse(outcome);
    }
}
