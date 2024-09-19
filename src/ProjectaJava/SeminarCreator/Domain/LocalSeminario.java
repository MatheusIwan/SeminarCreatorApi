package ProjectaJava.SeminarCreator.Domain;

public class LocalSeminario {
    private String Endereco;
    private Seminario seminario;

    //Construtor
    public LocalSeminario(String endereco) {
        Endereco = endereco;
    }

    //sobrecarga de construtor
    public LocalSeminario(String endereco, Seminario seminario) {
        Endereco = endereco;
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}
