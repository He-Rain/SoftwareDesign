package 排序算法;

/**
 * @ClassName InsertSort
 * @Author 何雨铭
 * @Date 2023/8/8 15:17
 */
//好好学习，走向巅峰！
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr=new int[]{9,2,8,4,5,6};
        for (int i = 0; i<arr.length-1; i++) { //外层循环控制轮数，
            int j=i+1;
            int temp=arr[j]; //根据算法的思想，这里的个临时变量必须存在,
//            for(;arr[j]<arr[i]&&i>=0;j--){
//                arr[j]=arr[i];
//                i--;
//            }
            while (temp<arr[j-1]&&i>=0){
                arr[i+1]=arr[i];
                    i--;
            }
            arr[i+1]=temp;
        }
        for (int i : arr) {
            System.out.print(i+"\t");
            System.out.println(i==0?"":i);
        }
    }

}
