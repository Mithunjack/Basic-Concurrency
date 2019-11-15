package com.company;

public class Professor extends Thread{
    Stick left,right;
    int id;
    Professor(int id,Stick left, Stick right){
        this.left = left;
        this.right = right;
        this.id = id;
    }
    public void run(){
            this.eat();
    }
    public void eat() {
        while (true) {

            synchronized (this.left) {
                synchronized (this.right) {
                    System.out.println(id + " Left one picked");
                    this.left.pickStick();
                    System.out.println(id + " right one picked");
                    this.right.pickStick();
                    System.out.println(id + " Left one dropped");
                    this.left.dropStick();
                    System.out.println(id + " right one dropped");
                    this.right.dropStick();
                }
            }
        }
    }
}
