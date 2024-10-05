package modelo;

import java.util.Date;

public class Tutor extends Pessoa {
    private int id_tutor;
    private int animais_custodia;
    private String historico_adocao;
    private String status;

    public Tutor(int animais_custodia, String historico_adocao, String status, String nome, Date nascimento, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
        super(nome, nascimento,sexo,cpf,endereco,telefone,email, senha);
        this.id_tutor = id_static++;
        this.animais_custodia = animais_custodia;
        this.historico_adocao = historico_adocao;
        this.status = status;
    }

    public int getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    public int getAnimais_custodia() {
        return animais_custodia;
    }

    public void setAnimais_custodia(int animais_custodia) {
        this.animais_custodia = animais_custodia;
    }

    public String getHistorico_adocao() {
        return historico_adocao;
    }

    public void setHistorico_adocao() {
        this.historico_adocao = historico_adocao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDados especificos do tutor"+
                "\nid_tutor:" + id_tutor +
                "\nanimais_custodia:" + animais_custodia +
                "\nhistorico_adocao:" + historico_adocao +
                "\nstatus:" + status;
    }
}


