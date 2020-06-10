/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Arnald Queiroga
 */
@Entity
public class Indicador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricaoDaMeta;
    private String indicador;
    private String descricao;
    private String metodologia;
    private String dtReferencia;
    private String dtPrazo;
    private String tecnicoResponsavel;
    private Integer idTema;
    private String unidade;
    private String fonte;
    private String ativo;
    private String publico;
    private Integer idPeriodicidade;
    private Integer idOrgao;
    private String dtCadastro;
    private String tipo;
    private Integer idUsuarioCadastro;
    private String excluido;
    private String cumulativo;
    private float valorAlvo;
    private String previsaoDoAlvo;

    public String getDescricaoDaMeta() {
        return descricaoDaMeta;
    }

    public void setDescricaoDaMeta(String descricaoDaMeta) {
        this.descricaoDaMeta = descricaoDaMeta;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getDtReferencia() {
        return dtReferencia;
    }

    public void setDtReferencia(String dtReferencia) {
        this.dtReferencia = dtReferencia;
    }

    public String getDtPrazo() {
        return dtPrazo;
    }

    public void setDtPrazo(String dtPrazo) {
        this.dtPrazo = dtPrazo;
    }

    public String getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(String tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public Integer getIdTema() {
        return idTema;
    }

    public void setIdTema(Integer idTema) {
        this.idTema = idTema;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public Integer getIdPeriodicidade() {
        return idPeriodicidade;
    }

    public void setIdPeriodicidade(Integer idPeriodicidade) {
        this.idPeriodicidade = idPeriodicidade;
    }

    public Integer getIdOrgao() {
        return idOrgao;
    }

    public void setIdOrgao(Integer idOrgao) {
        this.idOrgao = idOrgao;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdUsuarioCadastro() {
        return idUsuarioCadastro;
    }

    public void setIdUsuarioCadastro(Integer idUsuarioCadastro) {
        this.idUsuarioCadastro = idUsuarioCadastro;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public String getCumulativo() {
        return cumulativo;
    }

    public void setCumulativo(String cumulativo) {
        this.cumulativo = cumulativo;
    }

    public float getValorAlvo() {
        return valorAlvo;
    }

    public void setValorAlvo(float valorAlvo) {
        this.valorAlvo = valorAlvo;
    }

    public String getPrevisaoDoAlvo() {
        return previsaoDoAlvo;
    }

    public void setPrevisaoDoAlvo(String previsaoDoAlvo) {
        this.previsaoDoAlvo = previsaoDoAlvo;
    }
    
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Indicador)) {
            return false;
        }
        Indicador other = (Indicador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.Indicador[ id=" + id + " ]";
    }
    
}
