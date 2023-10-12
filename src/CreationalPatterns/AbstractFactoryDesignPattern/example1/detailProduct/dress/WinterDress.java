package CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.dress;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Dress;

public class WinterDress implements Dress {
    @Override
    public void print() {
        System.out.println("This is Winter Dress");
    }
}
