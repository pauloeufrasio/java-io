package br.com.alura.java.oi.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // Pegando code point
        String s = "C";
        System.out.println(s.codePointAt(0)); // unicode

        // Buscar Encoding da maquina
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        // pegar bytes e imprimindo os charset
        byte[] bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");

        // Transformar byte em String
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        // pegar bytes e imprimindo os charset
        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");

        // Transformar byte em String
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);

        // pegar bytes e imprimindo os charset
        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII, ");

        // Transformar byte em String
        sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

    }
}
