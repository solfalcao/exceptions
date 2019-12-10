package br.com.digitalhouse.aulaexceptionsexemplo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        try {

            ArrayList<String> lista = new ArrayList<>();

            lista.add("João");
            lista.add("Jessica");
            lista.add("Manoel");


            System.out.println(lista.get(3));
        }catch (java.lang.Exception e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
            e.printStackTrace();

        }finally {

            System.out.println("Estou no bloco finally");
        }
    }
}
