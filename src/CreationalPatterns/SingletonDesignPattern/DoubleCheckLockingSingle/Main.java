package CreationalPatterns.SingletonDesignPattern.DoubleCheckLockingSingle;

public class Main {
    public static void main(String[] args) {
        DoubleCheckLockingSingleton singleton = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton singleton2 = DoubleCheckLockingSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
