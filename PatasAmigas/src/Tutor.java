import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tutor extends Pessoa {
    private static int id_static = 1;
    private int id_tutor;
    private int animais_custodia;
    private List historico_adocao = new ArrayList();
    private String staus;

    public Tutor(int animais_custodia, List historico_adocao, String staus, String nome, Date nascimento, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
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

    public List getHistorico_adocao() {
        return historico_adocao;
    }

    public void setHistorico_adocao(List historico_adocao) {
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
        return "Tutor{" +
                "id_tutor=" + id_tutor +
                ", animais_custodia=" + animais_custodia +
                ", historico_adocao=" + historico_adocao +
                ", staus='" + staus + '\'' +
                '}';
    }
}


