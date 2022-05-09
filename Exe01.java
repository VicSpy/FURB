import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int num = 1; num <= 20; num = num + 2) {
            if (num % 2 == 0) {
                System.out.println("É par");

            } else {
                System.out.println("É impar");
            }
        }

        sc.close();
    }
}
