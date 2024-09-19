package ProjectaJava.SeminarCreator.Domain;

public class Professor {
    private String name;
    private String materia;
    private Seminario[] seminario;

    //Construtor
    public Professor(String name, String materia) {
        this.name = name;
    }

    //sobrecarga de construtor
    public Professor(String name, String materia, Seminario[] seminario) {
        this.name = name;
        this.materia = materia;
        this.seminario = seminario;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
