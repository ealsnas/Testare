public class Metods {
    public static void main(String[] args) {
        methodZero();
        methodOne(10); //10 as argument
        methodTwo(10, 20);
        methodTwoBeta(10.0, 20.0);
    }

    private static void methodZero() {
        System.out.println("This i metod with zero parameters");
    }

    //method med parameters
    public static void methodOne(int a) {
        System.out.println("MethodOne:" + a);
    }

    public static void methodTwo(int a, int b) {
        System.out.println("MethodTwo:" + a + "," + b);
    }

    public static void methodTwoBeta(double a, double b) {
        System.out.println(  a + b);
    }
}
