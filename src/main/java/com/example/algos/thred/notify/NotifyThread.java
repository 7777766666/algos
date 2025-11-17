package com.example.algos.thred.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NotifyThread implements Runnable{

    private static Logger log = LoggerFactory.getLogger(NotifyThread.class);
    private Message message;

    @Override
    public void run() {
        log.info(" Start NotifyThread {}", Thread.currentThread().getName());

            try {
                log.info("Thread NotifyThread {} sleep 5 second", Thread.currentThread().getName());
                Thread.sleep(5000);
                synchronized (message){
                    message.setMessage("Thread Notifier worked success");
//                    message.notify();  //Так поток ThreadSecond2 не отработает, так как монитор будет возвращен в Thread1
                    message.notifyAll();
                    log.info("Return monitor");
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }

    public NotifyThread(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }


}
