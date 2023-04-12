package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

//        OutputStream fos = System.out;
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


        // PrintStream imprimir caracteres do arquivo
        PrintStream ps = new PrintStream("lorem2.txt","UTF-8"); // Aplicando Charset UTF-8

        ps.println("Conheceu o problema dos Encodings: onde diferentes codepages s�o usados para escrever e exibir informa��es em seu computador. A solu��o foi dada por um cons�rcio que criou uma tabela gen�rica chamada Unicode contendo todos os caracteres do mundo em n�meros denominados codepoints. A segunda parte da solu��o � aplicar diferentes Encodings para definir como os bytes s�o gravados nos arquivos. Os encodings s�o tabelas que transformam cada codepoint em seu caractere espec�fico, dependendo de determinada regi�o. Tamb�m observou que os encodings utilizados dependem muito de cada sistema operacional.");
        ps.println(); // imprime e ja vai pra uma nova linha
        ps.println("Usando o Windows, voc� implementou um programa para verificar a implementa��o do Java para Unicodes e Encodings e conheceu v�rias classes e m�todos. Aprendeu que a classe String possui um m�todo chamado codePointAt() para revelar o codepoint de determinado caractere a partir de sua posi��o na string. Descobriu que a classe que representa um encoding ou Character Set � Charset e o m�todo est�tico para retornar uma refer�ncia com o charset default � defaultCharset(). Aprendeu que a classe String tamb�m possui um m�todo para transformar os caracteres em bytes, o getBytes(), que usado sem argumento de entrada utiliza o charset padr�o. Existem tamb�m duas sobrecargas para esse m�todo, onde voc� pode informar o charset que deseja utilizar para a transforma��o. Conheceu a classe StandardCharsets, do pacote java.nio, que possui constantes pra os principais charsets. Por fim simulou o problema de encodings, gerando uma nova string a partir de um construtor que tinha como argumentos os bytes transformados no charset e o charset desejado para transforma��o. A solu��o foi garantir que o mesmo charset fosse aplicado, tanto na entrada quanto na sa�da.");
        ps.println();
        ps.println("As classes Scanner e InputStreamReader possuem sobrecargas de construtores que recebem como argumento qual charset ser� utilizado para fazer a transforma��o dos bytes em strings. De modo an�logo para escrita, a classe PrintWriter tamb�m permite informar qual charset ser� utilizado para transformar a string nos bytes espec�ficos.");
        ps.close();

    }
}