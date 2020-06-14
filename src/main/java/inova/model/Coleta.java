package inova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author willian
 *
 *
 */
@Entity
@Table(name = "coleta")
public class Coleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataCadastro;
    private Long idUsuarioCadastro;
    private String ano;
    private String mesReferencia;
    private Number coleta;
    private String variaveis;
    private String status;
    private Long idAcessoColeta;
    

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald
    @ManyToOne // MUITAS Coletas para UM Indicador
    @JoinColumn(name = "idIndicador", referencedColumnName = "id")
    private Indicador indicador;
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Long getIdUsuarioCadastro() {
        return this.idUsuarioCadastro;
    }

    public void setIdUsuarioCadastro(Long idUsuarioCadastro) {
        this.idUsuarioCadastro = idUsuarioCadastro;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMesReferencia() {
        return this.mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public Number getColeta() {
        return this.coleta;
    }

    public void setColeta(Number coleta) {
        this.coleta = coleta;
    }

    public String getVariaveis() {
        return this.variaveis;
    }

    public void setVariaveis(String variaveis) {
        this.variaveis = variaveis;
    }

    // Inserido por Arnald ///////////////////////////////////////////////////////////
    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }

    /////////////////////////////////////////////////////////////////////////////////
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdAcessoColeta() {
        return this.idAcessoColeta;
    }

    public void setIdAcessoColeta(Long idAcessoColeta) {
        this.idAcessoColeta = idAcessoColeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Coleta)) {
            return false;
        }
        Coleta other = (Coleta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.Coleta[ id=" + id + " ]";
    }

}
