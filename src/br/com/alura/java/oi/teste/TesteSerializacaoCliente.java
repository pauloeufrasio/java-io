package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Cliente cliente = new Cliente();
        // Criar cliente nico
//        cliente.setNome("Nico");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("234113131");
        // Gravar objeto cliente e criando arquivo cliente.bin
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        // lendo arquivo gravado cliente.bin
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getNome());

    }
}
