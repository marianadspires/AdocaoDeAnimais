public class Animal {
    private String nomeCachorro;
    private String idadeCachorro;
    private String idCachorro;
    private boolean disponivelParaAdocao;

    public Animal(String nome, String idade, String id) {
        this.nomeCachorro = nome;
        this.idadeCachorro = idade;
        this.idCachorro = id;
        this.disponivelParaAdocao = true;
    }

    public String getNome() {
        return nomeCachorro;
    }

    public void setNome(String nome) {
        this.nomeCachorro = nome;
    }

    public String getIdadeCachorro() {
        return idadeCachorro;
    }

    public void setIdadeCachorro(String idade) {
        this.idadeCachorro = idade;
    }

    public String getIdCachorro() {
        return idCachorro;
    }

    public void setIdCachorro(String id) {
        this.idCachorro = id;
    }

    public boolean isDisponivelParaAdocao() {
        return disponivelParaAdocao;
    }

    public void marcarComoAdotado() {
        this.disponivelParaAdocao = false;
    }


    public void setDisponivelParaAdocao(boolean b) {
    }

    public String getDetalhes() {
        return "Animal [Nome: " + nomeCachorro + ", Idade: " + idadeCachorro + ", ID: " + idCachorro +
                ", Disponível: " + (disponivelParaAdocao ? "Sim" : "Não") + "]";
    }

}
