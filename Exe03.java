import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        for (double d = 1; d <= 100; d++) {
         System.out.println(i/d);
        }

        sc.close();
    }
}
