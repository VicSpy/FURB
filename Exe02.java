import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("É par");

            } else {
                System.out.println("É impar");
            }
        }

        sc.close();
    }
}
