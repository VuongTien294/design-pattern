package CreationalPatterns.AbstractFactoryDesignPattern.example1.factory;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Dress;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Jean;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.TShirt;

public interface MainFactory {
    Dress createDress();
    TShirt createTShirt();
    Jean createJean();
}
