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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos 'Dev1': " + dev1.getConteudosInscritos());

        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos 'Dev1': " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos 'Dev1': " + dev1.getConteudosConcluidos());
        System.out.println("XP adquirida: " + dev1.calcularTotalXp());

        System.out.println("--------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos 'Dev2': " + dev2.getConteudosInscritos());

        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos 'Dev2': " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos 'Dev2': " + dev2.getConteudosConcluidos());
        System.out.println("XP adquirida: " + dev2.calcularTotalXp());

    }
}