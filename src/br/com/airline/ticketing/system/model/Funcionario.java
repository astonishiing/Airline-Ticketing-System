package br.com.airline.ticketing.system.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    private String codigo, contaCorrente;
    private List<Papel> papelList;

    public Funcionario(Long id, String nome, String email, String telefone, String usuario, String senha, Date dataNascimento, String codigo, String contaCorrente, List<Papel> papelList) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
        this.papelList = new ArrayList<>();
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

    public List<Papel> getPapelList() {
        return papelList;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo='" + codigo + '\'' +
                ", contaCorrente='" + contaCorrente + '\'' +
                '}';
    }
}
