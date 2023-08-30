package 其他算法;
import java.util.Scanner;
/**
 @ClassName LongestCommonPrefix
 @Author 何雨铭
 @Date 2023/8/29 19:44
 */
//好好学习，走向巅峰！
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(LCP(new String[]{"apple", "appletite", "appelicable"}));
    }

    /**

     编写一个函数，接受一个字符串数组作为输入，返回这些字符串的最长公共前缀。

     输入: ["flower", "flow", "flight"]
     输出："fl"
     输入：["dog", "racecar", "car"]
     输出： ""
     输入：["apple", "appetite", "applicable"]
     输出： "app"
     @param str
     */
    public static String LCP(String str[]) {
        if (str == null || str.length == 0) {
            return "";
        }
// 找到数组中长度最小的字符串
        int minLen = Integer.MAX_VALUE;
        for (String s : str) {
            minLen = Math.min(minLen, s.length());
        }
// 比较每个字符串的字符是否相同
        int index = 0;
        while (index < minLen) {
            char c = str[0].charAt(index);
            for (int i = 1; i < str.length; i++) {
                if (str[i].charAt(index) != c) {
                    return str[0].substring(0, index);
                }
            }
            index++;
        }
        return str[0].substring(0, index);
    }
}