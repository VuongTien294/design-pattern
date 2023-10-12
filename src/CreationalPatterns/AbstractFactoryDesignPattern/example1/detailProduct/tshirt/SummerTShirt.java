package CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.tshirt;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.TShirt;

public class SummerTShirt implements TShirt {
    @Override
    public void print() {
        System.out.println("This is Summer TShirt");
    }
}
