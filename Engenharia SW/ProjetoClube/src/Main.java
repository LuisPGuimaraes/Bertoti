import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-aaaa");


        System.out.print("Digite seu nome: ");
        String nome_func = sc.nextLine();
        Funcionario funcionario = new Funcionario(nome_func);
        funcionario.setNome_func(nome_func);
        System.out.println();
        System.out.println("BEM VINDO!" + funcionario.getNome_func() );
        System.out.println();
        System.out.println();
        System.out.println("O que deseja fazer?");
        System.out.println("1. Buscar Sócio");
        System.out.println("0. Sair");

        Socio socio = new Socio(Socio.nome,Socio.validade,Socio.plano,Socio.    inscricao);
        Socio socio1 = new Socio("Fernando","12-12-2023","Basico");

    }
}