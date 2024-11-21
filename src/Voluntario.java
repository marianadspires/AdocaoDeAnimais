import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Pessoa {
    private String turno;
    private String dias;
    private List<Adocao> animaisAdotados;


    public Voluntario(String nome, String idade, String cpf, String endereco, String telefone, String turno, String dias) {
        super(nome, idade, cpf, endereco, telefone);
        this.turno = turno;
        this.dias = dias;
        this.animaisAdotados = new ArrayList<>();
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }


    public String adotarAnimal(Animal animal) {
        if (animal == null) {
            return "Erro: Nenhum animal foi especificado.";
        }
        if (!animal.isDisponivelParaAdocao()) {
            return "Animal '" + animal.getNome() + "' não está disponível para adoção.";
        }
        Adocao novaAdocao = new Adocao("20/11/2024", "10:00", new Adotante("Desconhecido", "0", "000", "N/A", "N/A", "N/A"), animal);
        animaisAdotados.add(novaAdocao);
        animal.marcarComoAdotado(); // Método que altera a disponibilidade do animal
        return "Animal '" + animal.getNome() + "' adotado com sucesso!";
    }

    public String listarAnimaisAdotados() {
        if (animaisAdotados.isEmpty()) {
            return "Nenhum animal adotado por este voluntário.";
        }
        String resultado = "Animais adotados:\n";
        for (Adocao adocao : animaisAdotados) {
            resultado += "- " + adocao.getAnimal().getNome() + " (Data: " + adocao.getData() + ")\n";
        }
        return resultado;
    }


    // Criar adoções EXEMPLO
    public String criarAdocoes(String animal, String adotante, java.util.Date dataAdocao) {
        Adocao novaAdocao = new Adocao(animal, adotante, dataAdocao);
        animaisAdotados.add(novaAdocao);
        return "Adoção criada com sucesso: " + novaAdocao;
    }

    // Excluir adoções EXEMPLO
    public String excluirAdocoes(String animal) {
        for (Adocao adocao : animaisAdotados) {
            if (adocao.getAnimal().equalsIgnoreCase(animal)) {
                animaisAdotados.remove(adocao);
                return "Adoção do animal '" + animal + "' excluída com sucesso.";
            }
        }
        return "Adoção do animal '" + animal + "' não encontrada.";
    }
}
