package com.example.algos.thred.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.Factory;

public class Thread1 implements Runnable{

    private Message message;

    private static Logger log = LoggerFactory.getLogger(Thread1.class);

    public Thread1(Message m) {
        this.message = m;
    }


    @Override
    public void run() {
        log.info("Start Thread1 with name {}", Thread.currentThread().getName());
        synchronized (message) {
            try {
                log.info("Wait call notify and messege is {}", message.getMessage());
                log.info("MONITOR TREAD1");
                message.wait();
                log.info("MONITOR AGAIN TREAD1");
                log.info("from thread 1");
                message.setMessage("Message from thread 1");
                message.notify();
                log.info("Return monitor");


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        log.info("Thread {} worked with an change message = {}", Thread.currentThread().getName(), message.getMessage());

    }

    public Message getMessage() {
        return message;
    }
}
