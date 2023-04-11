package br.com.alura.java.oi.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws FileNotFoundException {
        // atribuindo entrada de dados do arquivo
        Scanner sc = new Scanner(new File("contas.csv"));

        // enquanto tiver uma proxima linha vou pegar e imprimir
        while (sc.hasNextLine()){
            String linha = sc.nextLine();
            System.out.println(linha);

        }
        sc.close();
    }
}
