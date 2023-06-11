package testleaf.javachallenge;

import java.util.Arrays;

/* Java Challenge(2/20)
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space. 
 * Example 1:Input: nums = [2,2,1]  Output: 1
 * Example 2:Input: nums = [4,1,2,1,2] Output: 4 
 * Example 3:Input: nums = [1] Output: 1
*/
public class FindUniqueElements_02 {
public static void main(String[] args) {
	int[] nums = {1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9};
	Arrays.sort(nums);
	int count =0;
		if(nums.length == 1)
			System.out.println(nums[nums.length-1]);
		else 
		{
		for(int i = 0; i<nums.length;i++)
		{	
			count =0;
			for(int j =0;j <nums.length;j++)
			{
			if(nums[i]== nums[j])
				{
				count++;
	        	}
			}
			if(count == 1)
				{
				System.out.println(nums[i]);
				}
		
		}
		}	
}}
