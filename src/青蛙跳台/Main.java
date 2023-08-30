package 青蛙跳台;

/**
 * @ClassName Main
 * @Author 何雨铭
 * @Date 2022/11/26 19:57
 */
//好好学习，走向巅峰！
public class Main {
    public static void main(String[] args) {

            int n=10;
System. out . println(step(n));   }

    static int step(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        for (int i = 3; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;


        }
        return c;
    }}
