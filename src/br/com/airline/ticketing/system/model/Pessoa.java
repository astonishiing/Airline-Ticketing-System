package br.com.airline.ticketing.system.model;

import java.util.Date;

public abstract class Pessoa {
    private Long Id;
    private String nome, email, telefone, usuario, senha;
    private Date dataNascimento;
}
