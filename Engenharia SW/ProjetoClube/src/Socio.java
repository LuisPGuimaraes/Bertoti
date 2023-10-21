import java.util.Date;

public class Socio {
    public static String nome;
    public static Date validade;
    public static String plano;
    private Integer inscricao;

    public Socio(Integer inscricao) {
        this.inscricao = inscricao;
    }

    public Integer getInscricao() {
        return inscricao;
    }

    public void setInscricao(Integer inscricao) {
        this.inscricao = inscricao;
    }

    public Socio(String nome, Date validade, String plano) {
        Socio.nome = nome;
        Socio.validade = validade;
        Socio.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Socio.nome = nome;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        Socio.validade = validade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        Socio.plano = plano;
    }
}