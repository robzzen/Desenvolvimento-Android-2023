package devandroid.pires.applistacurso.model;

public class Pessoa {

    //CONSTRUTOR
    //ATRIBUTOS - OBJETOS - MOLDE - MODELO - TEMPLATE
    //MÉTODOS DE ACESSO - GET SET

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(){}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override       //TO STRING - para textos - para strings de caracteres
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
