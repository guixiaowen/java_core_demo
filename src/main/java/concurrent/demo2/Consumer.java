package demo2;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer extends Thread {

    public LinkedBlockingQueue<String> linkedBlockingQueue;

    public Consumer(LinkedBlockingQueue<String> linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    public void run() {
        while (true) {
            try {
                linkedBlockingQueue.take();
                System.out.println(" linkedBlockingQueue's left size is : " + linkedBlockingQueue.size());
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
