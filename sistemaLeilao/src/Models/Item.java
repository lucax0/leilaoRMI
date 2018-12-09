/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Victor
 */
public class Item {
    private String nome;
    private String cpf;
    private String vendedor;
    private String descricao;
    private int id;
    private float valormin;
    private float arremate;
    private float lance;
    private String senha;

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

