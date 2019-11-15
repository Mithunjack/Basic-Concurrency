package com.company;
import java.util.concurrent.Semaphore;

public class Stick{
    boolean available;
    public synchronized void pickStick(){
        System.out.println("Status:pick");
        available = false;
  /*      try{
            Thread.sleep(1000);
        }catch(Exception e){System.out.println(e);}
*/
    }
    public synchronized void dropStick(){
        System.out.println("Status: drop");
        available = true;
    }
    public synchronized boolean isAvailable(){
        return available;
    }
}
