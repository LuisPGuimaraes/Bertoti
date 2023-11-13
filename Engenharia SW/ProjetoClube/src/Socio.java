import java.text.SimpleDateFormat;


public class Socio {
    public String nome;
    public SimpleDateFormat validade;
    public String plano;
    private String inscricao;

    public Socio(String nome, SimpleDateFormat validade, String plano, Integer inscricao) {
        this.nome = nome;
        this.validade = validade;
        this.plano = plano;
        this.inscricao = String.valueOf(inscricao);
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(Integer inscricao) {
        this.inscricao = String.valueOf(inscricao);
    }

    public Socio(String nome, SimpleDateFormat validade, String plano) {
        this.nome = nome;
        this.validade = validade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SimpleDateFormat getValidade() {
        return validade;
    }

    public void setValidade(SimpleDateFormat validade) {
        this.validade = validade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}