import java.util.ArrayList;

public class Adotante extends Pessoa {
    private String id;
    private ArrayList<Animal> animaisAdotados;


    public Adotante(String nome, String idade, String cpf, String endereco, String telefone, String id) {
        super(nome, idade, cpf, endereco, telefone);
        this.id = id;
        this.animaisAdotados = new ArrayList<>();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Método para adicionar um animal à lista de adotados EXEMPLO
    public void adicionarAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Animal inválido. Não foi possível adicionar.");
            return;
        }
        animaisAdotados.add(animal);
        System.out.println("Animal '" + animal.getNome() + "' adicionado com sucesso!");
    }

    // Método para listar os animais adotados EXEMPLO
    public String listarAnimaisAdotados() {
        if (animaisAdotados.isEmpty()) {
            return "Nenhum animal adotado.";
        }
        StringBuilder sb = new StringBuilder("Animais adotados por " + this.getNome() + ":\n");
        for (Animal animal : animaisAdotados) {
            sb.append(animal.getDetalhes()).append("\n");
        }
        return sb.toString();
    }
}

