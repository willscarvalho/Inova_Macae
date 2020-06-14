package inova.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author willian
 */
@Entity
@Table(name = "tema")
public class Tema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String dtCadastro;
    private Integer idUsuarioCadastro;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald
    @ManyToOne // MUITOS Temas para UM eixo
    @JoinColumn(name = "idEixo", referencedColumnName = "id")
    private Eixo eixo; // Para testar o Many to One e implementar o relacionamento entre as entidades Eixo e Tema

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
     ////////////////////////////////////////////////////////////////////////////////////////////////////    
    // Inserido por Arnald
    @OneToMany
    private List<Indicador> indicadores; // Porque cada Tema, tem uma lista de Indicadores 

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Gerado de privite Eixo eixo, após eu ter excluído o atributo declarado private idEixo para criar o @JoinColumn(name = "idEixo"), onde eu indico qual é a chave estrangeira da outra entidade
    // Pq ele recebe o código relacionado ao Eixo
    public Eixo getEixo() {
        return eixo;
    }

    public void setEixo(Eixo eixo) {
        this.eixo = eixo;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
