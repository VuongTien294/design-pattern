package CreationalPatterns.FactoryMethodDesignPattern.factories;

public class OperatingSystemFactory {
    public OperatingSystemFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type){
            case "WINDOWS":
                return new WindowsOperatingSystem(version,architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version,architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }

}
