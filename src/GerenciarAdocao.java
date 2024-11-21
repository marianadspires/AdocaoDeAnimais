import java.util.ArrayList;
import java.util.List;

public class GerenciarAdocao {
    public static void main(String[] args) {

        Animal cachorro = new Animal("Cachorro", "3 anos", "001");
        Animal gato = new Animal("Gato", "2 anos", "002");


        Adotante adotante = new Adotante("Ana", "29", "123.456.789-10", "Rua F, 111", "99999-7777", "A001");


        Voluntario voluntario = new Voluntario("Carlos", "32", "987.654.321-00", "Rua G, 222", "88888-6666", "Tarde", "Segunda a Sexta");


        Adocao adocao1 = new Adocao("19/11/2024", "10:00", adotante, cachorro);
        Adocao adocao2 = new Adocao("20/11/2024", "14:00", adotante, gato);

        // Criando listas exemplo
        List<Adocao> adocoes = new ArrayList<>();
        adocoes.add(adocao1);
        adocoes.add(adocao2);

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        // Gerando relatórios
        GerenciarAdocao.gerarRelatorioAdoções(adocoes);
        GerenciarAdocao.gerarRelatorioAnimais(animais);
    }

    private static void gerarRelatorioAdoções(List<Adocao> adocoes) {
    }
    private static void gerarRelatorioAnimais(List<Animal> adocoes) {
    }
}
