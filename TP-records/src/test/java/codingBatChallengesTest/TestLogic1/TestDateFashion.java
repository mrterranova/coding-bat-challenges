package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestDateFashion {
    private  static volatile Logic1 logic1 = new Logic1();

    @Test
    public void TestDateFashion1(){
        // : Given
        int you = 5;
        int date = 10;
        int expected = 2;
        // : When
        int outcome = logic1.dateFashion(you, date);
        // : Then
        assertEquals(expected, outcome );
    }

    @Test
    public void TestDateFashion2(){
        // : Given
        int you = 5;
        int date = 2;
        int expected = 0;
        // : When
        int outcome = logic1.dateFashion(you, date);
        // : Then
        assertEquals(expected, outcome );
    }

    @Test
    public void TestDateFashion3(){
        // : Given
        int you = 5;
        int date = 5;
        int expected = 1;
        // : When
        int outcome = logic1.dateFashion(you, date);
        // : Then
        assertEquals(expected, outcome );
    }

}
