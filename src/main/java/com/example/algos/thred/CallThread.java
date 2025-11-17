package com.example.algos.thred;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

public class CallThread implements Callable {

    private static Logger log = LoggerFactory.getLogger(CallThread.class);

    @Override
    public Integer call() throws Exception {
      log.info("Hello world from Callable " + Thread.currentThread().getName());
        return 777;
    }
}
