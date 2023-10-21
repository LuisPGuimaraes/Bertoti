import java.util.Date;

public class Funcionario {
    private String nome_func;

    public Funcionario(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getNome() {
        return Socio.nome;
    }

    public void setNome(String nome) {
        Socio.nome = Socio.nome;
    }

    public Date getValidade() {
        return Socio.validade;
    }

    public String getPlano() {
        return Socio.plano;
    }

    public void setPlano() {
        Socio.plano = Socio.plano;
    }
}
