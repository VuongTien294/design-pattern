package CreationalPatterns.AbstractFactoryDesignPattern.example1;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.factory.MainFactory;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Dress;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Jean;
import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.TShirt;

public class Application {
    private Dress dress;
    private TShirt tShirt;
    private Jean jean;

    public Application(MainFactory mainFactory){
        dress = mainFactory.createDress();
        tShirt = mainFactory.createTShirt();
        jean = mainFactory.createJean();
    }

    public void paint(){
        dress.print();
        tShirt.print();
        jean.print();
    }

}
