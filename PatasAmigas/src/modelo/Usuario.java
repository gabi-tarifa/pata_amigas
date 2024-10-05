package modelo;

public class Usuario {
    private Pessoa pessoa;
    private Funcionario funcionario;
    private Tutor tutor;
    private Adotante adotante;

    public Usuario(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public void exibirInfoUsuario() {
        // Exibe as informações básicas da pessoa
        System.out.print(pessoa.toString());

        // Exibe as informações específicas, se existirem
        if (funcionario != null) {
            System.out.print(funcionario.toString());
        }

        if (tutor != null) {
            System.out.print(tutor.toString());
        }

        if (adotante != null) {
            System.out.print(adotante.toString());
        }
    }
}