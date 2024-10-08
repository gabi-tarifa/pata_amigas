package modelo;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Adotante extends Pessoa {
    private int id_adotante;
    private String preferencias;
    private List<String> historico_adocao = new ArrayList<>(); //depois vai virar o mesmo obj de tutor
    private String status;

    public Adotante(String preferencias, List<String> historico_adocao,String status, String nome, String nome2, LocalDate nascimento, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
        super(nome, nascimento,sexo,cpf,endereco,telefone,email, senha);
        this.id_adotante = id_static++;
        this.preferencias = preferencias;
        this.historico_adocao = historico_adocao;
        this.status = status;
    }

    public int getId_adotante() {
        return id_adotante;
    }

    public void setId_adotante(int id_adotante) {
        this.id_adotante = id_adotante;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias){
        this.preferencias = preferencias;
    }

    public List<String> getHistorico_adocao() {
        return historico_adocao;
    }

    public void setHistorico_adocao(List<String> historico_adocao) {
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
        return super.toString()+"\nDados especificos adotante"+
                "\nid_adotante:" + id_adotante +
                "\npreferencias:" + preferencias +
                "\nhistorico_adocao:" + historico_adocao +
                "\nstatus:" + status ;
    }

    public String apresentando() {
        return "\nDados especificos adotante"+
                "\nid_adotante:" + id_adotante +
                "\npreferencias:" + preferencias +
                "\nhistorico_adocao:" + historico_adocao +
                "\nstatus:" + status ;
    }
}
