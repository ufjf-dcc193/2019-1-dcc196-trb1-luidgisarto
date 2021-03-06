package br.ufjf.luidgisarto.trb1.models;

import java.text.ParseException;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Membro
 */
@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nomeCompleto;
    private String funcao;
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dataEntradaFuncao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dataSaidaFuncao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sede_id", nullable = false)
    private Sede sede;

    public Membro() {

    }

    public Membro(String nome, String funcao, String email, Date dataEntrada, Date dataSaida, Sede sede) {
        this.nomeCompleto = nome;
        this.funcao = funcao;
        this.email = email;
        this.dataEntradaFuncao = dataEntrada;
        this.dataSaidaFuncao = dataSaida;
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
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dataEntradaFuncao
     */
    public Date getDataEntradaFuncao() throws ParseException {
        return this.dataEntradaFuncao;
    }

    /**
     * @param dataEntradaFuncao the dataEntradaFuncao to set
     */
    public void setDataEntradaFuncao(Date dataEntradaFuncao) {
        this.dataEntradaFuncao = dataEntradaFuncao;
    }

    /**
     * @return the dataSaidaFuncao
     */
    public Date getDataSaidaFuncao() throws ParseException {
        return this.dataSaidaFuncao;
    }

    /**
     * @param dataSaidaFuncao the dataSaidaFuncao to set
     */
    public void setDataSaidaFuncao(Date dataSaidaFuncao) {
        this.dataSaidaFuncao = dataSaidaFuncao;
    }

    /**
     * @return the sede
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
}