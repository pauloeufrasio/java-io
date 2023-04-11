package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteCopiarArquivos {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada de arquivos por chamada InputStream
        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // Saida  de arquivo por chamada OutputStream
        OutputStream fos = System.out;
        // transformando bite em byte em caracteres
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }

}

