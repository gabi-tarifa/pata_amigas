package modelo;

import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

public class Tutor extends Pessoa {
    private static int id_static = 1;
    private int id_tutor;
    private int animais_custodia;
    private String historico_adocao;
    private String staus;

    public Tutor(int animais_custodia, String historico_adocao, String staus, String nome, LocalDate nascimento, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
        super(nome, nascimento,sexo,cpf,endereco,telefone,email, senha);
        this.id_tutor = id_static++;
        this.animais_custodia = animais_custodia;
        this.historico_adocao = historico_adocao;
        this.staus = staus;
    }

    public int getId_tutor() {
        return id_tutor;
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

    public void setHistorico_adocao(String historico_adocao) {
        this.historico_adocao = historico_adocao;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }

    @Override
    public String toString() {
        return super.toString()+"dados especificos tutor{"+
                "id_tutor=" + id_tutor +
                ", animais_custodia=" + animais_custodia +
                ", historico_adocao=" + historico_adocao +
                ", staus='" + staus + '\'' +
                '}';
    }

    public void setId_tutor(int id) {
        this.id_tutor = id;
    }
}


