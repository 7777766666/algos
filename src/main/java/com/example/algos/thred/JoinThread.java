package com.example.algos.thred;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JoinThread implements Runnable{

    private static Logger log = LoggerFactory.getLogger(JoinThread.class);

    @Override
    public void run() {
        log.info("Start thread with name {}", Thread.currentThread().getName());
        for (int i = 0; i < 6; i++){
            try {
                log.info("Thread {} sleep", Thread.currentThread().getName());
                Thread.sleep(1500);
                log.info("Thread {} wake up", Thread.currentThread().getName());

            } catch (InterruptedException e) {
                log.info("Exception");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread1 = new JoinThread();
        Thread thread0 = new Thread(joinThread1);
        JoinThread joinThread2 = new JoinThread();
        Thread thread1 = new Thread(joinThread2);
        JoinThread joinThread3 = new JoinThread();
        Thread thread2 = new Thread(joinThread3);

        thread0.start();

         thread1.start();
        thread1.join();
        thread2.start();
    }
}
