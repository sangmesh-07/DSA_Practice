/*Problem Statement

Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
You may assume that each input has exactly one solution, and you may not use the same element twice.

✅ Example

Input:
nums = [2,7,11,15], target = 9

Output:
[0,1]

Because nums[0] + nums[1] = 2 + 7 = 9.*/
class SUM {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] {}; // No solution case
    }
}
