package com.om;

class MyRunnable implements Runnable{
  public void run(){   //overrides Runnable's run() method
          System.out.println("in run() method");
          System.out.println("currentThreadName= "+ Thread.currentThread().getName());
   }
}
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class Thread1 {
   public static void main(String args[]){
          System.out.println("currentThreadName= "+ Thread.currentThread().getName());
          MyRunnable runnable=new MyRunnable();
          Thread thread=new Thread(runnable);
          thread.start();
   }
}

