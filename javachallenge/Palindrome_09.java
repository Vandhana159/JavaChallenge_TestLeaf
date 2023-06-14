package testleaf.javachallenge;

/*
 * Java Challenge (9/20)
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric 
characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class Palindrome_09 {

	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";
		String modifiedInput = input.replaceAll("[^a-zA-Z_0-9]", "").toLowerCase();
		char[] charInput = modifiedInput.toCharArray();
		char[] reverse = new char[charInput.length];
		int count = 0;
		for(int i = charInput.length-1; i >=0; i--)
		{
			reverse[count] = charInput[i];
			count++;
		}
		String string1 = new String(charInput);
		String string2 = new String(reverse);
		if(string1.equals(string2))
			System.out.println("true");
		else
			System.out.println("false");
	}}
