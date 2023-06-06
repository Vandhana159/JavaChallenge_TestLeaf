package testleaf.javachallenge;

import java.util.Arrays;

/*
 * Java Problem (4/20)
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 * Example 1: Input: nums = [3,2,3]  		 	 Output: 3
 * Example 2: Input: nums = [2,2,1,1,1,2,2]      Output: 2
 * Example 3: Input: nums = [1,2,3,3,4,4,4,1]    Output: No element found
 */
public class MajorityWins_04 {
public static void main(String[] args) {
	int[] nums = {1,2,3,3,4,4,4,1};
	int major=0;
	boolean flag= false;
	Arrays.sort(nums);
	for(int i=0; i < nums.length; i++)
	{	int count = 0;
		for(int j=0; j<nums.length; j++)
		{
			if(nums[i] == nums[j])
				count++;
		}
		if(count >(nums.length/2))
			{
			major = nums[i];
			flag = true;}
	}
	if(flag)
		System.out.println(major);
	else
		System.out.println("No major elements in the array");
}
}