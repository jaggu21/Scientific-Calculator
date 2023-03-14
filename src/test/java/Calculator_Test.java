import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator_Test {

	Calculator calculator = new Calculator(); 
	
 	@Test
    public void squareRootTest(){
        assertEquals("True Positive for Square Root", 2.0, calculator.squareRoot(4.0), 0.0f);
    }
    
    @Test
    public void factorialTest(){
        assertEquals("True Positive for Factorial", 24, calculator.factorial(4), 0.0f);
    }

    @Test
    public void naturalLogTest(){
        assertEquals("True Positive for Natural Log", 1.0, calculator.naturalLog(2.718), 0.2f);
    }

    @Test
    public void powerTest(){
        assertEquals("True Positive for Power", 64.0, calculator.power(4.0, 3), 0.0f);
    }

}
