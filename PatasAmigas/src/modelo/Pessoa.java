package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private String sexo;
    private long cpf;
    private String endereco;
    private long telefone;
    private String email;
    private String senha;
    protected static int id_static = 1;

    public Pessoa(String nome, LocalDate nascimento2, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
        this.nome = nome;
        this.nascimento = nascimento2;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "\nPessoa" +
                "\nnome:" + nome +
                "\nsenha:" + senha +
                "\nemail:" + email +
                "\ntelefone:" + telefone +
                "\nendereco:" + endereco +
                "\ncpf:" + cpf +
                "\nsexo:" + sexo +
                "\nnascimento=" + nascimento ;
    }
}
