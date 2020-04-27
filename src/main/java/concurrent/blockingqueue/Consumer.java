import java.util.concurrent.LinkedBlockingQueue;

public class Consumer extends Thread {

    public LinkedBlockingQueue<Apple> queue;
    private int MAX_NUM = 0;

    public Consumer(LinkedBlockingQueue<Apple> queue, int MAX_NUM) {
        this.queue = queue;
        this.MAX_NUM = MAX_NUM;
    }

    public void run() {
        while (true) {
            try {
                queue.take();
                System.out.println("Consumer Apple is left: " + queue.size());
                Thread.sleep(60000);
            } catch (InterruptedException e) {
               // System.out.println("No Apple: " + queue.size());
                e.printStackTrace();
            }
        }
    }

}
