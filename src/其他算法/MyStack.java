package 其他算法;

/**

 @ClassName MyStack
 @Author 何雨铭
 @Date 2023/8/29 19:32
 */
//好好学习，走向巅峰！
/**

 栈（Stack） 一种具有后进先出（LIFO）特性的数据结构，常用于处理函数调用、表达式求值等。

 如何创建⼀个类实现栈的功能？

 底层存元素使⽤数组

 添加元素始终添加到数组的最后⼀个

 获取元素时永远从最后⼀个开始取元素

 扩容问题
 */
public class MyStack extends Stack{
    private Object[] arr;
    private int count;
    private int capacity;

    public MyStack() {
        capacity = 10;
        arr = new Object[capacity];
    }

    public MyStack(int capacity) {
        if (capacity <= 0) {
            this.capacity = 10;
        } else {
            this.capacity = capacity;
        }
        arr = new Object[this.capacity];
    }

    public void push(Object element) {
        if (count == capacity) {
            expandCapacity();
        }
        arr[count] = element;
        count++;
    }

    public Object pop() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object remove = arr[count - 1];
        arr[count - 1] = null;
        count--;
        return remove;
    }

    public Object peek() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    private void expandCapacity() {
        int newCapacity = capacity * 2;
        Object[] newArr = new Object[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, count);
        arr = newArr;
        capacity = newCapacity;
    }
}