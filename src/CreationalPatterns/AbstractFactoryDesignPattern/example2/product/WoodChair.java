package CreationalPatterns.AbstractFactoryDesignPattern.example2.product;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Chair;

public class WoodChair implements Chair {
    @Override
    public void createChair() {
        System.out.println("Create Wood chair");
    }
}
