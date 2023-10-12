package CreationalPatterns.AbstractFactoryDesignPattern.example1.factory;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.dress.SummerDress;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.jean.SummerJean;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.tshirt.SummerTShirt;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Dress;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Jean;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.TShirt;

public class SummerFactory implements MainFactory{
    @Override
    public Dress createDress() {
        return new SummerDress();
    }

    @Override
    public TShirt createTShirt() {
        return new SummerTShirt();
    }

    @Override
    public Jean createJean() {
        return new SummerJean();
    }
}
