package inova.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author willian
 *
 *
 */
@Entity
@Table(name = "plano")
public class Plano implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String ppa;
    private String legislacao;
    private String planoDiretor;
    private String diretrizGeral;
    private String objetivoGeral;
    private String acoes;
    private String metas;
    private String observacao;
    private String dtCadastro;
    private Long idUsuarioCadastro;

    ////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald
    @OneToMany
    private List<PlanoIndicador> planoindicadores; // Porque cada Plano, tem uma lista de Plano Indicadores
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPpa() {
        return this.ppa;
    }

    public void setPpa(String ppa) {
        this.ppa = ppa;
    }

    public String getLegislacao() {
        return this.legislacao;
    }

    public void setLegislacao(String legislacao) {
        this.legislacao = legislacao;
    }

    public String getPlanoDiretor() {
        return this.planoDiretor;
    }

    public void setPlanoDiretor(String planoDiretor) {
        this.planoDiretor = planoDiretor;
    }

    public String getDiretrizGeral() {
        return this.diretrizGeral;
    }

    public void setDiretrizGeral(String diretrizGeral) {
        this.diretrizGeral = diretrizGeral;
    }

    public String getObjetivoGeral() {
        return this.objetivoGeral;
    }

    public void setObjetivoGeral(String objetivoGeral) {
        this.objetivoGeral = objetivoGeral;
    }

    public String getAcoes() {
        return this.acoes;
    }

    public void setAcoes(String acoes) {
        this.acoes = acoes;
    }

    public String getMetas() {
        return this.metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDtCadastro() {
        return this.dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Long getIdUsuarioCadastro() {
        return this.idUsuarioCadastro;
    }

    public void setIdUsuarioCadastro(Long idUsuarioCadastro) {
        this.idUsuarioCadastro = idUsuarioCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Plano)) {
            return false;
        }
        Plano other = (Plano) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.Plano[ id=" + id + " ]";
    }

}
