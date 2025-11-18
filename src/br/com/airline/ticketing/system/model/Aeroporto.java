package br.com.airline.ticketing.system.model;

public class Aeroporto {
    private Long id;
    private String nome, codigo;
    private Rota[] rotas = new Rota[2];

    public Aeroporto(Long id, String nome, String codigo) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
    }

    public Aeroporto(Long id, String nome, String codigo, Rota[] rotas) {
        this(id, nome, codigo);
        this.rotas = rotas;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Rota[] getRotas() {
        return rotas;
    }

    public void setRotas(Rota[] rotas) {
        this.rotas = rotas;
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
