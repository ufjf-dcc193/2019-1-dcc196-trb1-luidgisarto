package br.ufjf.luidgisarto.trb1.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Atividade
 */
@Entity
public class Atividade {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    private Long totalHorasAssistencial;
    private Long totalHorasJuridica;
    private Long totalHorasFinanceira;
    private Long totalHorasExecutiva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sede_id", nullable = false)
    private Sede sede;

    public Atividade() {

    }

    public Atividade(String titulo, String descricao, Date dataInicio, Date dataFim, Long assistencial,
            Long juridica, Long financeira, Long executiva, Sede sede) {
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
    public Long getTotalHorasAssistencial() {
        return totalHorasAssistencial;
    }

    /**
     * @param totalHorasAssistencial the totalHorasAssistencial to set
     */
    public void setTotalHorasAssistencial(Long totalHorasAssistencial) {
        this.totalHorasAssistencial = totalHorasAssistencial;
    }

    /**
     * @return the totalHorasJuridica
     */
    public Long getTotalHorasJuridica() {
        return totalHorasJuridica;
    }

    /**
     * @param totalHorasJuridica the totalHorasJuridica to set
     */
    public void setTotalHorasJuridica(Long totalHorasJuridica) {
        this.totalHorasJuridica = totalHorasJuridica;
    }

    /**
     * @return the totalHorasFinanceira
     */
    public Long getTotalHorasFinanceira() {
        return totalHorasFinanceira;
    }

    /**
     * @param totalHorasFinanceira the totalHorasFinanceira to set
     */
    public void setTotalHorasFinanceira(Long totalHorasFinanceira) {
        this.totalHorasFinanceira = totalHorasFinanceira;
    }

    /**
     * @return the totalHorasExecutiva
     */
    public Long getTotalHorasExecutiva() {
        return totalHorasExecutiva;
    }

    /**
     * @param totalHorasExecutiva the totalHorasExecutiva to set
     */
    public void setTotalHorasExecutiva(Long totalHorasExecutiva) {
        this.totalHorasExecutiva = totalHorasExecutiva;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}