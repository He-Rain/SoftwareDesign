package 水仙花数;

import java.util.Scanner;

/**
 * @ClassName WaterFlower
 * @Author 何雨铭
 * @Date 2022/11/27 19:43
 */
public class WaterFlower {
    public static void main(String[] args) {
//水仙花数
//有一个三位数，它的每一位上的数字的平方的和都等于它本身
//153=1*1+5*5+3*3
//100- 1000以内的水仙花数
        for (int i = 100; i < 1000; i++) {
           int   g = i%10;
            int  s = (i/10)%10;
             int  b = i/100;
            double sum= Math.pow(g,3)+  Math.pow(s,3)+  Math.pow(b,3);
            if (sum==i){
                System.out.print(i+" ");}
          }


        }

    }
