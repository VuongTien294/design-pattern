package CreationalPatterns.AbstractFactoryDesignPattern.example1.factory;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.dress.WinterDress;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.jean.WinterJean;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.tshirt.WinterTShirt;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Dress;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Jean;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.TShirt;

public class WinterFactory implements MainFactory{
    @Override
    public Dress createDress() {
        return new WinterDress();
    }

    @Override
    public TShirt createTShirt() {
        return new WinterTShirt();
    }

    @Override
    public Jean createJean() {
        return new WinterJean();
    }
}
