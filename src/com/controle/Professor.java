package com.controle;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    // Atributos
    private String nome;
    private List<String> cursos = new ArrayList<String>();

    public Professor(String nome) {
        this.nome = nome;
    }

    // Métodos
    // Getters e Setters
    public String cursosToString() {
        return "O(A) Professor(a) " + this.nome + " administra o(s) curso(s): " + cursos.toString();
    }

    public void setCursos(String curso) {
        this.cursos.add(curso);
    }
}
