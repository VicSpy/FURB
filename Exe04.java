
import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] vetor = new int[3];
        int[] vetorDois = new int[3];
        int[] vetorResul = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número");
            vetor[i] = ent.nextInt();
        }
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.println("Digite um número");
            vetorDois[i] = ent.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            int soma = vetor[i] + vetorDois[i];
            vetorResul[i] = soma;
            System.out.println(vetorResul[i]);
        }

    }
}