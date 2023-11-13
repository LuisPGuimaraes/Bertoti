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
            entrada_plano = sc.next().toUpperCase();
            System.out.println("Digite o número de inscrição:");
            entrada_inscricao = sc.nextInt();
            System.out.println();

            Socio numerosocio = new Socio(entrada_socio, new SimpleDateFormat("01-01-2024"), entrada_plano,entrada_inscricao);
            System.out.println("Novo usuário cadastrado:");
            System.out.println("Número de inscrição: " + numerosocio.getInscricao());
            System.out.println("Nome: " + numerosocio.getNome());
            System.out.println("Plano: " + numerosocio.getPlano());
            System.out.println("Validade: " + numerosocio.getValidade());
            }
            





        }



    }
