package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteCopiarArquivos {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        // Transformando bit em byte em caracter
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // Fluxo de entrada com arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt");
        // Transformando bit em byte em caracter
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}