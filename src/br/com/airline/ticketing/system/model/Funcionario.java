package br.com.airline.ticketing.system.model;

public class Funcionario {
    private String codigo, contaCorrente;

    public Funcionario(String codigo, String contaCorrente) {
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo='" + codigo + '\'' +
                ", contaCorrente='" + contaCorrente + '\'' +
                '}';
    }
}
