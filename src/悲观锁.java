import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName 悲观锁
 * @Author 何雨铭
 * @Date 2022/11/17 0:12
 */
//好好学习，走向巅峰！
public class 悲观锁 {
    //线程不安全
    private static int value1 = 0;
    //乐观锁
    private static AtomicInteger value2 = new AtomicInteger( 0);
    //悲观锁
    private static int value3 = 0;
    private static synchronized void incrvalue3() {
        value3++;
    }

    public static void main(String[] args) throws Exception{
        //开启1000个线程，然后执行自增操作
        for (int i=0; i<1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    value1++;
                    value2.getAndIncrement();
                    incrvalue3();
                }
            }).start();
        }
        Thread.sleep(1000);
        System. out. println("线程不安全的是" +value1);
        System. out . println("乐观锁是"+value2);
        System. out. println("悲观锁是"+value3);
    }
    }
