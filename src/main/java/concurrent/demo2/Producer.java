package demo2;

import java.util.concurrent.LinkedBlockingQueue;

public class Producer extends Thread {

    public LinkedBlockingQueue<String> linkedBlockingQueue;

    public Producer(LinkedBlockingQueue<String> linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    public void run () {
        while (true) {
            try {
                linkedBlockingQueue.put("test");
                System.out.println(" linkedBlockingQueue's size is : " + linkedBlockingQueue.size());
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
