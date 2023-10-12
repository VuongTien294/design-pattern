package CreationalPatterns.FactoryMethodDesignPattern.factories;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Change Dir Linux " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Remove Dir Linux " + dir);
    }
}
