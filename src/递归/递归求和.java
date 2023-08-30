package 递归;

import java.util.Scanner;

/**
 * @ClassName 递归求和
 * @Author 何雨铭
 * @Date 2022/11/18 11:23
 */
//好好学习，走向巅峰！
public class 递归求和 {
    //求取1..n之间所有数的和
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s=sum( input.nextInt());
        System.out.println(s);
    }
    public static  int sum(int s)
    {
        if (s==0){
            return 0;
        }
        return sum(s-1)+s;
    }
}
