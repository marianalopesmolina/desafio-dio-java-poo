package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
            curso.setTitulo("Curso Java");
            curso.setDescricao("Descrição");
            curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("Curso JavaScript");
            curso2.setDescricao("Descrição");
            curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java");
            mentoria.setDescricao("Descrição mentoria");
            mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);

        System.out.println(mentoria);

    }
}