package Models;

public class Leilaomodel {
    private int id;
    private int criadoPor;
    private String nome;
    private String descricao;
    private float duracao;
    private String hora;
    private int status;
    private String data;

    public Leilaomodel() {
    }

    public Leilaomodel(int id, int criadoPor, String nome, String descricao, float duracao, String hora, int status, String data) {
        this.id = id;
        this.criadoPor = criadoPor;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.hora = hora;
        this.status = status;
        this.data = data;
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