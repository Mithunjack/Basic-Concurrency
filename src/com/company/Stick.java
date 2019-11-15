package com.company;

public class Stick{
    boolean isAvailable = true;

    public synchronized void pickStick(){
            System.out.println("Status: Picked stick");
            while (!isAvailable){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isAvailable=true;
    }
    public synchronized void dropStick(){
        System.out.println("Status: dropped stick");
        notifyAll();
        isAvailable = true;
    }
    public boolean isAvailable(){
        if (isAvailable){
            return true;
        } else return false;
    }
}
