package br.com.airline.ticketing.system.model;

public class CiaAerea {
    private Long id;
    private String nome;
    private Rota rota;

    public CiaAerea(){

    }
    public CiaAerea(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CiaAerea(Long id, String nome, Rota rota){
        this(id, nome);
        this.rota = rota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "CiaAerea{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
