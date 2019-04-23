package br.ufjf.luidgisarto.trb1.models;

/**
 * RelatorioSede
 */

public class RelatorioSede {
    private Long sedeId;
    private String nomeSede;
    private Long qtdAtividades;
    private Long totalAssistencial;
    private Long totalJuridica;
    private Long totalFinanceira;
    private Long totalExecutiva;

    public RelatorioSede(Long sedeId, Long qtdAtividades) {
        this.sedeId = sedeId;
        this.qtdAtividades = qtdAtividades;
    }

      /**
     * @return the sedeId
     */
    public Long getSedeId() {
        return sedeId;
    }

    /**
     * @return the qtdAtividades
     */
    public Long getQtdAtividades() {
        return qtdAtividades;
    }

    /**
     * @param qtdAtividades the qtdAtividades to set
     */
    public void setQtdAtividades(Long qtdAtividades) {
        this.qtdAtividades = qtdAtividades;
    }

    /**
     * @return the totalExecutiva
     */
    public Long getTotalExecutiva() {
        return totalExecutiva;
    }

    /**
     * @param totalExecutiva the totalExecutiva to set
     */
    public void setTotalExecutiva(Long totalExecutiva) {
        this.totalExecutiva = totalExecutiva;
    }

    /**
     * @return the totalFinanceira
     */
    public Long getTotalFinanceira() {
        return totalFinanceira;
    }

    /**
     * @param totalFinanceira the totalFinanceira to set
     */
    public void setTotalFinanceira(Long totalFinanceira) {
        this.totalFinanceira = totalFinanceira;
    }

    /**
     * @return the totalJuridica
     */
    public Long getTotalJuridica() {
        return totalJuridica;
    }

    /**
     * @param totalJuridica the totalJuridica to set
     */
    public void setTotalJuridica(Long totalJuridica) {
        this.totalJuridica = totalJuridica;
    }

    /**
     * @return the totalAssistencial
     */
    public Long getTotalAssistencial() {
        return totalAssistencial;
    }

    /**
     * @param totalAssistencial the totalAssistencial to set
     */
    public void setTotalAssistencial(Long totalAssistencial) {
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