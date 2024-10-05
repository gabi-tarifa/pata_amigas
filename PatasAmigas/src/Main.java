import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import modelo.*;

public class Main {
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
            System.out.println("5.Exibir Usuários");
            System.out.println("6.Saída");
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
                    exibirUsuarios(funcionarios, tutores, adotantes);
                    break;
                case 6:
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
                    adicionarAdotante();
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
        System.out.println("Digite o ID da pessoa ou 0 para novo cadastro: ");
        int id = ler.nextInt();

        Pessoa pessoaExistente = null;
        if (id != 0) {
            pessoaExistente = buscarPessoaPorId(id);
        }

        if (pessoaExistente == null) {
            // Se não encontrou pessoa, cadastrar nova
            System.out.println("Pessoa nova, digite os dados abaixo.");
            ler.nextLine();
            System.out.print("Nome: ");
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

            // Atributos específicos de Funcionário
            System.out.print("Cargo: ");
            String cargo = ler.nextLine();
            System.out.print("Departamento: ");
            String departamento = ler.nextLine();
            System.out.print("Salário: ");
            float salario = ler.nextFloat();

            Funcionario funcionario = new Funcionario(new Date(), cargo, salario, departamento, nome,
                    nascimento, sexo, cpf, endereco, telefone, email, senha);
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");

        } else {
            // Reutilizar dados da pessoa existente
            System.out.println("Pessoa encontrada. Nome: " + pessoaExistente.getNome());

            // Solicitar apenas os atributos específicos do funcionário
            System.out.print("Cargo: ");
            ler.nextLine(); // Consumir o '\n' pendente
            String cargo = ler.nextLine();
            System.out.print("Departamento: ");
            String departamento = ler.nextLine();
            System.out.print("Salário: ");
            float salario = ler.nextFloat();

            Funcionario funcionario = new Funcionario(new Date(), cargo, salario, departamento,
                    pessoaExistente.getNome(), pessoaExistente.getNascimento(),
                    pessoaExistente.getSexo(), pessoaExistente.getCpf(),
                    pessoaExistente.getEndereco(), pessoaExistente.getTelefone(),
                    pessoaExistente.getEmail(), pessoaExistente.getSenha());
            funcionario.setId_funcionario(id);
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        }
    }
    public static Pessoa buscarPessoaPorId(int id) {
        // Procurar entre os funcionários
        for (Funcionario f : funcionarios) {
            if (f.getId_funcionario() == id) {
                return f;
            }
        }
        // Procurar entre os tutores
        for (Tutor t : tutores) {
            if (t.getId_tutor() == id) {
                return t;
            }
        }
        // Procurar entre os adotantes
        for (Adotante a : adotantes) {
            if (a.getId_adotante() == id) {
                return a;
            }
        }
        // Caso não encontre, retorna null
        return null;
    }


    public static void adicionarTutor() {
        System.out.println("Digite o ID da pessoa ou 0 para novo cadastro: ");
        int id = ler.nextInt();

        Pessoa pessoaExistente = null;
        if (id != 0) {
            pessoaExistente = buscarPessoaPorId(id);
        }

        if (pessoaExistente == null) {
            // Se não encontrou pessoa, cadastrar nova
            System.out.println("Pessoa nova, digite os dados abaixo.");
            ler.nextLine();
            System.out.print("Nome: ");
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

            // Atributos específicos de Tutor
            System.out.print("Animais sob custódia: ");
            int animaisCustodia = ler.nextInt();
            ler.nextLine();
            System.out.print("Histórico de adoção: "); // Lista - adicionado em formato de string
            String historicoAdocao = ler.nextLine();
            System.out.print("Status: ");
            String status = ler.nextLine();

            Tutor tutor = new Tutor( animaisCustodia,historicoAdocao,status,nome, nascimento, sexo, cpf, endereco, telefone, email, senha);
            tutores.add(tutor);
            System.out.println("Tutor adicionado com sucesso!");

        } else {
            // Reutilizar dados da pessoa existente
            System.out.println("Pessoa encontrada. Nome: " + pessoaExistente.getNome());

            // Solicitar apenas os atributos específicos do tutor
            System.out.print("Animais sob custódia: ");
            int animaisCustodia = ler.nextInt();
            ler.nextLine();
            System.out.print("Histórico de adoção: "); // Lista - adicionado em formato de string
            String historicoAdocao = ler.nextLine();
            System.out.print("Status: ");
            String status = ler.nextLine();

            Tutor tutor = new Tutor(animaisCustodia,historicoAdocao,status, pessoaExistente.getNome(), pessoaExistente.getNascimento(), pessoaExistente.getSexo(), pessoaExistente.getCpf(), pessoaExistente.getEndereco(), pessoaExistente.getTelefone(), pessoaExistente.getEmail(), pessoaExistente.getSenha());
            tutor.setId_tutor(id);
            tutores.add(tutor);
            System.out.println("Tutor adicionado com sucesso!");
        }
    }

    public static void adicionarAdotante() {
        System.out.println("Digite o ID da pessoa ou 0 para novo cadastro: ");
        int id = ler.nextInt();

        Pessoa pessoaExistente = null;
        if (id != 0) {
            pessoaExistente = buscarPessoaPorId(id);
        }

        if (pessoaExistente == null) {
            // Se não encontrou pessoa, cadastrar nova
            System.out.println("Pessoa nova, digite os dados abaixo.");
            ler.nextLine();
            System.out.print("Nome: ");
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

            // Atributos específicos de Adotante
            System.out.println("Preferências:");
            String preferencias = ler.nextLine();
            System.out.println("Status:");
            String status = ler.nextLine();

            Adotante adotante = new Adotante(preferencias,null, status ,nome, status, nascimento, sexo, cpf, endereco, telefone, email, senha);
            adotantes.add(adotante);
            System.out.println("Adotante adicionado com sucesso!");

        } else {
            // Reutilizar dados da pessoa existente
            System.out.println("Pessoa encontrada. Nome: " + pessoaExistente.getNome());

            // Solicitar apenas os atributos específicos do adotante
            // Atributos específicos de Adotante
            System.out.println("Preferências:");
            ler.nextLine();
            String preferencias = ler.nextLine();
            System.out.println("Status:");
            String status = ler.nextLine();

            Adotante adotante = new Adotante(preferencias,null, status, pessoaExistente.getNome(), status, pessoaExistente.getNascimento(), pessoaExistente.getSexo(), pessoaExistente.getCpf(), pessoaExistente.getEndereco(), pessoaExistente.getTelefone(), pessoaExistente.getEmail(), pessoaExistente.getSenha());
            adotante.setId_adotante(id);
            adotantes.add(adotante);
            System.out.println("Adotante adicionado com sucesso!");
        }
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
    /* 
    public static Date parseDate(String dataStr) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(dataStr);  // Faz o parsing da string para Date
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            return null;  // Ou você pode lançar uma exceção, ou tratar o erro de outra forma
        }
    }*///Não vou apagar essa linha de código pq uma hora vai ser útil, mas para as datas de nascimento TEM que ser LocalDate para não ter mta informação desnecessária como horário e dia da semana 

    public static void exibirUsuarios(List<Funcionario> funcionarios, List<Tutor> tutores, List<Adotante> adotantes) {
        // Mapa para armazenar pessoas por ID
        Map<Integer, Usuario> usuariosMap = new HashMap<>();

        // Adiciona funcionários ao mapa
        for (Funcionario f : funcionarios) {
            // Verifica se o ID já existe no mapa
            if (!usuariosMap.containsKey(f.getId_funcionario())) {
                // Se não existe, cria um novo usuário
                usuariosMap.put(f.getId_funcionario(), new Usuario(f));
            }
            // Se já existe, atualiza as informações de funcionário
            usuariosMap.get(f.getId_funcionario()).setFuncionario(f);
        }

        // Adiciona tutores ao mapa
        for (Tutor t : tutores) {
            // Verifica se o ID já existe no mapa
            if (!usuariosMap.containsKey(t.getId_tutor())) {
                // Se não existe, cria um novo usuário
                usuariosMap.put(t.getId_tutor(), new Usuario(t));
            }
            // Se já existe, atualiza as informações de tutor
            usuariosMap.get(t.getId_tutor()).setTutor(t);
        }

        // Adiciona adotantes ao mapa
        for (Adotante a : adotantes) {
            // Verifica se o ID já existe no mapa
            if (!usuariosMap.containsKey(a.getId_adotante())) {
                // Se não existe, cria um novo usuário
                usuariosMap.put(a.getId_adotante(), new Usuario(a));
            }
            // Se já existe, atualiza as informações de adotante
            usuariosMap.get(a.getId_adotante()).setAdotante(a);
        }

        // Exibe a lista de pessoas combinando todas as informações
        for (Usuario usuario : usuariosMap.values()) {
            System.out.println("\n\tInformações do Usuário:");
            usuario.exibirInfoUsuario();
        }
    }
}
