package demo2;

import scala.collection.immutable.Stream;

import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProducerTest {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(10);
//        linkedBlockingQueue.put("test");
//        linkedBlockingQueue.put("test2");
//        linkedBlockingQueue.put("test3");

        Producer producer = new Producer(linkedBlockingQueue);
        Consumer consumer = new Consumer(linkedBlockingQueue);

        producer.start();
        consumer.start();
    }
}
