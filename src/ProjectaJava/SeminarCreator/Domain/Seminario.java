package ProjectaJava.SeminarCreator.Domain;

public class Seminario {
    private String titulo;
    private Estudante[] estudante;
    private Professor professor;
    private LocalSeminario local;

    //Construtor
    public Seminario(String titulo, Estudante[] estudante) {
        this.titulo = titulo;
        this.estudante = estudante;
    }

    //sobrecarga de construtor
    public Seminario(String titulo, Estudante[] estudante, Professor professor) {
        this.titulo = titulo;
        this.estudante = estudante;
    }

    public Seminario(String titulo, Estudante[] estudante, Professor professor, LocalSeminario local) {
        this.titulo = titulo;
        this.estudante = estudante;
        this.professor = professor;
        this.local = local;
    }

    //Metodo de impressao
    public void imprime() {
        if (titulo == null) {
            System.out.println("||SEM SEMINARIOS CADASTRADOS||");
        }

        System.out.println("## SEMINARIOS CADASTRADOS ##");

        for (Seminario seminario : professor.getSeminario()) {
            System.out.println("\n|Seminario: " + seminario.getTitulo());
        }

        System.out.println("|Professor: " + professor.getName() + " |Materia: " + professor.getMateria());
        System.out.println();

        if (professor == null || local == null) {
            System.out.println("** NAO HA SEMINARIO **");
        }
        System.out.println("## SEMINARIO -" + this.titulo + "- ##");
        System.out.println("\n|Seminario: " + this.titulo + " |Local do seminario: " + this.local.getEndereco());

        if (estudante != null || estudante.length != 0) {
            System.out.println("\n## ALUNOS CADASTRADOS ##");
        }
        for (Estudante estudantes : this.estudante) {
            System.out.println("\n|Aluno cadastrado: " + estudantes.getName() + "\n|Idade do aluno: " + estudantes.getAge() + "\n-Seminario cadastrado: " + this.titulo);
        }
        System.out.println();


    }

    public LocalSeminario getLocal() {
        return local;
    }

    public void setLocal(LocalSeminario local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        titulo = titulo;
    }


}
