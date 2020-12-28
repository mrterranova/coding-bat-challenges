package codingBatChallengesTest.TestLogic1;

import codingBatChallenges.Logic1;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCigarParty {
    private  static volatile Logic1 logic1 = new Logic1();

    @Test
    public void testCigarPartyCase1(){
        // : Given
        int cigars = 30;
        boolean isWeekend = false;
        // : When
        boolean outcome = logic1.cigarParty(cigars, isWeekend);
        // : Then
        assertFalse(outcome);
    }

    @Test
    public void testCigarPartyCase2(){
        // : Given
        int cigars = 50;
        boolean isWeekend = false;
        // : When
        boolean outcome = logic1.cigarParty(cigars, isWeekend);
        // : Then
        assertTrue(outcome);
    }

    @Test
    public void testCigarPartyCase3(){
        // : Given
        int cigars = 70;
        boolean isWeekend = true;
        // : When
        boolean outcome = logic1.cigarParty(cigars, isWeekend);
        // : Then
        assertTrue(outcome);
    }

}
