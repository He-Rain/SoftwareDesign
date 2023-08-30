/**
 * @ClassName ThreadTwo
 * @Author 何雨铭
 * @Date 2022/11/16 20:01
 */
//好好学习，走向巅峰！
//实现线程接口
public class ThreadTwo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new Z());//代理模式
   thread.start();
        for (int i = 1; i < 20; i++) {
            Thread.sleep(50);
            System.out.println("这是主线程");

        }

    }
}
class Z implements Runnable{
    private  int sum=0;
    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(50); //线程等待时间
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("这是子线程"+i);
        }
    }
}