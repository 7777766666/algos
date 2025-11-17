package com.example.algos.thred;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyThread implements Runnable{

    private String localName;

    public MyThread(String localName){
        this.localName = localName;
    }

    private static Logger log = LoggerFactory.getLogger(MyThread.class);
    @Override
    public void run() {
        log.info("From runnable " + localName + " " + Thread.currentThread().getName()) ;


    }
}
