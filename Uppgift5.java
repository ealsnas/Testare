import java.util.Arrays;

public class Uppgift5 {

    // static String realPass1 = "elmas";
    //static String realPass2 = "deniz";
    //static String realPass3 = "marcus";

    static String[] realPass = new String[3];
    static String[] pass = new String[3];

    public static void main(String[] args) {
        realPass[0] = "elmas";
        realPass[1] = "deniz";
        realPass[3] = "marcus";
        boolean auth = isAuhorised();

    }

    private static boolean isAuhorised() {

        for (int i = 0; i < 3; i++) {
            pass[i] = Main.getString();
            // pass[1] = Main.getString();
            //pass[2] = Main.getString();
        }
            Arrays.sort(pass);

            if (pass[0].equals(realPass[0]) && pass[1].equals(realPass[1]) && pass[2].equals(realPass[2])) {

            return true;


        }
        return false;
    }
}
