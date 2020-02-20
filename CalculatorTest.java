import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void  adder_function () {
        Calculator x= new Calculator();
        assertEquals(5,x.add(2,3));
        assertEquals(10,x.add(5,5));
        assertEquals(0,x.add(4,-4));
    }

    @Test
    void divider_function() {
        Calculator x= new Calculator();
        assertEquals(5,x.divide(10,2));
        assertEquals(-1,x.divide(5,-5));
        assertEquals(0.0,x.divide(3,0));
        assertEquals(0.5,x.divide(1,2));
        assertEquals(1.5,x.divide(3,2));
    }
}