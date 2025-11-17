package com.example.algos.thred.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadSecond2 implements Runnable{
    private Logger log = LoggerFactory.getLogger(ThreadSecond2.class);

    private Message message;
    public Message getMessage() {
        return message;
    }
    @Override
    public void run() {

        try {

                log.info("Thread2 {} sleep 10 seconds ", Thread.currentThread().getName());

                Thread.sleep(10000);
                synchronized (message) {
                message.setMessage("7777777777777777777777777");
                message.notifyAll();
                log.info("Thread2 finish");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Return monitor");

    }
    public ThreadSecond2(Message message) {
        this.message = message;
    }



    public void setMessage(Message message) {
        this.message = message;
    }

}
