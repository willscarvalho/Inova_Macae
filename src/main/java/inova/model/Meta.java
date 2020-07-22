package inova.model;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name = "meta")
public class Meta implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricaoDaMeta;
    private Long ano;
    private Float valor;
    private String direcao;
    private Long idIndicador;
    private Long idUsuarioCadastro;
    private Calendar dtInicio;
    private Calendar dtFim;
    private String rotulo;
    private Character excluido;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoDaMeta() {
        return this.descricaoDaMeta;
    }

    public void setDescricaoDaMeta(String descricaoDaMeta) {
        this.descricaoDaMeta = descricaoDaMeta;
    }

    public Long getAno() {
        return this.ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public Float getValor() {
        return this.valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDirecao() {
        return this.direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public Long getIdIndicador() {
        return this.idIndicador;
    }

    public void setIdIndicador(Long idIndicador) {
        this.idIndicador = idIndicador;
    }

    public Long getIdUsuarioCadastro() {
        return this.idUsuarioCadastro;
    }

    public void setIdUsuarioCadastro(Long idUsuarioCadastro) {
        this.idUsuarioCadastro = idUsuarioCadastro;
    }

    public Calendar getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Calendar dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Calendar getDtFim() {
        return dtFim;
    }

    public void setDtFim(Calendar dtFim) {
        this.dtFim = dtFim;
    }



    public String getRotulo() {
        return this.rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public Character getExcluido() {
        return this.excluido;
    }

    public void setExcluido(Character excluido) {
        this.excluido = excluido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Meta)) {
            return false;
        }
        Meta other = (Meta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inova.model.Meta[ id=" + id + " ]";
    }

}