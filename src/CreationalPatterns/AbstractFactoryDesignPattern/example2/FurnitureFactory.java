package CreationalPatterns.AbstractFactoryDesignPattern.example2;

import CreationalPatterns.AbstractFactoryDesignPattern.example2.abstractfactory.MainFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.concretefactory.PlasticFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.concretefactory.WoodFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example2.enumType.MaterialType;

public class FurnitureFactory {
    private FurnitureFactory(){

    }

    public static MainFactory getFactory(MaterialType materialType){
        switch (materialType) {
            case PLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
