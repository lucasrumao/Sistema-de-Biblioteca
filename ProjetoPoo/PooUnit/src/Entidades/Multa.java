package Entidades;

import java.util.Date;

public class Multa {
    private int id;
    private double valor;
    private String motivo;
    private Date dataAplicacao;
    private Date dataVencimento;

    public Multa(int id, double valor, String motivo, Date dataAplicacao, Date dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.motivo = motivo;
        this.dataAplicacao = dataAplicacao;
        this.dataVencimento = dataVencimento;
    }
    public Multa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String toString() {
        return "Entidades.Multa{" +
                "id=" + id +
                ", valor=" + valor +
                ", motivo='" + motivo + '\'' +
                ", dataAplicacao=" + dataAplicacao +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}
