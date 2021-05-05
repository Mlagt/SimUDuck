package com.company;

public class Manok {

    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public Manok() {
        quackBehavior = new Quack();
    }
}
