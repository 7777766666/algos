package com.example.algos.thred.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashCodeThread implements Runnable {

    private final Message msg = new Message("LOL");
    private static Logger log = LoggerFactory.getLogger(HashCodeThread.class);
    public Message message;


    @Override
    public void run() {
        int i = msg.hashCode();
        log.info("hashcode is {}", i);
        log.info("hashcode is {}", i);

    }

    public static void main(String[] args) {

        HashCodeThread hashCodeThread1 = new HashCodeThread();
        HashCodeThread hashCodeThread2 = new HashCodeThread();
        HashCodeThread hashCodeThread3 = new HashCodeThread();

        Thread thread1 = new Thread(hashCodeThread1);
        Thread thread2 = new Thread(hashCodeThread2);
        Thread thread3 = new Thread(hashCodeThread3);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
