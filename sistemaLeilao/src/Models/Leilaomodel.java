package Models;

public class Leilaomodel {
    private int id;
    private String nome;
    private float lance;
    private String descricao;
    private float duracao;
    private String hora;
    private int status;
    private String data;

    public Leilaomodel() {
    }

    public Leilaomodel(int id, String nome, float lance, String descricao, float duracao, String hora, int status, String data) {
        this.id = id;
        this.nome = nome;
        this.lance = lance;
        this.descricao = descricao;
        this.duracao = duracao;
        this.hora = hora;
        this.status = status;
        this.data = data;
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

    public float getLance() {
        return lance;
    }

    public void setLance(float lance) {
        this.lance = lance;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}