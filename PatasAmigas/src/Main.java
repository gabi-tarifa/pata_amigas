import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import modelo.*;

public class Main {
    static Scanner ler = new Scanner(System.in);
    static List<Funcionario> funcionarios = new ArrayList<>();
    static List<Tutor> tutores = new ArrayList<>();
    static List<Adotante> adotantes = new ArrayList<>();
    public static void main(String[] args) {
        boolean sistema = true;
        System.out.println("Bem-vindo ao Patas Amigas ");

        while(sistema){

            System.out.println("\nEscolha o que deseja acessar: ");
            System.out.println("1.Funcionário");
            System.out.println("2.Tutor");
            System.out.println("3.Adotante");
            System.out.println("4.Animal");
            System.out.println("5.Saída");
            int op = ler.nextInt();

            switch (op){
                case 1:
                    controle_funcionario();
                    break;
                case 2:
                    controle_tutor();
                    break;
                case 3:
                    controle_adotante();
                    break;
                case 4:
                    controle_animal();
                case 5:
                    sistema = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente para continuar.");
            }
        }
    }
    public static void controle_funcionario(){
        boolean voltar = false;
        while(!voltar){

            System.out.println("\nEscolha o que deseja acessar: ");
            System.out.println("1.Adiconar Funcionário");
            System.out.println("2.Listar Funcionarios");
            System.out.println("3.Editar Funcionario"); //não é necessário primeira entrega
            System.out.println("4.Voltar");
            int op = ler.nextInt();

            switch (op){
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    //listarFuncionarios();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente para continuar.");
            }
        }
    }

    public static void controle_tutor(){
        boolean voltar = false;
        while(!voltar){

            System.out.println("\nEscolha o que deseja acessar: ");
            System.out.println("1.Adiconar Tutor");
            System.out.println("2.Listar Tutores");
            System.out.println("3.Editar Tutor"); //não é necessário primeira entrega
            System.out.println("4.Voltar");
            int op = ler.nextInt();

            switch (op){
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente para continuar.");
            }
        }
    }

    public static void controle_adotante(){
        boolean voltar = false;
        while(!voltar){

            System.out.println("\nEscolha o que deseja acessar: ");
            System.out.println("1.Adiconar Adotante");
            System.out.println("2.Listar Adotantes");
            System.out.println("3.Editar Adotante"); //não é necessário primeira entrega
            System.out.println("4.Voltar");
            int op = ler.nextInt();

            switch (op){
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente para continuar.");
            }
        }
    }

    public static void controle_animal(){}

    public static void adicionarFuncionario() {
        System.out.println("Digite os dados do novo Funcionário:");
        System.out.print("Nome: ");
        ler.nextLine();
        String nome = ler.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = ler.nextLine(); // tratar a data adequadamente.
        Date nascimento = new Date(); // Implementar o parse correto aqui.

        System.out.print("Sexo: ");
        String sexo = ler.nextLine();
        System.out.print("CPF: ");
        long cpf = ler.nextLong();
        ler.nextLine();
        System.out.print("Endereço: ");
        String endereco = ler.nextLine();
        System.out.print("Telefone: ");
        long telefone = ler.nextLong();
        ler.nextLine();
        System.out.print("Email: ");
        String email = ler.nextLine();
        System.out.print("Senha: ");
        String senha = ler.nextLine();
        System.out.print("Cargo: ");
        String cargo = ler.nextLine();
        System.out.print("Departamento: ");
        String departamento = ler.nextLine();
        System.out.print("Salário: ");
        float salario = ler.nextFloat();

        Funcionario funcionario = new Funcionario(new Date(), cargo, salario, departamento, nome,
                nascimento, sexo, cpf, endereco, telefone,
                email, senha);
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

//    public static void listarFuncionarios() {
//        if (funcionarios.isEmpty()) {
//            System.out.println("Nenhum funcionário cadastrado.");
//        } else {
//            System.out.println("\nLista de Funcionários:");
//            for (Funcionario f : funcionarios) {
//                System.out.println(f);
//            }
//        }
//    }
}
