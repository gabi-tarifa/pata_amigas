package modelo;

import java.util.Date;

public class Animal {
    private static int idStatic = 1;
    private int id;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private String historicoMedico; //Será alterado mais pra frente para um objeto relacional (sla como krls faremos isso, mas faremos)
    private Date dataCadastro;
    private String statusAdocao; //Ainda a decidir de será como string ou int, mas decidiremos melhor mais pra frente

    public Animal(String nome, String especie, String raca, int idade, String sexo, String historicoMedico, Date dataCadastro, String statusAdocao){
        this.id = idStatic++;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.historicoMedico = historicoMedico;
        this.dataCadastro = dataCadastro;
        this.statusAdocao = statusAdocao;
    }

    public int getId() {
        return id;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(String statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    public String apresentar(){
        return "Nome do animal: " + getNome() + "\nEspécie: " + getEspecie() + "\nRaça: " + getRaca() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() + "\nHistórico Médico: " + getHistoricoMedico() + "\nData de Cadastro: " + getDataCadastro() + "\nStatus de Adoção: " + getStatusAdocao();
    }

}
