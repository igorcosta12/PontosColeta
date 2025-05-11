package com.example.aep.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class PontoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;

    @ElementCollection
    private List<String> tipoResiduo;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public List<String> getTipoResiduo() { return tipoResiduo; }
    public void setTipoResiduo(List<String> tipoResiduo) { this.tipoResiduo = tipoResiduo; }
}
