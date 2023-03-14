import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator_Test {

	Calculator calculator = new Calculator(); 
	
 	@Test
    public void squareRootTest1(){
        assertEquals("Square Root test", 3.0, calculator.squareRoot(9.0), 0.0f);
    }
 	
 	@Test
    public void squareRootTest2(){
        assertEquals("Square Root test", 0.0, calculator.squareRoot(0.0), 0.0f);
    }
    
    @Test
    public void factorialTest1(){
        assertEquals("Factorial Test", 720, calculator.factorial(6), 0.0f);
    }
    
    @Test
    public void factorialTest2(){
        assertEquals("Factorial Test", 1, calculator.factorial(0), 0.0f);
    }

    @Test
    public void naturalLogTest(){
        assertEquals("Natural Log Test", 1.0, calculator.naturalLog(2.718), 0.2f);
    }

    @Test
    public void powerTest(){
        assertEquals("Power Test", 27.0, calculator.power(3.0, 3), 0.0f);
    }

}
