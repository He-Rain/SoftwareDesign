package 其他算法;

import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName MyQueue
 * @Author 何雨铭
 * @Date 2023/8/30 19:14
 */
//好好学习，走向巅峰！
public class MyQueue extends Queue{
  private   transient  Object []arr;
   private  int  count;  //数组的长度   全局变量
   private int capacity=10;
   public MyQueue(){
       arr=new Object[capacity];
   }
   public MyQueue(int capacity){
       this.capacity=capacity;
       arr=new Object[capacity];
   }
    @Override
  public  void enqueue(Object element) {
     if(element==null){
         throw new NullPointerException("空指针异常");
     }
     //不考虑数组中原本就有数据这一种种情况。
//        往数组在添加元素的过程本身就是添加到一个元素的后面，（队尾），所以直接添加即可
     arr[count++]=element;  //这一步在添加元素的时候，count值从0开始取值,最后还多加了一次，就是数组的长度。
    }

    @Override
    public  Object dequeue() {
       if(arr.length!=0) {
           Object remove = arr[0];
//        队列中删除一个元素，所有数组中的元素整体往前移动
           System.arraycopy(arr, 1, arr, 0, arr.length - 1);
           count--;
           return remove;
       }
       return  null;
    }

    @Override
    public  Object peek() {
        if (count == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[0];
    }

    @Override
    public boolean isEmpty() {
       if(arr.length==0){
        return true;
       }
       return false;
    }
    @Override
    public  int size() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyQueue myQueue)) return false;
        return count == myQueue.count && capacity == myQueue.capacity && Arrays.equals(arr, myQueue.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(count, capacity);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "arr=" + Arrays.toString(arr) +
                ", count=" + count +
                ", capacity=" + capacity +
                '}';
    }
}
