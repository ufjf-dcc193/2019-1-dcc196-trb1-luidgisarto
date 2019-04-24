package br.ufjf.luidgisarto.trb1.models;

import javax.persistence.*;
import java.util.List;

/**
 * Sede
 */
@Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nomeFantasia;
    private String estadoFederacao;
    private String cidade;
    private String bairro;
    private String telefone;
    private String enderecoWeb;

    @OneToMany(mappedBy = "sede")
    private List<Atividade> atividades;

    @OneToMany(mappedBy = "sede")
    private List<Membro> membros;

    public Sede() {

    }

    public Sede(String nomeFantasia, String estado, String cidade, String bairro, String telefone, String enderecoWeb) {
        this.nomeFantasia = nomeFantasia;
        this.estadoFederacao = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.enderecoWeb = enderecoWeb;
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
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @return the enderecoWeb
     */
    public String getEnderecoWeb() {
        return enderecoWeb;
    }

    /**
     * @param enderecoWeb the enderecoWeb to set
     */
    public void setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estadoFederacao
     */
    public String getEstadoFederacao() {
        return estadoFederacao;
    }

    /**
     * @param estadoFederacao the estadoFederacao to set
     */
    public void setEstadoFederacao(String estadoFederacao) {
        this.estadoFederacao = estadoFederacao;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
}