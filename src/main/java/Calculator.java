import java.util.*;
import java.lang.Math;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

	public static void PrintOperations(){
		 System.out.println("Options Menu");
        System.out.println("");
        System.out.println("1) Square Root");
        System.out.println("2) Factorial");
        System.out.println("3) Natural Log");
        System.out.println("4) Power");
        System.out.println("5) Exit");
  }
	
	public double squareRoot(double number) {
       double result = Math.sqrt(number);
       logger.info("[SQRT] - " + number);
       logger.info("[RESULT - SQRT] - " + result);
       return result;
   }

   public int factorial(int number) {
	   if(number == 0) {
		   return 1; 
	   }
       int result = number;
       for( int i = number-1; i >= 1; i--){
           result = result*i;
       }
       logger.info("[FACTORIAL] - " + number);
       logger.info("[RESULT - FACTORIAL] - " + result);
       return result;
   }

   public double naturalLog(double number) {
       double result = Math.log(number);
       logger.info("[LOG] - " + number);
       logger.info("[RESULT - LOG] - " + result);
       return result;
   }

   public double power(double number, double b) {
       double result = Math.pow(number, b);
       logger.info("[POWER] - " + number + ", " + b);
       logger.info("[RESULT - POWER] - " + result);
       return result;
   }
	 
	public static void main(String args[]) {
		System.out.println("--------- Scientific Calculator ---------");
		boolean run = true; 
        Scanner reader = new Scanner(System.in);
        Calculator calculator = new Calculator();

		while(run){
			PrintOperations(); 
			
			System.out.println("Enter your choice: "); 
			int option = reader.nextInt();
            
			//Square Root
			if(option == 1) {
				 System.out.println("Square Root");
                 System.out.print("Enter number: ");
                 double num = reader.nextDouble();
                 System.out.println(calculator.squareRoot(num));
                 continue;
			}

			//Factorial
			if(option == 2) {
				System.out.println("Factorial");
                System.out.print("Enter number: ");
                int num = reader.nextInt(); 
              
                System.out.println(calculator.factorial(num));
                continue; 
			}
			
			//Natural Logarithm
			if(option == 3) {
				 System.out.println("Natural Logarithm");
                 System.out.print("Enter number: ");
                 double num = reader.nextDouble();
                 System.out.println(calculator.naturalLog(num));
                 continue;
			}
			
			if(option == 4) {
				System.out.println("Power");
                System.out.print("Enter number: ");
                double num = reader.nextDouble();
                System.out.print("Enter exponent: ");
                double b = reader.nextDouble();
                System.out.println(calculator.power(num, b));
                continue;
			}
			
			if(option == 5) {
				run = false; 
				break; 
			}
			
		}
		
		System.out.println("Thank you for using Scientific Calculator");
		reader.close();
	}
	
}
