package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        // Transformando bit em byte em caracter
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        
        System.out.println(linha);

        br.close();
    }
}