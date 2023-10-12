package CreationalPatterns.AbstractFactoryDesignPattern.example1.detailProduct.jean;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.mainProduct.Jean;

public class SummerJean implements Jean {
    @Override
    public void print() {
        System.out.println("This is Summer Jean");
    }
}
