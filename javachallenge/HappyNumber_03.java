package testleaf.javachallenge;
/*Java Challenge(3/20)
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 * Example 1: Input: n = 19		Output: true
 * Explanation: 1^2 + 9^2 = 82 -> 8^2 + 2^2 = 68 -> 6^2 + 8^2 = 100 -> 1^2 + 0^2 + 0^2 = 1
 * Example 2:Input: n = 2       Output: false
 * Explanation: 2^2 = 4 -> 4^2 = 16 -> 1^2 + 6^2 = 37 -> 3^2 + 7^2 = 58 -> 5^2 +8^2 = 89 -> 8^2 + 9^2 = 145 -> 1^2 + 4^2 + 5^2 = 42 ->
 * 4^2 + 2^2 = 24 -> 2^2 + 4^2 = 20 -> 2^2 + 0^2 = 4 goes on (Infinite Loop) 
 */
public class HappyNumber_03 {
	public int sumOfSquareOfDigits(int n)
	{
		int out=0, a=0;
		while(n>0)
		{
		a= n%10;
		out =out +(a*a);
		n = n/10;
		}
		return out;
	}
	public void happyNumber(int num)
	{	
		if(num == 1)
			System.out.println("True - Happy number");
		else if(num == 4)
			System.out.println("False - Unhappy number");
			}
	public static void main(String[] args) {
		HappyNumber_03 hp = new HappyNumber_03();
		int num =2;
		int output = num;
		while(output!=1 && output!=4)
		{
			output =hp.sumOfSquareOfDigits(output);
	}
		hp.happyNumber(output);
	}
}
