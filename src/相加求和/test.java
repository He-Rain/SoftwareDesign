package 相加求和;

import java.util.Scanner;

/**
 * @ClassName test
 * @Author 何雨铭
 * @Date 2022/11/27 20:21
 */
public class test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int  b=0;
        int a=input.nextInt();
        for (int i = 0; i < 5; i++) {
            b= a + b* 10;
            sum += b;
        }
        System.out.println("和为:"+sum);
    }
}
