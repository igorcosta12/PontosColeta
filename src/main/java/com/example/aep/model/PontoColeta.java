package com.example.aep.model;

import jakarta.persistence.*;
import java.util.List; // Importar List

@Entity
public class PontoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;

    // Alteração AQUI: De String para List<String>
    @ElementCollection // Anotação para persistir uma coleção de tipos básicos
    @CollectionTable(name = "ponto_coleta_tipos_residuo", joinColumns = @JoinColumn(name = "ponto_coleta_id"))
    @Column(name = "tipo_residuo")
    private List<String> tipoResiduo;

    private Double latitude;
    private Double longitude;

    // Getters e Setters (Certifique-se de que estão atualizados para List<String>)
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // O getter e setter agora trabalham com List<String>
    public List<String> getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(List<String> tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}