import java.util.ArrayList;
import java.util.List;

public class Adotante {
    private static int id_static = 1;
    private int id_adotante;
    private List preferencias = new ArrayList();
    private List historico_adocao = new ArrayList(); //depois vai virar o mesmo obj de tutor
    private String status;

    public Adotante( List preferencias, List historico_adocao, String status) {
        this.id_adotante = id_static++;
        this.preferencias = preferencias;
        this.historico_adocao = historico_adocao;
        this.status = status;
    }
}
