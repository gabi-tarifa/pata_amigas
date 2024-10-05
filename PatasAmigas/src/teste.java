/*
Esse é um arquivo de testes para quando houver uma alteração muito grande na classe Main de uma 
versão pra outra, ainda seja possível desenhar tais mudanças para não quebrar o código total-
mente. Não que esse seja o arquivo principal, longe disso, mas, pelo menos pra mim, isso ajuda
mais na organização das ideias e orienta mais para evitar vários problemas.

˜Gabriel Tarifa <3
*/


//Última versão para backup:
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import modelo.*;

public class teste {
    static Scanner ler = new Scanner(System.in);
    static List<Funcionario> funcionarios = new ArrayList<>();
    static List<Tutor> tutores = new ArrayList<>();
    static List<Adotante> adotantes = new ArrayList<>();
    static List<Animal> animais = new ArrayList<>();
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
                    break;
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
            System.out.println("1.Adicionar Funcionário");
            System.out.println("2.Listar Funcionarios");
            System.out.println("3.Editar Funcionario"); //não é necessário primeira entrega
            System.out.println("4.Voltar");
            int op = ler.nextInt();

            switch (op){
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    listarFuncionarios();
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
                    adicionarTutor();
                    break;
                case 2:
                    listarTutores();
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
                    adcionarAdotante();
                    break;
                case 2:
                    listarAdotantes();
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

    public static void controle_animal(){
        boolean voltar = false;
        while(!voltar){

            System.out.println("\nEscolha o que deseja acessar: ");
            System.out.println("1.Adiconar Animal");
            System.out.println("2.Listar Animal");
            System.out.println("3.Editar Animal"); //não é necessário primeira entrega
            System.out.println("4.Voltar");
            int op = ler.nextInt();

            switch (op){
                case 1:
                    adicionarAnimal();
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    //editarAnimal();
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente para continuar.");
            }
}
}

    public static void adicionarFuncionario() {
        System.out.println("Digite os dados do novo Funcionário:");
        System.out.print("Nome: ");
        ler.nextLine();
        String nome = ler.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        //esse pedaço do código, se não esperar o pior do usuário a gnt vai se lascar dms
        String dataNascimentoStr = ler.nextLine(); // tratar a data adequadamente.
        String[] partesData = dataNascimentoStr.split("/");
        int dia = Integer.parseInt(partesData[0]), mes = Integer.parseInt(partesData[1]), ano = Integer.parseInt(partesData[2]);
        LocalDate nascimento = LocalDate.of(ano, mes, dia); // Acredito que isso faça o trabalho, mas ainda tem q ver

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

    public static void adicionarTutor() {
        System.out.println("Digite os dados do novo Tutor:");
        System.out.print("Nome: ");
        ler.nextLine();
        String nome = ler.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        //esse pedaço do código, se não esperar o pior do usuário a gnt vai se lascar dms
        String dataNascimentoStr = ler.nextLine(); // tratar a data adequadamente.
        String[] partesData = dataNascimentoStr.split("/");
        int dia = Integer.parseInt(partesData[0]), mes = Integer.parseInt(partesData[1]), ano = Integer.parseInt(partesData[2]);
        LocalDate nascimento = LocalDate.of(ano, mes, dia); // Acredito que isso faça o trabalho, mas ainda tem q ver

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
        System.out.print("Animais sob custódia: ");
        int animaisCustodia = ler.nextInt();
        ler.nextLine();
        System.out.print("Histórico de adoção: "); // Lista - adicionado em formato de string
        String historicoAdocao = ler.nextLine();
        System.out.print("Status: ");
        String status = ler.nextLine();

        Tutor tutor = new Tutor(animaisCustodia, historicoAdocao, status, nome,
                nascimento, sexo, cpf, endereco, telefone, email, senha);

        tutores.add(tutor);
        System.out.println("Tutor adicionado com sucesso!");}

    public static void adcionarAdotante(){
        System.out.println("Digite os dados do novo Adotante:");
        System.out.print("Nome: ");
        ler.nextLine();
        String nome = ler.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        //esse pedaço do código, se não esperar o pior do usuário a gnt vai se lascar dms
        String dataNascimentoStr = ler.nextLine(); // tratar a data adequadamente.
        String[] partesData = dataNascimentoStr.split("/");
        int dia = Integer.parseInt(partesData[0]), mes = Integer.parseInt(partesData[1]), ano = Integer.parseInt(partesData[2]);
        LocalDate nascimento = LocalDate.of(ano, mes, dia); // Acredito que isso faça o trabalho, mas ainda tem q ver

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
        System.out.println("Preferências:");
        String preferencias = ler.nextLine();
        System.out.println("Status:");
        String status = ler.nextLine();

        Adotante adotante = new Adotante(preferencias, null, status, nome,
                status, nascimento, sexo, cpf, endereco, telefone,
                email, senha);
        adotantes.add(adotante);
        System.out.println("Adotante adicionado com sucesso!");
    }

    public static void adicionarAnimal() {
        String nome;
        String especie;
        String raca;
        int idade;
        String sexo;
        String historicoMedico; //Será alterado mais pra frente para um objeto relacional (sla como krls faremos isso, mas faremos)
        Date cadastro = new Date(); //Será usado para gerar um parse para entrar dentro do objeto Date cadastro
        String statusAdocao = "Disponível";

        System.out.println("Digite os dados no novo animal:");
        System.out.print("Nome: ");
        ler.nextLine();
        nome = ler.nextLine();
        System.out.print("Espécie do animal: ");
        especie = ler.nextLine();
        System.out.print("Raça do animal: ");
        raca = ler.nextLine();
        System.out.print("Idade (em anos humanos) do animal: ");
        idade = ler.nextInt();
        System.out.print("Sexo do animal: ");
        ler.nextLine();
        sexo = ler.nextLine();
        System.out.print("Histórico médico do animal: ");
        historicoMedico = ler.nextLine();

        Animal animal = new Animal(nome, especie, raca, idade, sexo, historicoMedico, cadastro, statusAdocao);
        animais.add(animal);

        System.out.println("Animal adicionado com sucesso!!");
    }

    public static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\nLista de Funcionários:");
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    public static void listarTutores() {
        if (tutores.isEmpty()) {
            System.out.println("Nenhum tutor cadastrado.");
        } else {
            System.out.println("\nLista de Tutores:");
            for (Tutor t : tutores) {
                System.out.println(t);
            }
        }
    }

    public static void listarAdotantes() {
        if (adotantes.isEmpty()) {
            System.out.println("Nenhum adotante cadastrado.");
        } else {
            System.out.println("\nLista de Adotantes:");
            for (Adotante a : adotantes) {
                System.out.println(a);
            }
        }
    }

    public static void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal a : animais) {
                System.out.println(a.apresentar());
            }
        }
    }
}