import java.util.date;
public class Entities {

    public class Funcionario() {

        double incricao;
        Date x = new Date ();
        public Funcionario () {
            this.inscricao = inscricao;
        }
        private double inscricao;

        public String getNome() {
            return Socio.nome;
        }

        public void setNome(String incricao) {
            this.Socio.nome = Socio.nome;
        }

        public double getValidade() {
            return Socio.validade;
        }

        public void setValidade() {
            this.Socio.validade = Socio.validade;
        }

        public String getPlano() {
            return Socio.plano;
        }

        public void setPlano() {
            this.Socio.plano = Socio.plano;
        }
    }
        public boolean comparar (date validade, date dataHoje){
            if (validade>dataHoje)
            }


    public class Socio(){
        public String nome;
        public date validade;
        public String plano;
        public String dataHoje;

        public Socio(String nome, date validade, String plano, String dataHoje) {
            this.nome = nome;
            this.validade = validade;
            this.plano = plano;
            this.dataHoje = dataHoje;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public date getValidade() {
            return validade;
        }

        public void setValidade(date validade) {
            this.validade = validade;
        }

        public String getPlano() {
            return plano;
        }

        public void setPlano(String plano) {
            this.plano = plano;
        }

        public date getDataHoje() {
            return dataHoje;
        }

        public void setDataHoje(date dataHoje) {
            this.dataHoje = dataHoje;
        }
    }

    public class Clube(){
        private list <Socio> ();

        public Clube() {
        }

        private boolean socio_entrada(Socio){
            if (Socio.validade > date){
                return True;}
            else {
                return False;}

        }
    }
}
