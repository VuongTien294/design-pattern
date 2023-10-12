package CreationalPatterns.AbstractFactoryDesignPattern.example2.product;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Chair;

public class PlasticChair implements Chair {
    @Override
    public void createChair() {
        System.out.println("Create Plastic chair");
    }
}
