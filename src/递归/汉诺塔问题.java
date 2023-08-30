package 递归;

import java.util.Scanner;

/**
 * @ClassName 汉诺塔问题
 * @Author 何雨铭
 * @Date 2022/11/26 20:02
 */
//好好学习，走向巅峰！
public class 汉诺塔问题 {
//汉诺塔
//制作三个柱子
//三个变量代表三个柱子，第三个柱子是目的地
//只剩下一个盘子的时候，就表示要终止
//把最大的盘子上:面的N-1个盘子挪到第二个或者第三个上面来
//AB C
//System. out. println("A'"+"->"+"C");

        static int times;

    public static void main(String[] args) {
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.println("汉诺塔游戏开始啦");
        System.out.println("请输入盘子数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //调用汉诺塔
        hannoi(n, A, B, C);
        s.close();

    }

    public static void move(int disk, char M, char N ){
        System.out.println("第"+(++times)+"次移动, 盘子"+disk+ "  "+M+"------->"+N);
    }


    public static void hannoi(int n, char A, char B, char C){
        if(n == 1){
            move(n, A, C);
        }else{
            //移动上一关的步骤移动到B
            hannoi(n - 1, A, C, B);
            //把最大的盘子移动C塔
            move(n, A, C);
            //再把B上的上一关的盘子移动到C上就可以了
            hannoi(n - 1, B, A, C);

        }
    }

}
