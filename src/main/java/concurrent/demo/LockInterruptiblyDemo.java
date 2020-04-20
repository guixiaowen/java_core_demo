package concurrent.demo;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptiblyDemo {

//    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    private Lock lock = new ReentrantLock();
//
//    public static void main(String[] args) {
//        final LockInterruptiblyDemo test = new LockInterruptiblyDemo();
//
//    }
//
//    private void insert(Thread thread) {
//
//        if (lock.tryLock()) {
//            try {
//                System.out.println(thread.getName()+" 得到了锁");
//                for(int i=0;i<5;i++) {
//                    arrayList.add(i);
//                }
//            } catch (Exception e) {
//            }finally {
//                System.out.println(thread.getName()+"释放了锁");
//                lock.unlock();
//            }
//        } else {
//            System.out.println(thread.getName()+"获取锁失败");
//        }
//    }
}

//class MyThread extends Thread {
//        private LockInterruptiblyDemo test = null;
//
//        public MyThread(LockInterruptiblyDemo test) {
//            this.test = test;
//        }
//
//        public void run() {
//            try {
//                test.insert(Thread.currentThread());
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName()+"被中断");
//            }
//         }
//}
