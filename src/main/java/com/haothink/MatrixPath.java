package com.haothink;

/**
 * @author wanghao
 * @date 2019年06月30日 16:48
 * description: 矩阵中的路径
 *
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中任意一格开始，
 * 每一步可以在矩阵中间向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 *
 * 举例分析
 * 例如在下面的 3*4 的矩阵中包含一条字符串“bcced”的路径。但矩阵中不包含字符串“abcb”的路径，因为字符串的第一
 * 个字符 b 占据了矩阵中的第一行第二格子之后，路径不能再次进入这个格子。
 *
 * a b c e
 * s f c s
 * a d e e
 *
 * 解题思路
 * 这是一个可以用回朔法解决的典型题。首先，在矩阵中任选一个格子作为路径的起点。假设矩阵中某个格子的字符为 ch，
 * 那么这个格子不可能处在路径上的第 i 个位置。如果路径上的第 i 个字符不是 ch，那么这个格子不可能处在路径上的
 * 第 i 个位置。如果路径上的第 i 个字符正好是 ch，那么往相邻的格子寻找路径上的第 i+1 个字符。除在矩阵边界上
 * 的格子之外，其他格子都有 4 个相邻的格子。重复这个过程知道路径上的所有字符都在矩阵中找到相应的位置。
 *
 * 由于回朔法的递归特性，路径可以被开成一个栈。当在矩阵中定位了路径中前 n 个字符的位置之后，在与第 n 个字符对
 * 应的格子的周围都没有找到第 n+1 个字符，这个时候只要在路径上回到第 n-1 个字符，重新定位第 n 个字符。
 *
 * 由于路径不能重复进入矩阵的格子，还需要定义和字符矩阵大小一样的布尔值矩阵，用来标识路径是否已经进入每个格子。
 *
 * 当矩阵中坐标为（row,col）的格子和路径字符串中下标为 pathLength 的字符一样时，从 4 个相邻的格子 (row,col-1),
 * (row-1,col),(row,col+1) 以及 (row+1,col) 中去定位路径字符串中下标为 pathLength+1 的字符。
 *
 * 如果 4 个相邻的格子都没有匹配字符串中下标为 pathLength+1 的字符，表明当前路径字符串中下标为pathLength的字符
 * 在矩阵中的定位不正确，我们需要回到前一个字符 (pathLength-1)，然后重新定位。
 *
 * 一直重复这个过程，直到路径字符串上所有字符都在矩阵中找到合适的位置
 */
public class MatrixPath {



    //四个移动方位 上，下，左，右
    private static int[][] nextOrientation = {{0,-1},{0,1},{-1,0},{1,0}};


    public static void main(String[] args) {

    }


    /**
     *
     * @param chs
     *        矩阵
     * @param row
     *        横坐标
     * @param column
     *        纵坐标
     * @param str
     *        要查找的字符串
     * @return
     *        是否存在路径
     */
    public static boolean hasPath(char[][] chs,int row,int column,char[] str){

        return false;
    }


    public static void backTrack(){

    }

}
