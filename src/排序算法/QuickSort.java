package 排序算法;
import java.util.Arrays;
/**
 * @ClassName 快速排序
 * @Author 何雨铭
 * @Date 2023/8/7 14:36
 */
//好好学习，走向巅峰！
public class QuickSort {//QuickSort
//    方法一
//    public static void main(String[] args) {
//     int [] arr={4,5,8,3,1,2};
//     int low=0;
//     int high=arr.length-1;
//    quickSort(arr,low,high);
//        for (int i : arr) {
//            System.out.print(i+" ");
////            System.out.print("\t"+i+' '+"\t");
//        }
//    }
//    public static  void quickSort(int[] nums,int low,int high){
////        安全性验证
//        if(low<high){
////            选择一个基准值
//            int pivot=partition(nums,low,high);
//            // 分别对基准值左右两侧的子数组进行递归排序
//            quickSort(nums,low,pivot-1);
//            quickSort(nums,pivot+1,high);
//        }
//    }
////    核心算法
//    private static int partition(int[] nums,int low,int high){
//        // 选择最右边的元素作为基准值
//        int pivot=nums[high];
//        // 定义一个指针，用于指向比基准值小的元素的位置
//        int i=low-1;
//        for (int j = low; j < high; j++) {
//            if (nums[j]<pivot){
//                i++;
//                swap(nums,i,j);
//            }
//        }
//        // 将基准值交换到指针后一位，使基准值处于正确的位置
//        swap(nums,i+1,high);
//        // 返回基准值的位置
//        return i+1;
//    }
////    左右两边都找到值后就交换两个位置上面的值
//    public static void swap(int[] nums,int i,int j){
//        int temp=nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//    }


//  方法二（思路：先不直接交换基准值位置处的值，将该位置处的值留到最后，与i==j时，i和j指针共同所指向位置处的值做交换。相当于基准值位置处挖了一个坑，但是，我们一开始并不交换值到该位置处。）

    public static void main(String[] args) {
        int[] arr = {2, 2, 9, 0, -1, 7, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
//        为每一轮是否执行递归调用做判断。
        if (left >= right) {
            return;
        }
        // 定义一个基准值,找的最左边
        int pivot = arr[left];  //定义一个临时变量，保存起来，后面基准值归位会用得到的。必须存在的
        int i = left;  //左指针
        int j = right;  //右指针
        while (i!= j) {
            while (i < j && arr[j] >=pivot) {
                j--;
            }
            while (i < j && arr[i] <=pivot) { //此处的arr[i] <= pivot等于号，又因为此处的i值从0开始取值的，因此此处的arr[i] <= pivot与自身比较了一次，这里可以优化的。
                i++;
            }
//    交换两位置上面的值，可以单独写一个交换函数
            if (i<j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
//    交换基准值的位置
            if (arr[i]<=pivot) {
//        此时此刻i值已经发生了变化，不能用i值做下标,来表示原本基准值的处位置。
                arr[left] = arr[i];
                arr[i] = pivot;
            }
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
