public class Teste {
    public static void main(String[] args) {

        Animal cachorro = new Animal("Bolt", "3 anos", "001");


        Adotante adotante = new Adotante("Ana", "29", "123.456.789-10", "Rua F, 111", "99999-7777", "A001");


        Voluntario voluntario = new Voluntario("Carlos", "32", "987.654.321-00", "Rua G, 222", "88888-6666", "Tarde", "Segunda a Sexta");


        System.out.println(voluntario.adotarAnimal(cachorro));


        System.out.println(voluntario.listarAnimaisAdotados());


        adotante.adicionarAnimal(cachorro);
        System.out.println(adotante.listarAnimaisAdotados());


        System.out.println("Detalhes do Cachorro:");
        cachorro.getDetalhes();


        System.out.println(voluntario.adotarAnimal(cachorro));
    }
}
