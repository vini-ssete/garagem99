/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.vinicius.garagem.DTO;

import jakarta.persistence.Column;
import br.eti.vinicius.garagem.entities.Veiculo;

/**
 *
 * @author digma
 */
public class VeiculoMinDTO {
    private long id;

    private String marca;
    private String modelo;
    private String cor;

    private int ano;
    private int km;
    
    @Column(name = "linkimagem")
    private String linkImagem;

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
    
    public VeiculoMinDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.km = veiculo.getKm();
        this.linkImagem = veiculo.getLinkImagem();
    }
}
