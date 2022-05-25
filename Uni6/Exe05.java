
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] vetor = new String[5];
        String[] vetorEla = new String[5];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um A Resposta");
            vetor[i] = ent.nextLine();
            vetorEla[i] = ent.nextLine();
            if (vetor[i].equals(vetorEla[i])) {
                soma = soma + 3;
            } else if (vetor[i].equals("IND") && !vetorEla[i].equals("IND")) {
                soma = soma + 1;
            } else {
                soma = soma - 2;
            }

        }

        if (soma == 15) {
            System.out.println("CASEM!");
        } else if (soma < 15 && soma > 9) {
            System.out.println("Vocês tem muita coisa em comum");
        } else if (soma < 10 && soma > 4) {
            System.out.println("Talvez não de certo");
        } else if (soma < 5 && soma > -1) {
            System.out.println("Vale um encontro");
        } else if (soma < 0 && soma > -10) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam");
        }
    }
}