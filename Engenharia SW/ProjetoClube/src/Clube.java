import java.util.ArrayList;
import java.util.List;

public class Clube {

    private List<Socio> listaSocios; // Lista de sócios do clube

    // Construtor para inicializar a lista de sócios
    public Clube() {
        this.listaSocios = new ArrayList<>(); // Inicializa a lista como um ArrayList vazio
    }

    // Método para obter a lista de sócios
    public List<Socio> getListaSocios() {
        return listaSocios;
    }

    // Método para definir a lista de sócios
    public void setListaSocios(List<Socio> listaSocios) {
        this.listaSocios = listaSocios;
    }

    // Método para adicionar um novo sócio à lista
    public void adicionarSocio(Socio numerosocio) {
        listaSocios.add(numerosocio); // Adiciona o novo sócio à lista de sócios
    }
}
