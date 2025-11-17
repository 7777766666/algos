package com.example.algos.thred;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SleepMethod implements Runnable{

    private static Logger log = LoggerFactory.getLogger(SleepMethod.class);

    @Override
    public void run() {
        for (int i = 0; i < 7; i++){
            log.info("Thread " + Thread.currentThread().getName() + " is {}", i);
            log.info("Thread {} going to sleep for 2 seconds", Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        log.info("Thread {} woke up", Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        SleepMethod sleepMethod = new SleepMethod();
        Thread one = new Thread(sleepMethod);
        one.setName("One");
        Thread two = new Thread(sleepMethod);
        two.setName("Two");
        Thread three = new Thread(sleepMethod);
        three.setName("Three");

        one.start();
        two.start();
        three.start();
    }
}
