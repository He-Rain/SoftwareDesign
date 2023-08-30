/**
 * @ClassName ThreadTest
 * @Author 何雨铭
 * @Date 2022/11/14 23:01
 */
//好好学习，走向巅峰！
    //1.实现线程的方法继承线程类Thread
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        S s=new S();
        s.start();//启动线程
        for (int i = 1; i < 20; i++) {
            Thread.sleep(50);
            System.out.println("这是主线程");

        }
    }
}
class S extends  Thread{
    private  int sum=0;
    public  void run(){
        //用来跑线程的 这个方法来自于线程接口
        //写线程的业务逻辑，以线程求和为例
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