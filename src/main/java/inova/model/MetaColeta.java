/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.model;

/**
 *
 * @author acg
 */
public class MetaColeta {
    private Integer idIndicador;
    private Integer ano;
    private Double valorMeta;
    private Double valorColeta;

    public MetaColeta(Integer idIndicador, Integer ano, Double valorMeta, Double valorColeta) {
        this.idIndicador = idIndicador;
        this.ano = ano;
        this.valorMeta = valorMeta;
        this.valorColeta = valorColeta;
    }

    
    public Integer getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(Integer idIndicador) {
        this.idIndicador = idIndicador;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(Double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public Double getValorColeta() {
        return valorColeta;
    }

    public void setValorColeta(Double valorColeta) {
        this.valorColeta = valorColeta;
    }
    
    
    
}
