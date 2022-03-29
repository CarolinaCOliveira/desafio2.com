package Desafio;

import java.io.IOException;
import java.util.Scanner;


public class Desafio3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T, menor = 0, posMenor = 0;
        for (int i=1; i<=N; i++) {
            T = leitor.nextInt();
            if (i == 1 || T<menor) {
                menor = T;
                posMenor = i;
            }
        }
        System.out.println(posMenor);

        leitor.close();
    }
}

