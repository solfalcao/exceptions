package br.com.digitalhouse.aulaexceptions;

public class Principal {

    public static void main(String[] args) {

        String nome = "Jess";
        int idade = 18;

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);

        System.out.println("Divisao: "+idade/2);

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Milena");

        System.out.println("Nome pessoa "+pessoa.getNome());
    }
}
