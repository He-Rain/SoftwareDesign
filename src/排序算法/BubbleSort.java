package 排序算法;

import java.util.Arrays;

/**
 * @ClassName 冒泡排序
 * @Author 何雨铭
 * @Date 2022/11/17 0:44
 */
//好好学习，走向巅峰！
public class BubbleSort {
    //比较相邻的两个数，根据比较的结果来交换自己的位置，最终达到排序的目的
    //1.遍历数组
    //2.根据下标进行比较，用- -个第三万来解决这个问题
    public static void main(String[] args) {
        int[] number = {1, 45, 78, 12, 4564, 14};
//        for (int i = 0; i<number.length-1;i++){  //i表示此时已参与并且从首元素开始完成运算的元素的个数(即此时已经执行的轮数)   number.length-1表示控制轮数。 外层循环就单纯的表示控制轮数，其种循环变量i值不做数组的索引的用处。
//            for (int j = 0; j <number.length - 1 - i;j++){ //number.length - 1 - i表示控制比较的次数同时控制着数组能否取得的到每轮要排序的元素中最大下标的值即每轮遍历能否遍历完所有元素。以及防止数组的下标越界的情况:number[j+1]。 j表示遍历数组的索引。  內层循环表示操作的具体行为。
//                if (number[j] > number[j+1]) {
//                    int temp = number[j];
//                    number[i] = number[i + 1];
//                }
//            }
//        }
        int[] arr = {2, 8, 3, 6, 1};
        outer: for (int i = 1; i <= arr.length - 1; i++) {//控制轮数，i表示已参与并且从首元素开始完成运算的元素的个数加1(即已经执行的轮数加1)
            for (int j = 1; j <=arr.length - i; j++) { //控制比较的次数，其中j <=arr.length - i这里的等于号必须存在，因为这关系着每轮遍历过程中能不能取得到每轮要排序的元素中最大下标对应的值。即每轮遍历能否遍历完所有元素。
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
//        for (int a : number) {
//            System.out.print(a + " ");
//        }
    }
}
//                    number[j + 1] = temp;
//