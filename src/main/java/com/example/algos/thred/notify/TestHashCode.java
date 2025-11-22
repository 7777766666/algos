package com.example.algos.thred.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestHashCode {

    private static Logger log = LoggerFactory.getLogger(TestHashCode.class);

    private String name;

    public TestHashCode(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread();
        Thread thread2 = new Thread();

        TestHashCode testHashCode = new TestHashCode("Lol");



    }

}
