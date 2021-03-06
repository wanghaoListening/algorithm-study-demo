package com.haothink.leetcode.sliding_window;

/**
 * Created by wanghao on 2021-03-17
 *
 * Given a string s that consists of only uppercase English letters, you can perform at most k
 * operations on that string.
 *
 * In one operation, you can choose any character of the string and change it to any other uppercase
 * English character.
 *
 * Find the length of the longest sub-string containing all repeating letters you can get after
 * performing the above operations.
 *
 * Input: s = "ABAB", k = 2
 *
 * Output: 4
 *
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 * "AABABBA" 1
 *
 * "AAAA"
 * 0
 *
 * check corner case what the k ==0
 **/
public class LongestRepeatingCharacterReplacement {


  public static void main(String[] args) {

    LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
    String s = "AAAA";
    int k = 0;

    System.out.println(longestRepeatingCharacterReplacement.characterReplacement(s, k));
  }


  public int characterReplacement(String s, int k) {

    int longestRepeatingCharacter = 0;
    char[] chs = s.toCharArray();

    int startIndex = 0;
    int endIndex = startIndex;
    int modifyCount = 0;
    while (endIndex < chs.length) {

      if(modifyCount >= k ||endIndex == chs.length-1 ) {
        if ((endIndex - startIndex > longestRepeatingCharacter) || (longestRepeatingCharacter
            == 0)) {
          longestRepeatingCharacter = (startIndex==0)?(endIndex-startIndex+1):endIndex-startIndex;
        }
        startIndex++;
        endIndex = startIndex;
        modifyCount = 0;
      }

      if(chs[startIndex] == chs[endIndex]) {
        endIndex++;
        continue;
      }
      if((chs[startIndex] != chs[endIndex]) && modifyCount < k) {
        modifyCount++;
        endIndex++;
      }

    }
    return longestRepeatingCharacter;
  }

}
