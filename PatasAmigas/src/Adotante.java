import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adotante extends Pessoa{
    private static int id_static = 1;
    private int id_adotante;
    private List preferencias = new ArrayList();
    private List historico_adocao = new ArrayList(); //depois vai virar o mesmo obj de tutor
    private String status;

    public Adotante(List preferencias, List historico_adocao, String status, String nome, Date nascimento, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
        super(nome, nascimento,sexo,cpf,endereco,telefone,email, senha);
        this.id_adotante = id_static++;
        this.preferencias = preferencias;
        this.historico_adocao = historico_adocao;
        this.status = status;
    }

    public int getId_adotante() {
        return id_adotante;
    }

    public List getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List preferencias) {
        this.preferencias = preferencias;
    }

    public List getHistorico_adocao() {
        return historico_adocao;
    }

    public void setHistorico_adocao(List historico_adocao) {
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
        return "Adotante{" +
                "id_adotante=" + id_adotante +
                ", preferencias=" + preferencias +
                ", historico_adocao=" + historico_adocao +
                ", status='" + status + '\'' +
                '}';
    }
}
