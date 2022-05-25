
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] vetor = new int[12];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número");
            vetor[i] = ent.nextInt();
        }
        int media = (vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7] + vetor[8]
                + vetor[9] + vetor[10] + vetor[11]) / 12;
        for (int i = vetor.length - 1; i >= 0; i--) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }
}