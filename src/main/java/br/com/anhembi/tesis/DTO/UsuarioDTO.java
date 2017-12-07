package br.com.anhembi.tesis.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioDTO {

    private String id;

    @JsonProperty("usuario")
    private String usuario;

    @JsonProperty("contrasenha")
    private String contrasenha;

    @JsonProperty("empresa")
    private String empresa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
