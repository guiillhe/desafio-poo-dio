import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.awt.desktop.SystemSleepEvent;
import java.time.LocalDate;

public class main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Curso iniciante JAVA");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Dominando Intellij");
        mentoria1.setDescricao("Dominando alguns aceleradores de produção intellij");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria1);

    }
}
