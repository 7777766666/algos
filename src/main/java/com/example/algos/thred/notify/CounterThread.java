package com.example.algos.thred.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CounterThread implements Runnable{

    private static int global;
    private static Logger log = LoggerFactory.getLogger(CounterThread.class);
    private int counter;


    @Override
    public void run() {


        for (int i = 0; i < 1000; i++ ){
            try {
                counter++;
                global++;
                log.info("{} counter = {}, global couner = {}", Thread.currentThread().getName(), counter, global);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new CounterThread()).start();
        new Thread(new CounterThread()).start();
        new Thread(new CounterThread()).start();

    }
}
