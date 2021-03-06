package com.haothink.bjtu;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wanghao
 * @date 2019年08月04日 17:33
 * description: 小明的作业
 *
 * 题面描述
 * 小明每天都有很多作业要写，今天的作业内容是将一些分数写成小数的形式。众所周知，有些分数可以写成有限小数，比如 1 / 2 = 0.5 ，而有些分数会写成无限循环小数的形式，比如 1 / 3 = 0.33333 ……，小明觉得这个作业太麻烦了，于是请你来编程帮他完成这个作业。
 *
 * 输入数据
 * 输入数据的第一行为一个正整数 T ，表示测试数据的组数。接下来有T行测试数据，每行测试数据为空格分隔的两个正整数 a, b ，代表分数 a / b( 1 ≤ T ≤ 20, 0 ≤ a ≤ b) 。
 *
 * 输出数据
 * 对于每一组输入数据，输出一行结果。先输出” Case #id: ”，表示第 id 组数据， id 从 1 开始。如果该组数据能够写成有限小数，则在同一行中输出“ heiheihei ”，否则输出到该无限循环小数的第一个循环节结束。保证数据中所有无限小数均是 0.abcabc ……这样的形式，不会有形如 0.abcbc ……的小数，且循环节长度不超过 9 。
 *
 * 样例输入
 * 4
 * 1 2
 * 1 3
 * 1 4
 * 2 3
 *
 * 样例输出
 * Case 1: heiheihei
 * Case 2: 0.3
 * Case 3: heiheihei
 * Case 4: 0.6
 */
public class XiaoMingDeZuoYe {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int groupCount = Integer.parseInt(scan.nextLine());
        List<String> results = new ArrayList<>(groupCount);
        for(int i=0;i<groupCount;i++){

            String[] str = scan.nextLine().split(" ");
            BigDecimal bigA = new BigDecimal(str[0]);
            BigDecimal bigB = new BigDecimal(str[1]);
            if(isLoop(bigA,bigB)){
                results.add(bigA.divide(bigB, 1, RoundingMode.DOWN).toString());
            }else{
                results.add("heiheihei");
            }
        }

        for(int i=0;i<results.size();i++){
            System.out.println("Case #"+(i+1)+": "+results.get(i));
        }
    }



    public static boolean isLoop(BigDecimal bigA,BigDecimal bigB){
        try{
            bigA.divide(bigB);
            return false;
        }catch(Exception e){
            return true;
        }
    }



}
