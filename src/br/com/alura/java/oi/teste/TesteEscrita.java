package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        // Saida  de arquivo por chamada OutputStream
        OutputStream fos = System.out;
        // transformando bite em byte em caracteres
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("teste teste teste");
        bw.newLine();
        bw.newLine();
        bw.write("Testando qualquer coisaaa");




        bw.close();
    }
}