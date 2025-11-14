package br.com.airline.ticketing.system.model;

public class Passageiro {
    private String documentos, numeroCartao;

    public Passageiro(String documentos, String numeroCartao) {
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
