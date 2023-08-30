package 排序算法;

import java.util.Scanner;

/**
 * @ClassName BinarySearch
 * @Author 何雨铭
 * @Date 2023/8/9 14:54
 */
//好好学习，走向巅峰！
public class BinarySearch {
//   折半查找/二分查找
public static void main(String[] args) {
    System.out.println("请输入你要查找的数字：");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int[] arr = new int[]{1, 3, 6, 6, 9, 10, 11, 12};
    int low = 0;
    int high = arr.length-1;
    int medium = (low + high) / 2;
    while (arr[medium] != number) {
        if (number < arr[medium]) {
//            high=medium;
//            medium=(low+high)/2;
            high = medium - 1;
        } else if (number > arr[medium]) {
//            low=medium;
//            medium=(low+high)/2;
            low = medium + 1;
        }
        if (low > high) {
            System.out.println("输入的数字不存在");
            break;
        }
        medium = (low + high) / 2;
    }
    if (low <= high) {
        System.out.println(number + "的下标是：" + medium);
    }
}
//思路二
//      while (high >= low) {
//        int medium = (low + high) / 2; //尽量让变量的作用范围缩小。
//            if (arr[medium] == number) {
//                System.out.println(medium);
//                break;
//            } else if (arr[medium] > number) {
//                high = medium - 1;
//            } else {
//                low = medium + 1;
//            }
//            medium = (high + low) / 2;
//        }
//        if (low > high) {
//            System.out.println(-1);
//        }

//}
}
