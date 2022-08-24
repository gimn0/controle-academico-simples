package com.controle;

public class Funcionario {
    // Atributo
    private String nome, funcao;

    // Constructor
    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String funcionarioToString() {
        return "O(A) funcionário(a) " + this.nome + " tem a função de: " + this.funcao;
    }
}
