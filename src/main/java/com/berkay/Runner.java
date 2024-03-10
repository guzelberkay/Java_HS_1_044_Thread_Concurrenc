package com.berkay;

import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) throws Exception {
        /**
         * Concurrency - MultiThread
         * Çoklu iş parçacığı ile işlemleri senkron bir şekilde yapmak.
         * Bir uygulamanın çalışabilmesi için mutlaka ama mutlaka Thread
         * üzerinde çalışıyor olmas gerekir.
         * İşte bu java main programlarımız MainThread denilen Thread
         * üzerine çalışırlar.
         */
        new Thread(()->{
            for (int i = 0; i<1_000_000;i++){
                System.out.println("dongu...: "+i);
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        for (int i = 0; i<5_000_000;i++){
            System.out.println("* ");
            Thread.sleep(700L);
        }
    }
}
