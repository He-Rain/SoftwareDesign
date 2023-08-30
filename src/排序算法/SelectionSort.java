package 排序算法;

import java.util.Arrays;

/**
 * @ClassName 选择排序
 * @Author 何雨铭
 * @Date 2022/11/18 8:32
 */
//好好学习，走向巅峰！
public class SelectionSort {
    //1. 在当前的列表中找到最小的值，然后放到列表的最前面，然后再从剩余的元素中
//找到最小的值，然后进行替换

    //1.要找到最小的值for i< 数组. length-1
    //2.要记录一下最小的这 个值以及最小值的下标
    //3.再次循环找到最小的数for
    //4.更新最小的数if 当前的数小于之前最小的数
    //数据更换
    public static void main(String[] args) {
//        方法一
//        int[] number = {1, 45, 78, 12, 4564, 14,14,15,15};
//        for (int i = 0; i < number.length - 1; i++) {
//            int min = i;
//
//            // 每轮需要比较的次数 N-i
//            for (int j = i + 1; j < number.length; j++) {
//                if (number[j] < number[min]) {
//                    // 记录目前能找到的最小值元素的下标
//                    min = j;
//                }
//            }
//
//            // 将找到的最小值和i位置所在的值进行交换
//            if (i != min) {
//                int tmp = number[i];
//                number[i] = number[min];
//                number[min] = tmp;
//            }
//
//        }
//        for (int i = 0; i <= 8; i++) {
//            System.out.print(number[i]+" ");
//        }

//        方法二
        int[] arr = new int[]{1, 45, 78, 12, 4564, 14,14,15,15};
        for(int i=0;i<arr.length-1;i++){//对原本数组中所有的值进行拿出来。与所有剩下的值都比较。  控制轮数同时也防止数组下标越界情况(j=i+1)
            int minIndex=i;  //这里的这个临时变量最小下标根据选择排序的算法思想必须存在。
            int currentElement=arr[i];
            for (int j=i+1;j< arr.length;j++){  //这里的j=i+1这种写法是优化后的算法，因为选择排序每经过一轮排序就排好一个元素，已经排好序的元素，就没必要再次参与排序过程中的比较大小值了。
                if(arr[i]>arr[j]){
                    minIndex=j;
                }
            }
            arr[i]=arr[minIndex];
            arr[minIndex]=currentElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}


