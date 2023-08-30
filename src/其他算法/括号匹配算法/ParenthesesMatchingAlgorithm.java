package 其他算法.括号匹配算法;

import java.util.Scanner;

/**
 * @ClassName ParenthesesMatchingAlgorithm
 * @Author 何雨铭
 * @Date 2023/8/28 22:18
 */
//好好学习，走向巅峰！
public class ParenthesesMatchingAlgorithm {
    /**
     * 编写一个函数，接受一个包含括号字符的字符串，判断括号是否匹配有效。
     * 例如，"()[]{}" 是有效的，但 "(]" 是无效的。
     * > 输入："()[]{}"
     * > 输出：true
     * > 输入："(]"
     * > 输出：false
     * > 输入："{[()]}"
     * > 输出：true
     * @param args
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        boolean result=isValid(string);
        System.out.println(result);
    }
    public static boolean isValid(String string){
        int count=0;
        int count1=0;
        int count2=0;
        string=string.replaceAll(" ","");
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if (ch=='('){
                count++;
            }
            else if(ch==')'){
               count--;
            }
            if (ch=='['){
                count1++;
            }
            else if(ch==']'){
                count1--;
            }
            if (ch=='{'){
                count2++;
            }
            else if(ch=='}'){
                count2--;
            }
        }
        if (count==0&&count1==0&&count2==0){
            return true;
        }
        return false;
    }
}
