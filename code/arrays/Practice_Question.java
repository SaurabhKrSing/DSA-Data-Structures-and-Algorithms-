package code.arrays;

public class Practice_Question {

  // Question 1: Given an integer array nums,return true if any value appears at
  // least twice in the array,and return false if every element is distinct.

  // Example 1:Input:nums=[1,2,3,1]Output:true
  // Example 2:Input:nums=[1,2,3,4]Output:false
  // Example 3:Input:nums=[1,1,1,3,3,4,3,2,4,2]Output:true

  // Constraints:•1<=nums.lengtth<=105•-109<=nums[i]<=109

  // Solution:

  // Approach 1 -Brute Force (O(n^2))

  // public static boolean containsDuplicate(int[] nums) {
  // for (int i = 0; i < nums.length - 1; i++) {
  // for (int j = i + 1; j < nums.length; j++) {
  // if (nums[i] == nums[j]) {
  // return true;
  // }
  // }
  // }
  // return false;
  // }

  // Approach 2 - using Sets (O(n))
  /*
   * You should have a basic knowledge about Java HashSets before following
   * Approach 2. It willbe
   * taught to you in later chapters.
   */

  // public static boolean containsDuplicate(int[] nums) {
  // HashSet<Integer> set = new HashSet<>();
  // for (int i = 0; i < nums.length; i++) {
  // if (set.contains(nums[i])) {
  // return true;
  // } else {
  // set.add(nums[i]);
  // }
  // }
  // return false;
  // }

  // public static void main(String[] args) {
  // // int[] nums = { 1, 2, 3, 1 }; // Output:true
  // // int[] nums = { 1, 2, 3, 4 }; // Output:false
  // int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }; // Output:true
  // // System.out.println("Contains Duplicate : " + containsDuplicate(nums));

  // System.out.println("Contains Duplicate : " + containsDuplicate(nums));

  // }

  // ===================================================================================

  // Question 2: There is an integer array nums sorted in ascending order (with
  // distinct values). Prior to being passed to your function, nums is possibly
  // rotated at an unknown pivot index k (1 <= k < nums.length) such that the
  // resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1],
  // ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at
  // pivot index 3 and become [4,5,6,7,0,1,2]. Given the array nums after the
  // possible rotation and an integer target, return the index of target if it is
  // in nums, or -1 if it is not in nums. You must write an algorithm with O(log
  // n) runtime complexity.

  // Example 1:
  // Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
  // Output:4

  // Example 2:
  // Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
  // Output:-1

  // Example 3:
  // Input: nums = [1], target = 0
  // Output:-1

  // Constraints:
  // • 1 <= nums . lengtth <= 5000
  // • -104 <= nums [ i ] <= 104
  // • All values of nums are unique.
  // • nums is an ascending array that is possibly rotated.
  // • -104 <= target <= 104

  // Solution

  // public static void main(String[] args) {
  // int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
  // int target = 0; // Output:4

  // int nums[] = {4, 5, 6, 7, 0, 1, 2};
  // int target = 3; // Output:-1

  // int nums[] = { 1 };
  // int target = 0; // Output:-1
  // }
}
