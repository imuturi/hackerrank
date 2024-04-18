package com.midas.hackerrank;

import java.math.BigDecimal;

public class ThreadClass {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new Task());


//        t1.start();

        System.out.println("---------------------------------------------------------------");

        BigDecimal var1  = new BigDecimal(4000000);
        BigDecimal limit  = new BigDecimal(1000000);

        if(var1.compareTo(limit)<1){
            System.out.println("VAR 1 is Greate than VAR 2");
        }


//        ExecutorService service = Executors.newFixedThreadPool(10);

//        for(int i =0 ; i<100; i++){
////            Thread t2 = new Thread(new Task());
////            t2.start();
//
//            service.execute(new Task());
//        }

        //System.out.println("Thread Name1111:::::::::::"+Thread.currentThread().getName());
    }

//    static class Task implements Runnable{
//
//        int num;
//        public void run() {
//            //System.out.println("Thread name2222:::::::::"+Thread.currentThread().getName());
//
//        }
//    }
}
