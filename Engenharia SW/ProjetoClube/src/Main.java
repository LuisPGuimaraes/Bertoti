import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static <Int> void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-aaaa");
        String entrada_socio;
        String entrada_plano;
        int entrada_inscricao;
        String dados_socio;

        Clube clube = new Clube();

        Socio socio1 = new Socio("Fernando",new SimpleDateFormat("12-12-2023"),"Basico", 0001);
        Socio socio2 = new Socio("Beatriz", new SimpleDateFormat("11-05-2023"), "Premium", 0002);

        System.out.print("Digite seu nome: ");
        String nome_func = sc.nextLine();
        Funcionario funcionario = new Funcionario(nome_func);
        funcionario.setNome_func(nome_func);
        System.out.println();
        System.out.println("BEM VINDO!" + funcionario.getNome_func() );
        System.out.println();
        System.out.println();
        System.out.println("O que deseja fazer?");
        System.out.println("1. Cadastro Novo Sócio");
        System.out.println("0. Sair");
        int registrador = sc.nextInt();
        if (registrador == 0){
            System.out.println("Até mais!!!");
        }
        else if (registrador == 1);{
            System.out.println("Digite o nome do sócio:");
            entrada_socio = sc.next();
            System.out.println("Digite o plano:");
            entrada_plano = sc.next();
            System.out.println("Digite o número de inscrição:");
            entrada_inscricao = sc.nextInt();

            if (socio3 == false){
                
            }

            Socio
            //dados_socio = "1" + entrada_socio + "2" + entrada_plano + "3" + entrada_inscricao;
            //clube.adicionarSocio(dados_socio);

            //System.out.println(clube.getListaSocios());
           // System.out.println("_____Plano Gold_____");





        }



    }
}