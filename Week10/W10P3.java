import java.util.Arrays;
import java.util.List;

public class W10P3 implements Runnable {
    public enum Color {RED, YELLOW, GREEN}
    private List<Color> light = Arrays.asList(Color.RED,Color.GREEN, Color.YELLOW);

    private static volatile int counter = 0;
    private int i;

    private static final Object lock = new Object();

    public W10P3(Color color) {
        this.i = light.indexOf(color);
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    while (counter % light.size() != i) lock.wait();
                    System.out.println(Thread.currentThread().getName() + " :: " + light.get(counter % light.size()));
                    counter++;
                    Thread.sleep(1000);
                    lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new W10P3(W10P3.Color.RED)).start();
        new Thread(new W10P3(W10P3.Color.YELLOW)).start();
        new Thread(new W10P3(W10P3.Color.GREEN)).start();
    }
}