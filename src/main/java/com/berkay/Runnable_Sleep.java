package com.berkay;

public class Runnable_Sleep {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Sleep([Long time : milisecond])
         * Tread.sleep(1000L)-> 1 saniye boyunca bekle.
         */
        long start = System.currentTimeMillis();//İçinde bulunduğumuz anı milisaniye cinsinden verev method.
        Thread.sleep(2400L);
        System.out.println("Uygulama bitti");
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Gecen sure : "+duration);
    }
}
