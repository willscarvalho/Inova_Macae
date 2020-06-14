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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Arnald Queiroga
 */
@Entity
public class SerieHistorica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ano;
    private float coleta;
    private String status;
    private String observacao;
    private float meta;
    private String dtCadastro;
    private Integer idUsuarioCadastro;
    private String excluido;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald
    @ManyToOne // MUITAS SeriesHistóricas para UM Indicador    
    @JoinColumn(name = "idIndicador", referencedColumnName = "id")
    private Indicador indicador;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getColeta() {
        return coleta;
    }

    public void setColeta(float coleta) {
        this.coleta = coleta;
    }

    // Feito por Arnald /////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
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
        if (!(object instanceof SerieHistorica)) {
            return false;
        }
        SerieHistorica other = (SerieHistorica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.serieHistorica[ id=" + id + " ]";
    }

}
