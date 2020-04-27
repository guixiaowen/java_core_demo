import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {

    public static void main(String[] args) {
        int MAX_NUM = 10;
        LinkedBlockingQueue<Apple> linkedBlockingQueue = new LinkedBlockingQueue<>(MAX_NUM);

        Producer producer = new Producer(linkedBlockingQueue, MAX_NUM);
        Consumer consumer = new Consumer(linkedBlockingQueue, MAX_NUM);

        producer.start();
        consumer.start();
    }

}
