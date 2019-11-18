package com.company;
import java.util.concurrent.Semaphore;

public class Stick{
    boolean available=true;
    public synchronized void pickStick(){
    //    System.out.println("Status:pick");
        available = false;
    }

    public synchronized void dropStick(){
  //      System.out.println("Status: drop");
        available = true;
    }

    public boolean isAvailable(){
        return available;
    }
}
