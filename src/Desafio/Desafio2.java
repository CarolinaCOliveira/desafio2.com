package Desafio;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case 7:
                case 8:
                case 9: System.out.println("Atraso maximo: " + (min + ((hora-7)*60))); break;
                default: System.out.println("Atraso maximo: 0");
            }
        }
        leitor.close();
    }

}

