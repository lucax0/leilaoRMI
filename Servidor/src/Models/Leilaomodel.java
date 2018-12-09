package Models;

import java.io.Serializable;
import java.sql.Date;

public class Leilaomodel implements Serializable{
    private int id;
    private int criadoPor;
    private String nome;
    private String descricao;
    private float duracao;
    private Date dataInicio;
    private int status;
    private Date dataFim;

    public Leilaomodel() {
    }

    public Leilaomodel(int id, int criadoPor, String nome, String descricao, float duracao, Date dataInicio, int status, Date dataFim) {
        this.id = id;
        this.criadoPor = criadoPor;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.dataInicio = dataInicio;
        this.status = status;
        this.dataFim = dataFim;
    }

    public int getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(int criadoPor) {
        this.criadoPor = criadoPor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public Date getdataInicio() {
        return dataInicio;
    }

    public void setdataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getdataFim() {
        return dataFim;
    }

    public void setdataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
}
