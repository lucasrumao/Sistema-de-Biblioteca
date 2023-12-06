package Entidades;

public class Funcionario extends Pessoa{

    private String cargo;
    private double salario;

    public Funcionario(int id, String nome, String email, String endereco, String telefone, String cargo, double salario){
        super(id, nome, email, endereco, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

