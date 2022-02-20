package com.example.api.dto;

import com.example.api.model.Usuario;
import com.example.api.model.Veiculo;

public class VeiculoDto {

    private String marca;
    private String modelo;
    private String ano;
    private String descricao;
    private Long id;
    private Usuario usuario;

    public VeiculoDto(Veiculo veiculo) {
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
        this.descricao = veiculo.getDescricao();
        this.id = veiculo.getId();
        this.usuario = veiculo.getUsuario();
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public Veiculo toVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setAno(ano);
        veiculo.setDescricao(descricao);
        veiculo.setUsuario(usuario);

        return veiculo;
    }
}
