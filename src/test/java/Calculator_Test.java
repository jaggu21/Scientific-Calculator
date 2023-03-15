import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator_Test {

	Calculator calculator = new Calculator(); 
	
 	@Test
    public void squareRootTest1(){
        assertEquals("Square Root test 1", 3.0, calculator.squareRoot(9.0), 0.0f);
    }
 	
 	@Test
    public void squareRootTest2(){
        assertEquals("Square Root test 2", 0.0, calculator.squareRoot(0.0), 0.0f);
    }
    
    @Test
    public void factorialTest1(){
        assertEquals("Factorial Test 1", 720, calculator.factorial(6), 0.0f);
    }
    
    @Test
    public void factorialTest2(){
        assertEquals("Factorial Test 2", 1, calculator.factorial(0), 0.0f);
    }

    @Test
    public void naturalLogTest(){
        assertEquals("Natural Log Test", 1.0, calculator.naturalLog(2.718), 0.2f);
    }

    @Test
    public void powerTest1(){
        assertEquals("Power Test 1", 27.0, calculator.power(3.0, 3), 0.0f);
    }
    
    @Test
    public void powerTest2(){
        assertEquals("Power Test 2 ", 64.0, calculator.power(4.0, 3), 0.0f);
    }

}
