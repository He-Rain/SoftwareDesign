package 递归;

/**
 * @ClassName 递归算法
 * @Author 何雨铭
 * @Date 2022/11/18 11:14
 */
//好好学习，走向巅峰！
public class 递归算法 {
    //f什么是递归，递归就是无限的调用自己，直到条件结束为止
//求阶乘6的阶乘
    static int jiecheng (int n) {
        if (n == 1) {
            return 1;//停止条件

        } else {
            return n * jiecheng(n - 1);//不为结束的时候就一直执行

        }
    }
        public static void main (String[]args){
            int n = 6;
            int result = jiecheng(n);
            System.out.println(result);
        }
    }


