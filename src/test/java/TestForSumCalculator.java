import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestForSumCalculator {

    private SumCalculator sumCalculator;

    @BeforeEach

    public void setUp() {
        sumCalculator = new SumCalculator();
    }


    @Test
     void testSumWithPositiveInput() {
        assertEquals(1, (sumCalculator.sum(1)));
        assertEquals(6, (sumCalculator.sum(3)));
        assertEquals(15, (sumCalculator.sum(5)));
    }

    @Test
     void testSumWithNegativeInput(){
        assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(-1));
        assertThrows(IllegalArgumentException.class, ()->sumCalculator.sum(0));
    }
}
