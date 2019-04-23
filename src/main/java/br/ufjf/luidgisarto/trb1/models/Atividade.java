package br.ufjf.luidgisarto.trb1.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Atividade
 */
@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private Integer totalHorasAssistencial;
    private Integer totalHorasJuridica;
    private Integer totalHorasFinanceira;
    private Integer totalHorasExecutiva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sedeId", nullable = false)
    private Sede sede;

    public Atividade() {

    }

    public Atividade(String titulo, String descricao, Date dataInicio, Date dataFim, Integer assistencial,
            Integer juridica, Integer financeira, Integer executiva, Sede sede) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.totalHorasAssistencial = assistencial;
        this.totalHorasJuridica = juridica;
        this.totalHorasFinanceira = financeira;
        this.totalHorasExecutiva = executiva;
        this.sede = sede;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the totalHorasAssistencial
     */
    public Integer getTotalHorasAssistencial() {
        return totalHorasAssistencial;
    }

    /**
     * @param totalHorasAssistencial the totalHorasAssistencial to set
     */
    public void setTotalHorasAssistencial(Integer totalHorasAssistencial) {
        this.totalHorasAssistencial = totalHorasAssistencial;
    }

    /**
     * @return the totalHorasJuridica
     */
    public Integer getTotalHorasJuridica() {
        return totalHorasJuridica;
    }

    /**
     * @param totalHorasJuridica the totalHorasJuridica to set
     */
    public void setTotalHorasJuridica(Integer totalHorasJuridica) {
        this.totalHorasJuridica = totalHorasJuridica;
    }

    /**
     * @return the totalHorasFinanceira
     */
    public Integer getTotalHorasFinanceira() {
        return totalHorasFinanceira;
    }

    /**
     * @param totalHorasFinanceira the totalHorasFinanceira to set
     */
    public void setTotalHorasFinanceira(Integer totalHorasFinanceira) {
        this.totalHorasFinanceira = totalHorasFinanceira;
    }

    /**
     * @return the totalHorasExecutiva
     */
    public Integer getTotalHorasExecutiva() {
        return totalHorasExecutiva;
    }

    /**
     * @param totalHorasExecutiva the totalHorasExecutiva to set
     */
    public void setTotalHorasExecutiva(Integer totalHorasExecutiva) {
        this.totalHorasExecutiva = totalHorasExecutiva;
    }
}