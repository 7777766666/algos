package com.example.algos.thred.notify;

public class MainNotify{

    public static void main(String[] args) throws InterruptedException {

        Message message =new Message("Message!!!!!!!!!!!!!!");

        Thread1 thread1 = new Thread1(message);
        NotifyThread notifyThread = new NotifyThread(message);
        ThreadSecond2 threadSecond2 = new ThreadSecond2(message);

        Thread thread = new Thread(thread1);
        Thread notif = new Thread(notifyThread);
        Thread thred2 = new Thread(threadSecond2);

        thread.start();
        notif.start();
        thred2.start();

        thread.join();
        notif.join();
        thred2.join();

        System.out.println("FINAL MESSAGE IS " + message.getMessage());
    }
}
