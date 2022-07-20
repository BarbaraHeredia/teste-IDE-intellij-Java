package br.com.br;

import br.com.br.model.Gato;

public class Primeiro_Programa_Intellij {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro_Um = new Livro("O dilema dos 3 corpos", 300);
        System.out.println(livro_Um);

        /*int a = 5;
        int b = 10;

        System.out.println("Hello Word!" + (a+b));*/
    }
}

class Livro {

    private String nome;
    private Integer num_pags;

    public Livro(String nome, Integer num_pags) {
        this.nome = nome;
        this.num_pags = num_pags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNum_pags() {
        return num_pags;
    }

    public void setNum_pags(Integer num_pags) {
        this.num_pags = num_pags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", num_pags=" + num_pags +
                '}';
    }
}