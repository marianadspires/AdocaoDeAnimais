public class Funcionario extends Pessoa {
    private String matricula;
    private String email;


    public Funcionario(String nome, String idade, String cpf, String endereco, String telefone, String matricula, String email) {
        super(nome, idade, cpf, endereco, telefone); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
        this.email = email;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para validar adoção
    public boolean validarAdocao(Adocao adocao) {
        // Verifica se a adoção e o animal não são nulos
        if (adocao != null && adocao.getAnimal() != null) {
            // Verifica se o animal está disponível para adoção
            return adocao.getAnimal().isDisponivelParaAdocao();
        }
        return false; // Caso contrário, retorna falso
    }


    // Método para visualizar adoções
    public String visualizarAdocoes() {
        // Exemplo de retorno fictício (substituir com lógica real)
        return "Lista de adoções visualizadas pelo funcionário.";
    }

    // Método para criar adoções
    public String criarAdocoes() {
        // Exemplo de criação fictícia
        return "Adoção criada com sucesso!";
    }

    // Método para excluir adoções
    public String excluirAdocoes() {
        // Exemplo de exclusão fictícia
        return "Adoção excluída com sucesso!";
    }
}

