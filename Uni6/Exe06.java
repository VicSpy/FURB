
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite um número");
        int V = ent.nextInt();

        System.out.println("Digite um número");
        int N = ent.nextInt();

        int[] vetor = new int[N];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número");
            vetor[i] = ent.nextInt();
        }
        if (vetor.contains(V)) {
            System.out.println("Está no vetor");
        } else {
            System.out.println("Não está no vetor");
        }
    }
}