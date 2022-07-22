import model.Bootcamp;
import model.Curso;
import model.Dev;
import model.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("model.Curso Java");
        curso1.setDescritivo("Descrição curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("model.Curso JavaScript");
        curso2.setDescritivo("Descrição curso JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("model.Mentoria Java");
        mentoria.setDescritivo("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp desafioJava = new Bootcamp();
        desafioJava.setNome("Desafio de Projeto Java");
        desafioJava.setDescricao("Projeto criado para o Desafio Java do curso Spring Framework Experience");

        desafioJava.getConteudos().add(curso1);
        desafioJava.getConteudos().add(curso2);
        desafioJava.getConteudos().add(mentoria);

        Dev cleberBarros = new Dev();
        cleberBarros.setNome("Cleber Barros");

        cleberBarros.inscreverBootcamp(desafioJava);

        System.out.println("\nCursos inscritos anteriormente: " + cleberBarros.getConteudosInscritos());
        cleberBarros.progredir();
        System.out.println("\nCursos concluídos: " + cleberBarros.getConteudosConcluidos());
        System.out.println("\nCursos incristos agora: " + cleberBarros.getConteudosInscritos());
        System.out.println("\nTotal de XP até agora: " + cleberBarros.calcularTotalXp());



    }
}
