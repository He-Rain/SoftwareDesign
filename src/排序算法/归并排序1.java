package 排序算法;

/**
 * @ClassName 希尔排序1
 * @Author 何雨铭
 * @Date 2022/11/18 10:45
 */
//好好学习，走向巅峰！
public class 归并排序1 {
    public static void sort(int[] number, int left, int right) {//拆分
        if (left < right) {
            int mid = (left + right) / 2;
            sort(number, left, mid);
            sort(number, mid + 1, right);
            hb(number, left, mid, right);
        }
    }
        public static void hb(int number[],int left,int mid,int right){
            int tmp[] = new int[number.length];
            int i,j,k;
            for(k=left;k<=right;k++){
                tmp[k] = number[k];
            }
            for(i=left,j=mid+1,k=i;i<=mid && j<=right;k++){
                if(tmp[i]<=tmp[j]){
                    number[k] = tmp[i];
                    i++;
                }else{
                    number[k] = tmp[j];
                    j++;
                }
            }
            while(i<=mid) number[k++]=tmp[i++];
            while(j<=right) number[k++]=tmp[j++];
        }

        public static void main(String[] args) {
        int [] number = {1,45,78,12,4564,14};
        int s = 0;
        int e = number.length-1;
        sort(number,s,e);
        for(int i : number){
            System.out.print(i+" ");
        }
    }
}


