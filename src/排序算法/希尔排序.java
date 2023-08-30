package 排序算法;
import java.util.Arrays;

/**
 * @ClassName 希尔排序
 * @Author 何雨铭
 * @Date 2022/11/18 9:19
 */
//好好学习，走向巅峰！
public class 希尔排序 {
    //希尔排序是插入排序的升级级版本
//希尔排宇将数组分成两个部分，然后对两个部分进行插入排序，排序完成之后进number
//1.使用循环进行分割for i=numer. length/2 i>=1;i=i/2;
//2.遍历获取数据
//3.分组for  判断大小最后跟换位置
public static void main(String[] args) {
    int [] number = {10,45,78,12,4564,14};
    int length = number.length;
    int temp;
    for (int step = length/2; step>=1; step/=2) {
        for (int i=step; i<length;i++) {
            temp=number[i];
            int j=i-step;
            while (j>=0&&number[j]>temp){
                number[j+step]=number[j];
                j-=step;
            }
            number[j+step]=temp;
        }
    }
    System.out.print(Arrays.toString(number));
}
}
