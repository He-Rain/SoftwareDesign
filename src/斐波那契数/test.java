package 斐波那契数;

import java.util.Scanner;

/**
 * @ClassName test
 * @Author 何雨铭
 * @Date 2022/11/26 17:38
 */
//好好学习，走向巅峰！
public class test {
        static int fabnaci(int n) {
            if(n==0)return 0;
            if(n==1)return 1;
            return fabnaci(n-1)+fabnaci(n-2);
        }
        public static void main(String[] args) {
            Scanner s =new Scanner(System.in);
            System.out.println("输入你想要的项数：\n");
            int n =s.nextInt();
            for(int i=0;i<n;i++) {
                System.out.println(fabnaci(i));
            }
        }
    }
