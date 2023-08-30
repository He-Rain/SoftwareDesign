/**
 * @ClassName LockTest
 * @Author 何雨铭
 * @Date 2022/11/16 22:49
 */
//好好学习，走向巅峰！
public class LockTest {
    public static String obj1 = "obj1";//资源
    public static String obj2 = "obj2";//资源

    public static void main(String[] args) {
        LockA a=new LockA();
        new Thread(a).start();
        LockB b=new LockB();
        new Thread(b).start();
    }
}
class LockA implements  Runnable{

    @Override
    public void run() {
        System.out.println("LockA 开始执行");
        while(true){//一直检测
 synchronized(LockTest.obj1){
     System.out.println("LockA锁住了obj1(资源1)");
     try {
         Thread.sleep(3000);//给LockB锁给一个锁资源的时间
         synchronized (LockTest.obj2){
             System.out.println("LockA锁住了obj2(资源2)");
             Thread.sleep(60*1000);
         }
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }
 }

        }
    }
}
class LockB implements  Runnable{
    @Override
    public void run() {
        System.out.println("LockB 开始执行");
        while(true){//一直检测
            synchronized (LockTest.obj2){
                System.out.println("LockB锁住了obj2(资源2)");
                try {
                    Thread.sleep(3000);//给LockB锁给一个锁资源的时间
                    synchronized (LockTest.obj1){
                        System.out.println("LockB锁住了obj1(资源1)");
                        Thread.sleep(60*1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}