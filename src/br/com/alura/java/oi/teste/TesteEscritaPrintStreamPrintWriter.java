package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

//        OutputStream fos = System.out;
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


        // PrintStream imprimir caracteres do arquivo
        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("teste teste teste");
        ps.println(); // imprime e ja vai pra uma nova linha
        ps.println("Testetetetetetetetet");

        ps.close();

    }
}