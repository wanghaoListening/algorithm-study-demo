package com.haothink.leetcode.two_pointers;

/**
 * Created by wanghao on 2021-03-21 mail:
 *
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical
 * lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which,
 * together with the x-axis forms a container, such that the container contains the most water.
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 **/
public class ContainerWithMostWater {


  public static void main(String[] args) {


    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    int[] height = {1,1};
    System.out.println(containerWithMostWater.maxArea(height));
  }

  public int maxArea(int[] height) {

    int maxArea = 0;
    int startIndex = 0;
    int endIndex = height.length-1;

    while (startIndex < endIndex){

      // take smaller value as height
      int heightValue = height[startIndex]>height[endIndex]?height[endIndex]:height[startIndex];
      int width = endIndex-startIndex;

      if(heightValue * width > maxArea){
        maxArea = heightValue*width;

      }
      if(height[startIndex] < height[endIndex]){

        startIndex ++;
      }else if(height[startIndex] > height[endIndex]){

        endIndex --;
      }else{
        //height[startIndex] == height[endIndex]
        //the bigger one of forward num will be moving
        if(height[startIndex+1] >= height[endIndex-1]){
          startIndex ++;
        }else {
          endIndex--;
        }
      }
    }

    return maxArea;
  }

}
