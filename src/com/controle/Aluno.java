package com.controle;

import java.text.DecimalFormat;

public class Aluno {
    // Atributos
    private int matricula;
    private String nome;
    private double notaAV1, notaAV2, notaAV3, media;

    DecimalFormat df = new DecimalFormat("#.##");

    // Constructor
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Métodos
    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public double getNotaAV3() {
        return notaAV3;
    }

    public void setNotaAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
    }

    private double getMedia() {
        return this.media = (this.notaAV1 * 1 + this.notaAV2 * 2 + this.notaAV3 * 3) / 6;
    }

    public String mediaToString() {
        this.getMedia();
        return "O aluno " + this.nome + ", matrícula: " + this.matricula +
                ", tem a média: " + df.format(this.media);
    }
}
