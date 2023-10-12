package CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractfactory;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Chair;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Table;

public interface MainFactory {
    Table createTable();
    Chair createChair();

}
