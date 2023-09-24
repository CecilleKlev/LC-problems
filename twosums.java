/*Given an array of integers "nums" and an integer "target", 
return indices of the two numbers such that they add up to "target"

You may assume that each input would have exactly one solution, and you may not use 
the same element twice.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

TOPIC: Array

 */

class Solution{
    public int[] twoSum(int[] nums, int target){ //The method signatur. It takes two parameteres: nums and target
       
        for(int i =0; i <nums.length; i++){
            for(int j = i+1; j < nums.length; j++ ){
                if(nums[i] + nums[j] == target){
                    return new int[] [i, j];
                }
            }
        }   
        return nums;
    }
}


 /*
 Use two nested loops to iterate through nums array. The outerloop , controlled by variable i, iterates through the array from beginning (index 0)
 to the end (index nums.length-1). This loop represents the first number in the pair.

 The inner loop, controlled by the variable j, iterates through the array. starting from the index next to the curren i(i+1) to the end of the array.
 This loop represents the second number in the pair. 

 Inside the inner loop, theres an if statement that cheks if the sum og nums[i](the number at index i) and nums j (the number at index j ) is equal to the
 target. If they are equal, it means that youve found your pair of numbers that adds up to the target. 

 The code returns a new intefer array containing the indices i and j where the two numbers were found. it uses new int[]{i,j} syntax to crate
 and return this array

 If no pair is found after going through the possible combinations in the nested loop, the code retuns the input array nums as there are no valid indices to return.
 
 */ 