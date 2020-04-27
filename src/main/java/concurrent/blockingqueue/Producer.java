import java.util.concurrent.LinkedBlockingQueue;

public class Producer extends Thread {

    public LinkedBlockingQueue<Apple> queue;

    private int MAX_NUM = 0;

    public Producer(LinkedBlockingQueue<Apple> queue, int MAX_NUM) {
        this.queue = queue;
        this.MAX_NUM = MAX_NUM;
    }

    public void run() {

        while (true) {
            try {
                queue.put(new Apple(queue.size()));
                System.out.println("Producer queue size is : " + queue.size());
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Apple is enough !!  " + queue.size());
                e.printStackTrace();
            }
        }
    }
}
