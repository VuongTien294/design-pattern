package CreationalPatterns.AbstractFactoryDesignPattern.example2.product;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Table;

public class WoodTable implements Table {
    @Override
    public void createTable() {
        System.out.println("Create Wood table");
    }
}
