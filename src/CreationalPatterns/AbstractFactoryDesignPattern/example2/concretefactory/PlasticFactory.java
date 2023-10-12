package CreationalPatterns.AbstractFactoryDesignPattern.example2.concretefactory;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractfactory.MainFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Chair;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Table;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.product.PlasticChair;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.product.PlasticTable;

public class PlasticFactory implements MainFactory {
    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
}
