package 排序算法;

import java.util.Arrays;

/**
 * @ClassName 归并排序
 * @Author 何雨铭
 * @Date 2022/11/18 10:14
 */
//好好学习，走向巅峰！
public class 归并排序 {
    //此排序法是最 稳定并且用的相对来说比较多
//是将n个元素分成两份，使用递归排序将两个子序列进行排序操作
//直到不能排序位置
//先拆分，然后再合并
// 1.先拆分数组左边右边(L+r)/2 .
//2.合并需要判断左边和右过
    public static int[] sort(int[] nums, int l, int r) {
        if (l == r)
            return new int[] { nums[l] };

        int mid = l + (r - l) / 2;
        int[] leftArr = sort(nums, l, mid); //左有序数组
        int[] rightArr = sort(nums, mid + 1, r); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }
    public static void main(String[] args) {
        int[] number ={10,45,78,12,4564,14};
        int[] a = sort(number, 0, number.length - 1);
//        for (int x : a) {
//            System.out.print(x+" ");
//        }
        System.out.println(Arrays.toString(a));
    }

}
