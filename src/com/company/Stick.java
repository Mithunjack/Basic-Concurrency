package com.company;

public class Stick{
    boolean isAvailable = true;

    public synchronized void pickStick(){
            System.out.println("Status: Picked stick");
            try {
                this.wait();
                isAvailable = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    public synchronized void dropStick(){
        System.out.println("Status: droped stick");
        isAvailable = true;
        this.notify();
    }
    public boolean isAvailable(){
        if (isAvailable){
            return true;
        } else return false;
    }
}
