package Models;

import java.io.Serializable;

public class Item implements Serializable{
    private String nome;
    private String cpf;
    private String vendedor;
    private String descricao;
    private int idLeilao;
    private int id;
    private float valormin;
    private float lance;
    private float arremate;
    private String senha;

    public Item() {
    }

    public Item(String nome, String cpf, String vendedor, String descricao, int idLeilao, int id, float valormin, float arremate, String senha,float lance) {
        this.nome = nome;
        this.cpf = cpf;
        this.vendedor = vendedor;
        this.descricao = descricao;
        this.idLeilao = idLeilao;
        this.id = id;
        this.valormin = valormin;
        this.arremate = arremate;
        this.senha = senha;
        this.lance = valormin;
    }
    
    public int getIdLeilao() {
        return idLeilao;
    }

    public void setIdLeilao(int idLeilao) {
        this.idLeilao = idLeilao;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValormin() {
        return valormin;
    }

    public void setValormin(float valormin) {
        this.valormin = valormin;
    }

    public float getArremate() {
        return arremate;
    }

    public void setArremate(float arremate) {
        this.arremate = arremate;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getLance() {
        return lance;
    }

    public void setLance(float lance) {
        this.lance = lance;
    }
    
}
