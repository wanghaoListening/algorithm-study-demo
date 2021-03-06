package com.haothink.leetcode.sliding_window;

/**
 * Created by wanghao on 2021-03-16 mail:
 *
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray
 * [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray,
 * return 0 instead.
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 **/
public class MinimumSizeSubarraySum {


  public static void main(String[] args) {

    int target = 7;
    int[] nums = {2,3,1,2,4,3};
    MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
    System.out.println(minimumSizeSubarraySum.minSubArrayLen(target,nums));
  }


  public int minSubArrayLen(int target, int[] nums) {

    int minimumSubarraySum = 0;
    int startIndex = 0;
    int endIndex = 0;
    int eleSum = 0;

    while(endIndex < nums.length){

      if(eleSum < target){
        eleSum += nums[endIndex];
        endIndex++;

      }
      //should check eleSum >= target condition repeatedly after add nums[endIndex] to eleSum
      if(eleSum >= target){
        if(((endIndex - startIndex) < minimumSubarraySum) || minimumSubarraySum == 0){

          minimumSubarraySum = endIndex - startIndex;
        }
        startIndex ++;
        endIndex = startIndex;
        eleSum = 0;
      }
    }

    return minimumSubarraySum;

  }
}
