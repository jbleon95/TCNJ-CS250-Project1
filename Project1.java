/**
* Assignment: Project 1
* Due date: 9/29/2014
* Instructor: Dr. DePasquale
* Submitted by: Jeremy Leon and Yilin Yang
*/

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
* The Project1 Class contains the methods for the various operations
* used for the calculator as well as the main method that reads
* input from calculator.txt and performs the commands provided.
*
* @author Jeremy Leon
* @author Yilin Yang
*/

public class Project1
{
	/**
	* Takes two doubles from the input file,
	* adds them together and returns the answer as double.
	* 
	* @param n1 First double
	* @param n2 Second double
	* 
	* @return Answer to addition
	*/		
	public static double addition(double n1, double n2)
	{
		return n1 + n2;
	}

	/**
	* Takes two doubles from the input file,
	* subtracts them and returns the answer as double.
	* 
	* @param n1 First double
	* @param n2 Second double
	* 
	* @return answer Answer to subtraction
	*/
	public static double subtraction(double n1, double n2)
	{
		return n1 - n2;
	}

	/**
	* Takes two doubles from the input file,
	* multiplies them and returns the answer as double.
	* 
	* @param n1 First double
	* @param n2 Second double
	* 
	* @return Answer to multiplication
	*/
	public static double multiply(double n1, double n2)
	{
		return n1 * n2;
	}
	
	/**
	* Takes two doubles from the input file,
	* divides them and returns the answer as double.
	* 
	* @param n1 First double
	* @param n2 Second double
	* 
	* @return Answer to division
	*/
	public static double division(double n1, double n2)
	{
		return n1 / n2;
	}

	/**
	* Takes two integers from the input file,
	* performs modulus division and returns the answer as int.
	* 
	* @param n1 First int
	* @param n2 Second int
	* 
	* @return Answer to modulus
	*/
	public static int modulo(int n1, int n2)
	{
		return n1 % n2;
	}

	/**
	* Takes one double from the input file,
	* cubes it (multiplies itself together three times)
	* and returns the answer as double.
	* 
	* @param n1 Double value
	* 
	* @return Cube of double
	*/
	public static double cube(double n1)
	{
		return Math.pow(n1, 3);
	}

	/**
	* Takes one double from the input file,
	* converts it from degrees to radians,
	* finds it sine value and returns the answer as double.
	* 
	* @param n1 Double (in degrees)
	* 
	* @return Sine of radians
	*/
	public static double sin(double n1)
	{
		/**
		* The radian value of degrees given
		*/
		double radians = Math.toRadians(n1);
		return Math.sin(radians);
	}

	/**
	* Takes one double from the input file,
	* converts it from degrees to radians,
	* finds it cosine value and returns the answer as double.
	* 
	* @param n1 Double (in degrees)
	* 
	* @return Cosine of radians
	*/
	public static double cos(double n1)
	{
		/**
		* The radian value of degrees given.
		*/
		double radians = Math.toRadians(n1);
		return Math.cos(radians);
	}

	/**
	* Takes one double from the input file,
	* converts it from degrees to radians,
	* finds it tangent value and returns the answer as double.
	* 
	* @param n1 Double (in degrees)
	* 
	* @return Tangent of radians
	*/
	public static double tan(double n1)
	{
		/**
		* The radian value of degrees given.
		*/
		double radians = Math.toRadians(n1);
		return Math.tan(radians);
	}

	/**
	* Takes one double from the input file,
	* finds the square root and returns the answer as double.
	* 
	* @param n1 Double value
	*
	* @return Square root of double
	*/
	public static double sqrt(double n1)
	{
		return Math.pow(n1, 0.5);
	}

	/**
	* Takes one long from the input file,
	* finds the factorial of it and returns the answer as long.
	* 
	* @param n1 Long value
	*
	* @return Factorial of long
	*/
	public static long factorial(long n1)
	{
		/**
		* Initializes answer to 1 to be used in for loop
		* to find factorial of n1
		*/
		long answer = 1;
		
		/**
		* Makes sure long is non-negative number
		*/
		if(n1 >= 0)
		{
			/**
			* Sets counter as 1 plus the long value
			*/
			long counter = n1 + 1;
			
			/**
			* Finds factorial of number by finding product
			* of rising integers to n1
			*/
			for(int i=1; i < counter; i++)
			{
				answer = answer*i;
			}
		}
		return answer;
	}

	/**
	* Takes two doubles from the input file,
	* finds the power of the first double to the second double.
	* and returns the answer as double.
	*
	* @param n1 First double
	* @param n2 Second double
	* 
	* @return Power of n1 to n2
	*/
	public static double pow(double n1, double n2)
	{
		return Math.pow(n1, n2);
	}
	
	/**
	* Takes two integers from the input file,
	* and uses Math.min to find the minimum value 
	* and returns the minimum value as int.
	* 
	* @param n1 First int
	* @param n2 Second int
	* 
	* @return Lowest int
	*/
	public static int min(int n1, int n2)
	{
		return Math.min(n1, n2);
	} 
	
	/**
	* Takes two integers from the input file,
	* and uses Math.max to find the maximum value 
	* and returns the maximum value as int.
	* 
	* @param n1 First int
	* @param n2 Second int
	* 
	* @return Largest int
	*/
	public static int max(int n1, int n2)
	{
		return Math.max(n1, n2);
	} 
	
	/**
	* Takes one double from the input file,
	* rounds it to the nearest integer and returns answer as long.
	* 
	* @param n1 Double value
	*
	* @return Nearest long value
	*/
	public static long round(double n1) 
	{ 
		return Math.round(n1);
	}

	/**
	* Takes one double from the input file,
	* finds Euler's number to the power of double
	* and returns the answer as double.
	* 
	* @param n1 Double value
	* 
	* @return Eulers number to the power of n1
	*/
	public static double exp(double n1)
	{
		return Math.pow(Math.E, n1);
	}

	/**
	* Takes one double from the input file,
	* finds the cuberoot of it and returns answer as double.
	* 
	* @param n1 Double value
	* 
	* @return Cuberoot of double
	*/
	public static double cuberoot(double n1)
	{
		return Math.pow(n1, 1.0/3.0);
	}					
	
	/**
	* Main method reads calculator.txt, executing as many lines
	* equal to the first integer (command count). Creates DecimalFormat
	* object to set precision (default 3 decimals places). For loop
	* runs as many times as command count and reads each token and
	* performs command that it matches. If bunk command is given
	* no output is given but line is still counted
	*
	* @throws an IOException to read file
	*/
	public static void main(String[] args) throws IOException
	{		
		/**
		 *Allows the program to read input data from another file.
		 *In this case, we are specifying the program to scan a file
		 *named "calculator.txt".
		 */
		Scanner filescan = new Scanner(new File("calculator.txt"));
		
		/**
		 *Creates a variable equal to the first integer in the input file.
		 */
		int counter = filescan.nextInt();
		
		/**
		 *Establishes the precision for all numeral values to be 3 decimals.
		 *This will be applied to all subsequent numbers unless changed by
		 *a later command. Note that some outputs were instructed not to be subject 
		 *to this rule and are coded accordingly.
		 */
		DecimalFormat precise = new DecimalFormat();		
		precise.setMaximumFractionDigits(3);
		precise.setMinimumFractionDigits(3);
		
		/**
		 *Loop that allows the program to run for as many times as specified 
		 *by the counter variable. Program will cease operating once counter
		 *threshold is reached, regardless of how many lines are left.
		 */
		for (int i=1; i <= counter; i++)
		{

			/**
			 *Reads the next character in line.
			 */
			String input = filescan.next();
			
			/**
			 *Precision command recognized. Program adjusts precision of all numbers.
			 */
			if (input.equals("precision"))
			{
				/**
				 *Sets precision equal to next integer in input file.
				 *(The number must not be zero).
				 */
				int precisenum = filescan.nextInt();
				if (precisenum != 0)
				{
					precise.setMaximumFractionDigits(precisenum);
					precise.setMinimumFractionDigits(precisenum);	
					precise.setRoundingMode(RoundingMode.HALF_EVEN);	
				}
				/**
				 *Sets precision equal to zero. Subsequent numbers are 
				 *truncated to integers.
				 */
				else
				{
					precise.setMaximumFractionDigits(0);
					precise.setMinimumFractionDigits(0);
					precise.setRoundingMode(RoundingMode.DOWN);
				}
			}
			/**
			 *Addition command recognized. Executes addition method.
			 */
			if (input.equals("+"))
			{
				/**
				 *n1 and n2 are variables set equal to the next doubles 
				 *given in the input file and fed to the addition method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble(), n2 = filescan.nextDouble();
				double answer = addition(n1, n2);
				System.out.println("+ " + n1 + " " + n2 + " = " + precise.format(answer));
			}
			/**
			 *Subtraction command recognized. Executes subtraction method.
			 */
			if (input.equals("-"))
			{
				/**
				 *n1 and n2 are variables set equal to the next doubles 
				 *given in the input file and fed to the subtraction method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble(), n2 = filescan.nextDouble();
				double answer = subtraction(n1, n2);
				System.out.println("- " + n1 + " " + n2 + " = " + precise.format(answer));
			}
			/**
			 *Multiplication command recognized. Executes multiply method.
			 */			
			if (input.equals("*"))
			{
				/**
				 *n1 and n2 are variables set equal to the next doubles 
				 *given in the input file and fed to the multiply method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble(), n2 = filescan.nextDouble();
				double answer = multiply(n1, n2);
				System.out.println("* " + n1 + " " + n2 + " = " + precise.format(answer));
			}
			/**
			 *Division command recognized. Executes division method.
			 */
			if (input.equals("/"))
			{
				/**
				 *n1 and n2 are variables set equal to the next doubles 
				 *given in the input file and fed to the division method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble(), n2 = filescan.nextDouble();
				double answer = division(n1, n2);
				System.out.println("/ " + n1 + " " + n2 + " = " + precise.format(answer));
			}
			/**
			 *Modulus command recognized. Executes modulo method.
			 */
			if (input.equals("%"))
			{
				/**
				 *n1 and n2 are variables set equal to the next integers 
				 *given in the input file and fed to the modulo method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				int n1 = filescan.nextInt(), n2 = filescan.nextInt();
				int answer = modulo(n1, n2);
				System.out.println("% " + n1 + " " + n2 + " = " + answer);
			}
			/**
			 *Cube command recognized. Executes cube method.
			 */
			if (input.equals("cube"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the cube method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = cube(n1);
				System.out.println("cube " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Sin command recognized. Executes sin method.
			 */
			if (input.equals("sin"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the sin method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = sin(n1);
				System.out.println("sin " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Cos command recognized. Executes cos method.
			 */
			if (input.equals("cos"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the cos method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = cos(n1);
				System.out.println("cos " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Tan command recognized. Executes tan method.
			 */
			if (input.equals("tan"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the tan method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = tan(n1);
				System.out.println("tan " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Squareroot command recognized. Executes sqrt method.
			 */
			if (input.equals("sqrt"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the sqrt method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = sqrt(n1);
				System.out.println("sqrt " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Factorial command recognized. Executes factorial method.
			 */
			if (input.equals("n!"))
			{
				/**
				 *n1 is a variable set equal to the next long 
				 *given in the input file and fed to the factorial method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				long n1 = filescan.nextLong();
				long answer = factorial(n1);
				System.out.println("n! " + n1 + " = " + answer);
			}
			/**
			 *Power command recognized. Executes pow method.
			 */
			if (input.equals("pow"))
			{
				/**
				 *n1 and n2 are variables set equal to the next doubles 
				 *given in the input file and fed to the pow method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble(), n2 = filescan.nextDouble();
				double answer = pow(n1, n2);
				System.out.println("pow " + n1 + " " + n2 + " = " + precise.format(answer));
			}
			/**
			 *Minimum command recognized. Executes min method.
			 */
			if (input.equals("min"))
			{
				/**
				 *count is a variable set equal to the next int
				 *given in the input file and identifies the number of
				 *variables the method will be processing 
				 */
				int count = filescan.nextInt(); 
				/**
				 *x is a variable set equal to the first input given.
				 *Printed to the user is the input entered up to x.
				 *Note that println is not used as we will be adding
				 *onto the printed string throughout the method.
				 */
				int x = filescan.nextInt(); 
				System.out.print("min " + count + " " + x + " ");
				/**
				 *Loop allows method to compare all variables inputted.
				 */				
				for (int j=1; j < count; j++)
				{
					/**
				 	 *y is a variable set equal to the next input given
					 *and is printed to the user. x and y are then fed
					 *to the min method. The resulting output is set 
					 *equal to x. When the loop repeats, it will scan
					 *the next variable and set it equal to y, then print y. 
				         *x and y are compared again until all inputs are exhausted.
				 	 */
					int y = filescan.nextInt();
					System.out.print(y + " ");
					x = Math.min(x, y);
				}
				/**
				 *x is now the minimum of all provided inputs.
				 *answer is a variable set equal to x and then printed.
				 *Note that \n is needed since println was not used.
				 */
				int answer = x;
				System.out.print("= " + answer + "\n");
			}
			/**
			 *Maximum command recognized. Executes max method.
			 */			
			if (input.equals("max"))
			{
				/**
				 *count is a variable set equal to the next int
				 *given in the input file and identifies the number of
				 *variables the method will be processing 
				 */
				int count = filescan.nextInt(); 
				/**
				 *x is a variable set equal to the first input given.
				 *Printed to the user is the input entered up to x.
				 *Note that println is not used as we will be adding
				 *onto the printed string throughout the method.
				 */				
				int x = filescan.nextInt(); 
				System.out.print("max " + count + " " + x + " ");
				/**
				 *Loop allows method to compare all variables inputted.
				 */
				for (int j=1; j < count; j++)
				{
					/**
				 	 *y is a variable set equal to the next input given
					 *and is printed to the user. x and y are then fed
					 *to the max method. The resulting output is set 
					 *equal to x. When the loop repeats, it will scan
					 *the next variable and set it equal to y, then print y. 
				         *x and y are compared again until all inputs are exhausted.
				 	 */
					int y = filescan.nextInt();
					System.out.print(y + " ");
					x = Math.max(x, y);
				}
				/**
				 *x is now the minimum of all provided inputs.
				 *answer is a variable set equal to x and then printed.
				 *Note that \n is needed since println was not used.
				 */
				int answer = x;
				System.out.print("= " + answer + "\n");
			}
			/**
			 *Round command recognized. Executes max method.
			 */				
			if (input.equals("round"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the round method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				long answer = round(n1);
				System.out.println("round " + n1 + " = " + answer);
			}
			/**
			 *Euler Power command recognized. Executes exp method.
			 */
			if (input.equals("exp"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the exp method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = exp(n1);
				System.out.println("exp " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Cuberoot command recognized. Executes cuberoot method.
			 */
			if (input.equals("cuberoot"))
			{
				/**
				 *n1 is a variable set equal to the next double 
				 *given in the input file and fed to the cuberoot method.
				 *answer is the output of the method. Printed to the user
				 *is the input received and the output produced.
				 */
				double n1 = filescan.nextDouble();
				double answer = cuberoot(n1);
				System.out.println("cuberoot " + n1 + " = " + precise.format(answer));
			}
			/**
			 *Command not recognized. Line is ignored.
			 */
			else
			{
				String skip = filescan.nextLine();
			}

		}
	}
	
}

