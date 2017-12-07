package br.com.anhembi.tesis.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerfilEmpDTO {

    public String id;

    @JsonProperty("instituicao")
    public String instituicao;

    @JsonProperty("cnpj")
    public String cnpj;

    @JsonProperty("telefone")
    public String telefone;

    @JsonProperty("endereco")
    public String endereco;

    @JsonProperty("cep")
    public String cep;

    @JsonProperty("tipoEmp")
    public String tipoEmp;

    @JsonProperty("complemento")
    public String complemento;

    @JsonProperty("numero")
    public String numero;

    @JsonProperty("cuidade")
    public String cuidade;

    @JsonProperty("barrio")
    public String barrio;

    @JsonProperty("email")
    public String email;

    @JsonProperty("descricao")
    public String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCuidade() {
        return cuidade;
    }

    public void setCuidade(String cuidade) {
        this.cuidade = cuidade;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
