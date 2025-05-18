package com.berickdev.estoque.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduto;
    
    @NotBlank(message = "O nome do produto é obrigatório!")
    private String nomeProduto;
    private String descricaoProduto;
    private Integer quantidadeProduto;
    private Integer quantidadeMinimaProduto;
    private Double precoProduto;

    public Produto(){}

    public Produto(String nomeProduto, String descricaoProduto, Integer quantidadeProduto, Integer quantidadeMinimaProduto, Double precoProduto){
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.quantidadeMinimaProduto = quantidadeMinimaProduto;
        this.precoProduto = precoProduto;
    }

    public Integer getIdProduto(){
        return idProduto;
    }

    public void setIdProduto(Integer idProduto){
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Integer getQuantidadeMinimaProduto() {
        return quantidadeMinimaProduto;
    }

    public void setQuantidadeMinimaProduto(Integer quantidadeMinimaProduto) {
        this.quantidadeMinimaProduto = quantidadeMinimaProduto;
    }

    public Double getPrecoProduto(){
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto){
        this.precoProduto = precoProduto;
    }

}