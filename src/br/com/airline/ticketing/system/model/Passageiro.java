package br.com.airline.ticketing.system.model;

import java.util.Date;

public class Passageiro extends Pessoa {
    private String documentos, numeroCartao;

    public Passageiro(Long id, String nome, String email, String telefone, String usuario, String senha, Date dataNascimento, String documentos, String numeroCartao) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento);
        this.documentos = documentos;
        this.numeroCartao = numeroCartao;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "documentos='" + documentos + '\'' +
                ", numeroCartao='" + numeroCartao + '\'' +
                '}';
    }
}
