package com.example.algos.thred;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;


public class MainThread {

    private static Logger log = LoggerFactory.getLogger(MainThread.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SecondThread secondThread = new SecondThread("Thread name");
        secondThread.start();

        Runnable runnable = new MyThread("Thread from Runnable");
        Thread threadR = new Thread(runnable);
//        threadR.setPriority(Thread.MIN_PRIORITY);
        threadR.start();
        int priority = threadR.getPriority();
        System.out.println("priority " + priority);

        ExecutorService pool = Executors.newFixedThreadPool(4);

        Callable<Integer> callThread = new CallThread();
        Future<Integer> future = pool.submit(callThread);
        boolean done = future.isDone();
        System.out.println("!!!!!!!!!!!!" + done);
        log.info(" Feature is = {}", future.get());
        pool.shutdown();
        log.info("pool.shutdown");
        boolean done1 = future.isDone();
        System.out.println(done1);
    }
}
