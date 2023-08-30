package 矩阵算法;

import java.util.Scanner;
/**
 * @ClassName Tranga
 * @Author 何雨铭
 * @Date 2022/11/26 16:41
 */
//好好学习，走向巅峰！
public class Tranga {
//. 矩阵算法是根据矩阵乘法来进行的
//1.当矩阵A的列数等于矩阵B的行数的时候，A和B就可以相乘
//2.矩阵车C的行数等于矩阵A的行数，C的列数等于B的列数
//2.乘积C的第n行和第籍m列的元素就等于矩阵A的第m行的元素与矩B的第
//n列对应元素乘积之和
//假设说a为2*3的矩阵和b为3*2的矩阵c为a*b的结果
//
//在控制台输入自己的数据然后得到矩阵乘法
// 可以使用二维数组解决矩阵的问题
public static void main(String[] args) {

Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int[][] a = new int[x][y];
        int[][] b = new int[y][z];

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < y; i++){
            for(int j = 0; j < z; j++){
                b[i][j] = in.nextInt();
            }
        }

        int[][] c = new int[x][z];
        int count = 0;
        for(int i = 0; i < z; i++){
            for(int k = 0; k < x; k++){
                int temp = 0;
                for(int j = 0; j < y; j++){
                    int a1 = a[k][j];
                    int b1 = b[j][i];
                    temp += a1 * b1;
                    count++;
                }
                c[k][i] = temp;
            }
        }
        System.err.println("count->"+count);
        for(int i = 0; i < x; i++){
            for(int k = 0; k < z  - 1; k++){
                System.out.print(c[i][k]+" ");
            }
            System.out.print(c[i][z - 1]+"\n");

        }
        }
    }
}

