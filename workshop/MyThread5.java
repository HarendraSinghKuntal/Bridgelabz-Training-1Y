package com.gla.multithreading;

public class MyThread5 implements Runnable {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread5 " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        Thread t = new Thread(myThread5);
        t.start();
    }
}
