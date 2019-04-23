package br.ufjf.luidgisarto.trb1.models;

/**
 * RelatorioSede
 */

public class RelatorioSede {
    private Long sedeId;
    private String nomeSede;
    private Integer qtdAtividades;
    private Integer totalAssistencial;
    private Integer totalJuridica;
    private Integer totalFinanceira;
    private Integer totalExecutiva;

    /**
     * @return the sedeId
     */
    public Long getSedeId() {
        return sedeId;
    }

    /**
     * @return the qtdAtividades
     */
    public Integer getQtdAtividades() {
        return qtdAtividades;
    }

    /**
     * @param qtdAtividades the qtdAtividades to set
     */
    public void setQtdAtividades(Integer qtdAtividades) {
        this.qtdAtividades = qtdAtividades;
    }

    /**
     * @return the totalExecutiva
     */
    public Integer getTotalExecutiva() {
        return totalExecutiva;
    }

    /**
     * @param totalExecutiva the totalExecutiva to set
     */
    public void setTotalExecutiva(Integer totalExecutiva) {
        this.totalExecutiva = totalExecutiva;
    }

    /**
     * @return the totalFinanceira
     */
    public Integer getTotalFinanceira() {
        return totalFinanceira;
    }

    /**
     * @param totalFinanceira the totalFinanceira to set
     */
    public void setTotalFinanceira(Integer totalFinanceira) {
        this.totalFinanceira = totalFinanceira;
    }

    /**
     * @return the totalJuridica
     */
    public Integer getTotalJuridica() {
        return totalJuridica;
    }

    /**
     * @param totalJuridica the totalJuridica to set
     */
    public void setTotalJuridica(Integer totalJuridica) {
        this.totalJuridica = totalJuridica;
    }

    /**
     * @return the totalAssistencial
     */
    public Integer getTotalAssistencial() {
        return totalAssistencial;
    }

    /**
     * @param totalAssistencial the totalAssistencial to set
     */
    public void setTotalAssistencial(Integer totalAssistencial) {
        this.totalAssistencial = totalAssistencial;
    }

    /**
     * @return the nomeSede
     */
    public String getNomeSede() {
        return nomeSede;
    }

    /**
     * @param nomeSede the nomeSede to set
     */
    public void setNomeSede(String nomeSede) {
        this.nomeSede = nomeSede;
    }

    /**
     * @param sedeId the sedeId to set
     */
    public void setSedeId(Long sedeId) {
        this.sedeId = sedeId;
    }

}