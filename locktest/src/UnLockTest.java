import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/**
 * @ClassName UnLockTest
 * @Author 何雨铭
 * @Date 2022/11/16 23:18
 */
//好好学习，走向巅峰！
public class UnLockTest {
    public static String obj1 = "obj1";//资源
    public  static final Semaphore a1=new Semaphore(1);
    public static String obj2 = "obj2";//资源
    public  static final Semaphore a2=new Semaphore(1);

    public static void main(String[] args) {
        LockC c = new LockC();
        new Thread(c).start();
        LockD  d = new LockD();
        new Thread(d).start();
    }
}
class LockC implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("LockC 开始执行");
            while(true){
                if(UnLockTest.a1.tryAcquire(1,TimeUnit.SECONDS)){

                    if(UnLockTest.a2.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println("LockC 锁住了obj2");
                        Thread.sleep(60*1000);
                    }else{
                        System.out.println("LockC 锁obj2失败");
                    }
                }else{
                    System.out.println("LockC 锁obj1失败");
                }
                //释放
                UnLockTest.a1.release();
                UnLockTest.a2.release();
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class LockD implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("LockD 开始执行");
            while(true){
                if(UnLockTest.a2.tryAcquire(1,TimeUnit.SECONDS)){
                    System.out.println("LockD 锁住了obj2");
                    if(UnLockTest.a1.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println("LockD 锁住了obj1");
                        Thread.sleep(60*1000);
                    }else{
                        System.out.println("LockD 锁obj1失败");
                    }
                }else{
                    System.out.println("LockD 锁obj2失败");
                }
                //释放
                UnLockTest.a1.release();
                UnLockTest.a2.release();
                Thread.sleep(10*1000);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}