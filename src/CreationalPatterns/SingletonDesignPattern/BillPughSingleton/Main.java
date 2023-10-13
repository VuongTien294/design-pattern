package CreationalPatterns.SingletonDesignPattern.BillPughSingleton;

public class Main {
    public static void main(String[] args) {
//        BillPughSingleton a = new BillPughSingleton();
//        System.out.println(a);
//        BillPughSingleton b = new BillPughSingleton();
//        System.out.println(b); => Báo lỗi => Phải tạo instance bằng pt getInstance

        BillPughSingleton c = BillPughSingleton.getInstance();
        System.out.println(c);
        BillPughSingleton d = BillPughSingleton.getInstance();
        System.out.println(d);

        //=> Instance a , b khác nhau.
        //=> Instance c , d cùng là 1
    }
}
