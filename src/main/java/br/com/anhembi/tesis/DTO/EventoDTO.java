package br.com.anhembi.tesis.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventoDTO {

    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("preco")
    private String preco;

    @JsonProperty("data")
    private String data;

    @JsonProperty("hora")
    private String hora;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("descricao")
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
