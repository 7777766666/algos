package com.example.algos.thred;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondThread extends Thread {

    public SecondThread(String name){
        super(name);
    }

    private static Logger log = LoggerFactory.getLogger(SecondThread.class);

    @Override
    public void run() {
        log.info("Hello from thread " + Thread.currentThread().getName());

    }
}
