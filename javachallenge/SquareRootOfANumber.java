package testleaf.javachallenge;
import java.util.Scanner;
/*
 * Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 * Example 1:Input: x = 4,Output: 2
 * Example 2:Input: x = 8,Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
*/
/*Create a variable (counter) i and take care of some base cases, (i.e when the given number is 0 or 1).
Run a loop until i*i <= n, where n is the given number. Increment i by 1.
The floor of the square root of the number is i – 1*/
public class SquareRootOfANumber_01 {
	public int squareRoot(int num)
	{
		int output = 0;
		int i = 1;
		while(i*i <= num)
		{
			output = i;
			i++;
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SquareRootOfANumber sr = new SquareRootOfANumber();
		System.out.println("Enter input value ");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println(sr.squareRoot(num));
		}
		else
		{
			System.out.println("Enter a positive integer value");
		}
		
	}
}
