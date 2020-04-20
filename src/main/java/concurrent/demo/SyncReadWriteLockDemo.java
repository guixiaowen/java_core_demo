package concurrent.demo;

public class SyncReadWriteLockDemo {

    public static void main(String[] args) {
        final SyncReadWriteLockDemo test = new SyncReadWriteLockDemo();
        new Thread(){
            public void run() {
                test.get(Thread.currentThread());
            }
        }.start();

        new Thread(){
            public void run() {
                test.get(Thread.currentThread());
            }
        }.start();
    }

    private synchronized void get(Thread thread) {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start <= 1) {
            System.out.println(thread.getName()+"正在进行读操作");
        }
        System.out.println(thread.getName()+"读操作完毕");
    }

}
