package modelo;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    private static int id_static = 1;
    private int id_funcionario;
    private Date data_contrato;
    private String cargo;
    private float salario;
    private String departamento;

    public Funcionario(Date data_contrato, String cargo, float salario, String departamento, String nome, Date nascimento, String sexo, long cpf, String endereco, long telefone, String email, String senha) {
        super(nome, nascimento,sexo,cpf,endereco,telefone,email, senha);
        this.data_contrato = data_contrato;
        this.id_funcionario = id_static++;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public Date getData_contrato() {
        return data_contrato;
    }

    public void setData_contrato(Date data_contrato) {
        this.data_contrato = data_contrato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+"dados especificos funcionário{"+
                "id_funcionario=" + id_funcionario +
                ", data_contrato=" + data_contrato +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
