package CreationalPatterns.AbstractFactoryDesignPattern.example2;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractfactory.MainFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Chair;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractproduct.Table;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.enumType.MaterialType;

public class Client {
    public static void main(String[] args) {

        MainFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.createChair(); // Create plastic chair

        Table table = factory.createTable();
        table.createTable(); // Create plastic table
    }
}
