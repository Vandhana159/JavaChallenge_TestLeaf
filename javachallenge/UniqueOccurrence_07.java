package testleaf.javachallenge;

import java.util.Arrays;

/*Java Problem (7/20)
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
Example 1: Input: arr = [1,2,2,1,1,3] Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2: Input: arr = [1,2] Output: false
Example 3: Input: arr = [-3,0,1,-3,1,1,1,-3,10,0] Output: true
 */
public class UniqueOccurrence_07 {
	public static void main(String[] args) {
		int[] nums = {-3,-3,-3,0,0,1,1,1,1,10}; 
		Arrays.sort(nums);//{-3,-3,-3,0,0,1,1,1,1,10}
		int[] freq = new int[nums.length];
		int[] order = new int[nums.length];
		int count = nums[0], elementCount = 1;
		boolean flag = false;
		//System.out.println(order.length);
		for(int i =0; i < nums.length; i++ )
		{
			order[i] = count;
			count++;
		}
		for(int i = 0; i< nums.length; i++) {
			elementCount = 1;
			for(int j =0; j<nums.length; j++) {
				if(order[i] == nums[j])
				{
					elementCount++;
				}
			}
			freq[i] = elementCount;
		}	
		for(int i = 0; i< freq.length; i++) {
			for(int j =i+1; j<freq.length; j++) {
				if(order[i] == nums[j])
				{
					flag = true;
				}
		}}
		System.out.println(flag);
		
}
}