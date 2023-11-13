import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static <Int> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-aaaa");
        String entrada_socio;
        String entrada_plano;
        int entrada_inscricao;
        String dados_socio;

        Clube clube = new Clube();

        Socio socio1 = new Socio("Fernando", new SimpleDateFormat("12-12-2023"), "Basico", 0001);
        Socio socio2 = new Socio("Beatriz", new SimpleDateFormat("11-05-2023"), "Premium", 0002);

        System.out.print("Digite seu nome: ");
        String nome_func = sc.nextLine();
        Funcionario funcionario = new Funcionario(nome_func);
        funcionario.setNome_func(nome_func);
        System.out.println();
        System.out.println("BEM VINDO!" + funcionario.getNome_func());
        System.out.println();
        System.out.println();
        
        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Cadastro Novo Sócio");
            System.out.println("2. Consultar Sócio");
            System.out.println("0. Sair");
            int registrador = sc.nextInt();
            if (registrador == 1) {
                System.out.println("Digite o nome do sócio:");
                entrada_socio = sc.next();
                System.out.println("Digite o plano:");
                entrada_plano = sc.next().toUpperCase();
                System.out.println("Digite o número de inscrição:");
                entrada_inscricao = sc.nextInt();

                Socio numerosocio = new Socio(entrada_socio, new SimpleDateFormat("01-01-2024"), entrada_plano, entrada_inscricao);
                clube.adicionarSocio(numerosocio);
                System.out.println("Novo usuário cadastrado:");
                System.out.println("Número de inscrição: " + numerosocio.getInscricao());
                System.out.println("Nome: " + numerosocio.getNome());
                System.out.println("Plano: " + numerosocio.getPlano());
                System.out.println("Validade: " + numerosocio.getValidade());
            }
            else if (registrador == 2) {
                System.out.println("_____Consultar Sócio_____");
                System.out.println();
                System.out.println("Digite o número de inscrição: ");
                String selecionar_inscricao = sc.next();
                for (Socio numerosocio : clube.getListaSocios()) {
                    if (Objects.equals(numerosocio.getInscricao(), selecionar_inscricao)) {
                        System.out.println(numerosocio.getNome());

                        if (Objects.equals(numerosocio.getPlano(), "GOLD")) {
                            System.out.println("_____PLANO GOLD_____");
                            System.out.println("Acessos:");
                            System.out.println("1. Quadra poliesportiva");
                            System.out.println("2. Piscina");
                            System.out.println("3. Salão de jogos");
                            System.out.println("4. Academia");
                            System.out.println("0. Voltar");
                            System.out.println();
                            System.out.println("Insira qual acesso deseja: ");

                            while (true) {
                                int registrador2 = sc.nextInt();
                                if (registrador2==1){
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____QUADRA_____");
                                }
                                else if (registrador2==2) {
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____PISCINA_____");
                                }
                                else if (registrador2==3) {
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____SALÃO DE JOGOS_____");
                                }
                                else if (registrador2==4) {
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____ACADEMIA_____");
                                }
                                if (registrador2==0) {
                                    break;
                                }
                            }
                        }
                        if (Objects.equals(numerosocio.getPlano(), "SILVER")) {
                            System.out.println("_____PLANO SILVER_____");
                            System.out.println("Acessos:");
                            System.out.println("1. Quadra poliesportiva");
                            System.out.println("2. Piscina");
                            System.out.println("0. Voltar");
                            System.out.println();
                            System.out.println("Insira qual acesso deseja: ");

                            while (true) {
                                int registrador2 = sc.nextInt();
                                if (registrador2==1){
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____QUADRA_____");
                                }
                                else if (registrador2==2) {
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____PISCINA_____");
                                }
                                if (registrador2==0) {
                                    break;
                                }
                            }
                        }
                        if (Objects.equals(numerosocio.getPlano(), "BRONZE")) {
                            System.out.println("_____PLANO BRONZE_____");
                            System.out.println("Acessos:");
                            System.out.println("1. Quadra poliesportiva");
                            System.out.println("0. Voltar");
                            System.out.println();
                            System.out.println("Insira qual acesso deseja: ");

                            while (true) {
                                int registrador2 = sc.nextInt();
                                if (registrador2==1){
                                    System.out.println("_____Acesso liberado_____");
                                    System.out.println();
                                    System.out.println("_____QUADRA_____");
                                }
                                if (registrador2==0) {
                                    break;
                                }
                    }

                }}
            else if (registrador == 3) {
                System.out.println("teste");
                System.out.println(clube.getListaSocios());
            }
            else if (registrador == 0) {
                System.out.println("Até mais!!!");
                break;}
             }







    }}}}