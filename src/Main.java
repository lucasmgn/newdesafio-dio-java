import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

            /*System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria1);*/


            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria1);

            Dev devCarlos = new Dev();
            devCarlos.setNome("Carlota Neves");
            devCarlos.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos inscritos, Carlota: " + devCarlos.getConteudosInscritos() );
            devCarlos.progredir();
            devCarlos.progredir();
            devCarlos.progredir();
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Conteudos inscritos, Carlota: " + devCarlos.getConteudosInscritos() );
            System.out.println("Conteudos concluidos, Carlota: " + devCarlos.getConteudosConcluidos() );
            System.out.println("XP: " + devCarlos.calcularXP());

            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            Dev devMarcos = new Dev();
            devMarcos.setNome("Marcos Leite");
            devMarcos.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos inscritos, Marcos: " + devMarcos.getConteudosInscritos() );
            devMarcos.progredir();
            devMarcos.progredir();
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Conteudos inscritos, Marcos: " + devMarcos.getConteudosInscritos() );
            System.out.println("Conteudos concluidos, Marcos: " + devMarcos.getConteudosConcluidos());
            System.out.println("XP: " + devMarcos.calcularXP());
    }


    }

