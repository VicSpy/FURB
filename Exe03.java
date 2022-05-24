
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] vetor = new int[12];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número");
            vetor[i] = ent.nextInt();
        }
        for (int i = vetor.length - 1; i >= 0; i--) {
            if (vetor[i] % 2 == 0) {
                double resultado = vetor[i] + (vetor[i] / 100 * 2);
                System.out.println(resultado);
            } else {
                double resultado = vetor[i] + (vetor[i] / 100 * 5);
                System.out.println(resultado);
            }
        }
    }
}