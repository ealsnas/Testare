public class Uppgift6 {
    public static void main(String[] args) {

        boolean analys = analysTrue(300);
        System.out.println(analys);

    }

    private static boolean analysTrue(int tal) {
        if (tal < 0 || tal >=100 || tal ==100 || tal >0) {

            return true;

        } else {

            return false;

        }

    }

}