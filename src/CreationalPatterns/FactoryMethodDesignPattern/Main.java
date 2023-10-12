package CreationalPatterns.FactoryMethodDesignPattern;

import CreationalPatterns.FactoryMethodDesignPattern.factories.OperatingSystem;
import CreationalPatterns.FactoryMethodDesignPattern.factories.OperatingSystemFactory;

public class Main {
    public static void main(String[] args) {
        OperatingSystem windowSystem = OperatingSystemFactory.getInstance("WINDOWS", "2020", "Tiến");
        windowSystem.changeDir("Test");

        OperatingSystem linuxSystem = OperatingSystemFactory.getInstance("LINUX", "2000", "Tiến");
        linuxSystem.changeDir("Test");
    }
}
