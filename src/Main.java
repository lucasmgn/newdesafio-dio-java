import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
public class Main {

    public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição do curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso js");
            curso2.setDescricao("descrição do curso js");
            curso2.setCargaHoraria(4);

            Mentoria mentoria1 = new Mentoria();
            mentoria1.setTitulo("Mentoria de java");
            mentoria1.setDescricao("Descrição: mentoria java");
            mentoria1.setData(LocalDate.now());

            System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria1);
        }


    }

