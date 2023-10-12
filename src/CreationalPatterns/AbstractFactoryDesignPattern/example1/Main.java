package CreationalPatterns.AbstractFactoryDesignPattern.example1;

import CreationalPatterns.AbstractFactoryDesignPattern.example1.factory.SummerFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new SummerFactory());
        application.paint();

    }
}
