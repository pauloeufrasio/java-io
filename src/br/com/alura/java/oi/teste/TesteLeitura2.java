package br.com.alura.java.oi.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws FileNotFoundException {

        // atribuindo entrada de dados do arquivo
        Scanner sc = new Scanner(new File("contas.csv"));
        // enquanto tiver uma proxima linha vou pegar e imprimir
        while (sc.hasNextLine()){
            String linha = sc.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            // APLICANDO REGRAS LOCAIS
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            // separando valores
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            System.out.println(valor1 + valor2 + valor3 + valor4 + valor5 );
            linhaScanner.close();


            // separando linha com array
            //String[] valores = linha.split(",");
          //System.out.println(valores[3]);
        }
        sc.close();
    }
}
