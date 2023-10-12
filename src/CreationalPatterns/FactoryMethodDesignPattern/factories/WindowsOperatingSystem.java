package CreationalPatterns.FactoryMethodDesignPattern.factories;

public class WindowsOperatingSystem extends OperatingSystem{

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Change Dir Window " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Remove Dir Window " + dir);
    }
}
