package CreationalPatterns.AbstractFactoryDesignPattern.example2.concretefactory;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractfactory.MainFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Chair;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Table;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.product.WoodChair;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.product.WoodTable;

public class WoodFactory implements MainFactory {
    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Chair createChair() {
        return new WoodChair();
    }
}
