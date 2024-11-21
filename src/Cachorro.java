public class Cachorro extends Animal {
    private String porte;
    private String raca;
    private String sexo;


    public Cachorro(String nome, String idade, String id, String porte, String raca, String sexo) {
        super(nome, idade, id);
        this.porte = porte;
        this.raca = raca;
        this.sexo = sexo;
    }


    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String getDetalhes() {
        return "Cão [ID: " + getIdCachorro() + ", Nome: " + getNome() + ", Idade: " + getIdadeCachorro() +
                ", Porte: " + porte + ", Raça: " + raca + ", Sexo: " + sexo +
                ", Disponível para adoção: " + (isDisponivelParaAdocao() ? "Sim" : "Não") + "]";
    }



    @Override
    public String toString() {
        return getDetalhes();
    }
}
