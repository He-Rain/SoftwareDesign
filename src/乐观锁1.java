import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName 乐观锁1
 * @Author 何雨铭
 * @Date 2022/11/17 0:08
 */
//好好学习，走向巅峰！
public class 乐观锁1 {
    public static void main(String[] args)
    {
        AtomicInteger am = new AtomicInteger( 1);//M1开始自增
        ExecutorService service = Executors.newFixedThreadPool( 10);
        for(int i = 0;i<1000;i++){
            service. submit(()->{
                am. getAndIncrement();//原子类自增的意思
            });}
            try {
                TimeUnit.SECONDS.sleep(  1);
            } catch (InterruptedException e) {
                e. printStackTrace();
            }
            System. out. println(am.get());
        }
    }
