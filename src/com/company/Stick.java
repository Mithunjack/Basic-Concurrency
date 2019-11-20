package com.company;
import java.util.concurrent.Semaphore;

public class Stick{
    Semaphore sem;
    boolean available;
    Stick(){
        this.sem = new Semaphore(1);
    }
    public synchronized void pickStick(){
    //    System.out.println("Status:pick");
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        available = false;
    }

    public synchronized void dropStick(){
  //      System.out.println("Status: drop");
        sem.release();
        available = true;
    }

    public boolean isAvailable(){
        return available;
    }
}
