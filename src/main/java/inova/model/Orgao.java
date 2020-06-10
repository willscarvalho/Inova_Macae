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
public class Orgao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nmOrgao;
    private String dtCadastro;
    private String txTipo;
    private String cdAtivo;
    private Integer idOrgaoMaior;

    public int getNmOrgao() {
        return nmOrgao;
    }

    public void setNmOrgao(int nmOrgao) {
        this.nmOrgao = nmOrgao;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getTxTipo() {
        return txTipo;
    }

    public void setTxTipo(String txTipo) {
        this.txTipo = txTipo;
    }

    public String getCdAtivo() {
        return cdAtivo;
    }

    public void setCdAtivo(String cdAtivo) {
        this.cdAtivo = cdAtivo;
    }

    public int getIdOrgaoMaior() {
        return idOrgaoMaior;
    }

    public void setIdOrgaoMaior(int idOrgaoMaior) {
        this.idOrgaoMaior = idOrgaoMaior;
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
        if (!(object instanceof Orgao)) {
            return false;
        }
        Orgao other = (Orgao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.Orgao[ id=" + id + " ]";
    }

}
