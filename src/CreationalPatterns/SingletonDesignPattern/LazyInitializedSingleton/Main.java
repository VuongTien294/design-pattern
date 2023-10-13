package CreationalPatterns.SingletonDesignPattern.LazyInitializedSingleton;

public class Main {
    public static void main(String[] args) {
        //LazyInitializedSingleton singleton = new LazyInitializedSingleton(); => Báo lỗi, phải tạo instance bằng cách gọi hàm getInstance

        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
