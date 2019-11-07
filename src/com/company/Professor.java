package com.company;

public class Professor extends Thread{
    Stick left,right;
    Professor(Stick left, Stick right){
        this.left = left;
        this.right = right;
    }
    public void run(){
        this.eat();
    }
    public void eat(){
        while (true){
            this.left.pickStick();
            if ( this.right.isAvailable() == true){
                this.right.pickStick();
                this.left.dropStick();
                this.right.dropStick();
            }
            else {
                this.left.dropStick();
            }
        }
    }

}
