import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * @ClassName 乐观锁
 * @Author 何雨铭
 * @Date 2022/11/17 0:00
 */
//好好学习，走向巅峰！
public class 乐观锁 {
    //1.自增
    static int sum = 1;//数据的更新

    public static void main(String[] args) {
//线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            service.submit(() -> {
                sum++; //显示改变的数据
            });
        }
            try{//1001
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sum);
        }

    }
