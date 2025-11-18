package br.com.airline.ticketing.system.model;

import java.util.ArrayList;
import java.util.List;

public class Papel {
    private Long id;
    private String nome, descricao;
    private List<CiaAerea> ciaAereaList;
    private Funcionario funcionario;

    public Papel(){
    }

    public Papel(Long id, String nome, String descricao, Funcionario funcionario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.funcionario = funcionario;
    }

    public Papel(Long id, String nome, String descricao, Funcionario funcionario, CiaAerea ciaAereaList){
        this(id, nome, descricao, funcionario);
        this.ciaAereaList = new ArrayList<>();

        if(ciaAereaList == null){
            throw new IllegalArgumentException("Deve ter pelo menos 1 CiaAerea");
        }else{
            this.ciaAereaList.add(ciaAereaList);
        }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<CiaAerea> getCiaAereaList() {
        return ciaAereaList;
    }

    public void setCiaAereaList(List<CiaAerea> ciaAereaList) {
        this.ciaAereaList = ciaAereaList;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Papel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
