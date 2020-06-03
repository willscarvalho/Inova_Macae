package inova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*
* @author willian
*
**/

@Entity
@Table(name="tema")
public class Tema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Long idEixo;
    private String dtCadastro;
    private Long idUsuarioCadastro;

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

    public Long getIdEixo() {
        return this.idEixo;
    }

    public void setIdEixo(Long idEixo) {
        this.idEixo = idEixo;
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
        if (!(object instanceof Tema)) {
            return false;
        }
        Tema other = (Tema) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.Tema[ id=" + id + " ]";
    }
    
}
