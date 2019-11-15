package com.company;
import java.util.concurrent.Semaphore;

public class Stick{
    Semaphore sem;
    Stick(){
        sem = new Semaphore(1);
    }
    public void pickStick(){
            System.out.println("Status: Picked stick");
            try {
                this.sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    public void dropStick(){
        System.out.println("Status: droped stick");
        this.sem.release();
    }
    public boolean isAvailable(){
        return this.sem.availablePermits() > 0;
    }
}
