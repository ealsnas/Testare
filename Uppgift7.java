public class Uppgift7 {

    public static void main(String[] args) {
        boolean alla = allaArFalse(300);
        System.out.println(alla);


    }

    private static boolean allaArFalse(int tal) {
        if (tal <=300 && tal >= 100 && tal == 100 && tal > 0) {

            return true;

        } else {

            return false;

        }
    }
}
