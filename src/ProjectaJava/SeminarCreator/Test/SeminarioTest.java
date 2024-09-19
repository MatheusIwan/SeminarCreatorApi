package ProjectaJava.SeminarCreator.Test;

import ProjectaJava.SeminarCreator.Domain.Estudante;
import ProjectaJava.SeminarCreator.Domain.LocalSeminario;
import ProjectaJava.SeminarCreator.Domain.Professor;
import ProjectaJava.SeminarCreator.Domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {

        //Criacao do local
        LocalSeminario local = new LocalSeminario("Avenida das limoeiras");

        //Criacao do estudante
        Estudante estudante = new Estudante("Lucas", 16);
        Estudante estudante1 = new Estudante("Rafael", 17);
        Estudante[] estudantes = {estudante, estudante1};

        //Criacao do seminario
        Seminario seminario = new Seminario("Estruturas de Dados", estudantes);
        Seminario[] seminarios = {seminario};

        //Criacao do professor
        Professor professor = new Professor("David", "Estrutura e logisca de Programacao", seminarios);

        //Associacao de seminario e estudante
        estudante.setSeminario(seminario);
        estudante1.setSeminario(seminario);
        seminario.setEstudante(estudantes);

        //Associacao de seminario e professor
        seminario.setProfessor(professor);
        professor.setSeminario(seminarios);

        //Associacao de seminario a local
        seminario.setLocal(local);

        //Impressao dos dados
        seminario.imprime();

    }
}