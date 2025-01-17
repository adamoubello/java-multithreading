
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Multi-Threading test in Java
 */
public class tests {

    public static void main(String[] args) throws InterruptedException {
        //creating Random numbers
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("Integer random is: " + random.nextInt(10));
        }
        //semaphore , number of permits
        Semaphore sem = new Semaphore(1);
        sem.acquire();
        sem.release();
        sem.acquire();
        System.out.println("Available Permits " + sem.availablePermits());
    }

}
