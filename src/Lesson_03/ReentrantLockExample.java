package Lesson_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static volatile int count = 0;

    public static void main(String[] args) {
        tryLockExample();
    }

    private static void tryLockExample() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        ReentrantLock lock = new ReentrantLock();

        executor.submit(() -> {
                    lock.lock();
                    try {
                        for (int i = 0; i < 100; i++) {
                            count++;
                        System.out.println(count);
                        System.out.println("Held by me: " + lock.isHeldByCurrentThread());
                            System.out.println(Thread.currentThread().getName());
                        }
                    } finally {
                        lock.unlock();
                    }
        });

        executor.submit(() -> {
            lock.lock();
            try {
                for (int i = 0; i < 100; i++) {
                    count++;
                    System.out.println(count);
                    System.out.println("Held by me: " + lock.isHeldByCurrentThread());
                    System.out.println(Thread.currentThread().getName());
                }
            } finally {
                lock.unlock();
            }
        });


        executor.submit(() -> {
            System.out.println("Locked: " + lock.isLocked());
            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
            boolean locked = lock.tryLock();
            System.out.println("Lock acquired: " + locked);
        });

        executor.shutdown();
    }
}

