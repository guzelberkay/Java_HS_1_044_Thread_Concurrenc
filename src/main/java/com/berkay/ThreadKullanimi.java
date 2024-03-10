package com.berkay;

import java.util.TreeSet;

public class ThreadKullanimi {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Bir thread oluşturmanın 2 yöntemi vardır;
         * 1- Thread sınıfı miras olarak runnable bir sınıf oluşturmak.
         * 2- Runnable interface i kullanarak runnable bir sınıf oluşturmak.
         * Bu iki yöntemden 2. yöntem tercih edilmektedir. Çünkü, java da bir
         * sınıfın tek bir inheritance şansı vardır bu nedenle bu kalıtım
         * şekli interface olarak tercih edilir.
         * DİKKAT!!!
         * uraa amac bir sınıftan nesne yaratmak ve bu nesnenin referansını
         * runnable sınıflar içerisine vermek.
         */

        Deger deger = new Deger();
        ThreadClass threadClass = new ThreadClass(deger);
        RunnableClass runnableClass = new RunnableClass(deger);
        threadClass.start();
        Thread threadRun = new Thread(runnableClass);
        threadRun.start();

        Thread.sleep(25000L);
        System.out.println(deger.sayi);


    }
}

class Deger {
    int sayi;
}

class ThreadClass extends Thread {
    Deger deger;

    public ThreadClass(Deger deger) {
        this.deger = deger;
    }
    public void run(){
        for (int i = 0; i<100;i++){
            deger.sayi++;
            System.out.println("Thread Deger : "+deger.sayi);
        }
    }
}

class RunnableClass implements Runnable{
    Deger deger;
    public RunnableClass(Deger deger){
        this.deger= deger;
    }

    @Override
    public void run() {
        for (int i = 0; i<100;i++){
            deger.sayi--;
            System.out.println("Runnable Deger : "+deger.sayi);
        }
    }
}
