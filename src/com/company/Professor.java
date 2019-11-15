package com.company;

public class Professor extends Thread{
    Stick left,right;
    Professor currentProfessor;
    Professor(Stick left, Stick right){
        this.left = left;
        this.right = right;
        this.currentProfessor = this;
    }
    public void run(){
        this.eat();
    }
    public void eat(){
        System.out.println(currentProfessor);
        while (true){
            this.left.pickStick();
            if (this.right.isAvailable()){
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
