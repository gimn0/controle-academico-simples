package com.controle;

public class Main {
    public static void main(String[] args) {
        // Aluno 1
        Aluno aluno1 = new Aluno(201910138, "Lucas Pinheiro Saraiva de Lima");

        aluno1.setNotaAV1(4.7);
        aluno1.setNotaAV2(7.3);
        aluno1.setNotaAV3(8.1);

        System.out.println("Nota da AV1: " + aluno1.getNotaAV1());
        System.out.println("Nota da AV2: " + aluno1.getNotaAV2());
        System.out.println("Nota da AV3: " + aluno1.getNotaAV3());
        System.out.println(aluno1.mediaToString());

        System.out.println("");

        // Aluno 2
        Aluno aluno2 = new Aluno(111111111, "Fulano da Silva Costa");

        aluno2.setNotaAV1(7.6);
        aluno2.setNotaAV2(5.3);
        aluno2.setNotaAV3(3);

        System.out.println("Nota da AV1: " + aluno2.getNotaAV1());
        System.out.println("Nota da AV2: " + aluno2.getNotaAV2());
        System.out.println("Nota da AV3: " + aluno2.getNotaAV3());
        System.out.println(aluno2.mediaToString());

        System.out.println("");
        // Professor 1
        Professor prof1 = new Professor("Darielson Araujo");
        prof1.setCursos("Inteligência Artificial");
        prof1.setCursos("Desenvolvimento de Sistemas 1");
        prof1.setCursos("POO 3");
        System.out.println(prof1.cursosToString());

        // Professor 2
        Professor prof2 = new Professor("André Barros");
        prof2.setCursos("Teoria da Computação");
        System.out.println(prof2.cursosToString());

        // Professor 3
        Professor prof3 = new Professor("Marcia Tonieto");
        prof3.setCursos("Sistemas Distribuídos");
        System.out.println(prof3.cursosToString());
    }
}