import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

/**
 * Runnable threads using ExecutorService
 */
public class RunThread {

    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();

        ExecutorService exec = Executors.newCachedThreadPool();

        exec.execute(r1);
        exec.execute(r2);


        exec.shutdown();

    }



}

