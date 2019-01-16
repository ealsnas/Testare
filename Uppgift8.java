import java.util.Scanner;

public class Uppgift8 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int number, tal, sum = 0;
        double result;
        System.out.println("Hur många tal vill du?:");
        number = Input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i + ". Tal:");
            tal = Input.nextInt();
            sum = sum + tal;
        }
        result = sum / number;
        System.out.println("Medelvärde blir:" + result);
    }
}