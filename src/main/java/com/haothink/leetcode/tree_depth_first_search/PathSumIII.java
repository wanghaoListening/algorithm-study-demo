package com.haothink.leetcode.tree_depth_first_search;

import java.util.Objects;

/**
 * Created by wanghao on 2021-06-22
 *
 * Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of
 * the values along the path equals targetSum.
 *
 * The path does not need to start or end at the root or a leaf, but it must go downwards
 * (i.e., traveling only from parent nodes to child nodes).
 *
 * Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * Output: 3
 * Explanation: The paths that sum to 8 are shown.
 *
 **/
public class PathSumIII {


  public static void main(String[] args) {

  }


  public int pathSum(TreeNode root, int targetSum) {


    return 0;
  }

  public int dfsPathSum(TreeNode root, int targetSum, int currentSum){



    return 0;
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
