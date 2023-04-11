package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {

//        // saida de dados
//        OutputStream fos = System.out;
//        // transformando bite em byte em caracteres
//        Writer osw = new OutputStreamWriter(fos);
//

        // Criando a saida por FileWriter
        FileWriter fw = new FileWriter("lorem2.txt");
        // embrulhando o FileWriter atraves do BufferedWriter(fw)
        BufferedWriter bw = new BufferedWriter(fw);
        fw.write("teste teste teste");
        // nova linha por chamada System.lineSeparator() ou se preferir so da um  bw.write(\n) quebra de linha ou bw.newlinw();
        bw.newLine();
        bw.newLine();
        bw.write("Testando qualquer coisaaa");




        fw.close();
    }
}