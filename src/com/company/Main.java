package com.company;

public class Main {

    public static void main(String[] args) {
        Stick stk1 = new Stick();
        Stick stk2 = new Stick();
        Stick stk3 = new Stick();
        Stick stk4 = new Stick();
        Stick stk5 = new Stick();

        Professor prof1 = new Professor(stk1,stk2);
        Professor prof2 = new Professor(stk2,stk3);
        Professor prof3 = new Professor(stk3,stk4);
        Professor prof4 = new Professor(stk4,stk5);
        Professor prof5 = new Professor(stk5,stk1);

        prof1.start();
        prof2.start();
        prof3.start();
        prof4.start();
        prof5.start();
    }
}
