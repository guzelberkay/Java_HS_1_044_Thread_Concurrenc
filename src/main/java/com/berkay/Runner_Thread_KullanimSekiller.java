package com.berkay;
public class Runner_Thread_KullanimSekiller {
    public static void main(String[] args) {
        /**
         * 1. Kural: ayrı bir iş parçacığında kod çalıştırmak istiyorsanız
         * mulaka new Thread(; oluşturmalısınız.
         * 22 Kural: thread çalıştırabileceğiniz kodu functional bir interface olan
         * Runnable tipindetalep eder. Bu nedenle ya new Runnable() sınıf ya da bir
         * lamda function verirsiniz.
         */
        new Thread(()-> System.out.println("Lambda Function ")).start();
        new Thread(()->{
            int sayi = 5;
            sayi = sayi*5;
            System.out.println("Sayinin 5 kati...: "+sayi);
        }).start();

        Runnable rn1 = ()-> System.out.println("Berkay");
        Runnable rn2 = ()-> {
            System.out.println("Yeni Runnable method");
            System.out.println(":)");
        };

        Thread th1 = new Thread(rn1);
        Thread th2 = new Thread(rn2);
        th1.start();
        th2.start();
    }
}
