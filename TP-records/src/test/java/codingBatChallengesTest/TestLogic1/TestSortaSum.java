package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Assert;
import org.junit.Test;

public class TestSortaSum {
    private static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testSortaSum1(){
        //Given
        int a = 3;
        int b = 4;
        int expected = 7;
        //When
        int outcome = logic1.sortaSum(a, b);
        //Then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testSortaSum2(){
        //Given
        int a = 9;
        int b = 4;
        int expected = 20;
        //When
        int outcome = logic1.sortaSum(a, b);
        //Then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testSortaSum3(){
        //Given
        int a = 10;
        int b = 11;
        int expected = 21;
        //When
        int outcome = logic1.sortaSum(a, b);
        //Then
        Assert.assertEquals(expected, outcome);
    }
}
