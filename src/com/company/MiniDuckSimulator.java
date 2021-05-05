package com.company;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.display();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();

        Manok manok = new Manok();
        manok.performQuack();
    }
}
