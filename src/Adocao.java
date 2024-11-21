public class Adocao {
    private String data;     // Data da adoção
    private String hora;     // Hora da adoção
    private Adotante adotante; // Adotante que realizou a adoção
    private Animal animal;   // Animal adotado
    private boolean emAndamento; // Status da adoção

    public Adocao(String data, String hora, Adotante adotante, Animal animal) {
        this.data = data;
        this.hora = hora;
        this.adotante = adotante;
        this.animal = animal;
        this.emAndamento = false;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    public Animal getAnimal() {
        return null;
    }

    public void iniciarAdocao() {
        if (emAndamento) {
            System.out.println("A adoção já está em andamento.");
        } else {
            emAndamento = true;
            System.out.println("A adoção foi iniciada para o animal '" + animal.getNome() + "'.");
        }
    }


    public void finalizarAdocao() {
        if (!emAndamento) {
            System.out.println("A adoção ainda não foi iniciada.");
        } else {
            emAndamento = false;
            animal.marcarComoAdotado(); // Marca o animal como adotado
            System.out.println("A adoção foi finalizada. O animal '" + animal.getNome() +
                    "' agora pertence ao adotante '" + adotante.getNome() + "'.");
        }
    }


    public void cancelarAdocao() {
        if (!emAndamento) {
            System.out.println("A adoção não está em andamento e não pode ser cancelada.");
        } else {
            emAndamento = false;
            animal.setDisponivelParaAdocao(true); // Reabilita o animal para adoção
            System.out.println("A adoção do animal '" + animal.getNome() + "' foi cancelada.");
        }
    }


    public String getDetalhes() {
        return "Adoção [Data: " + data + ", Hora: " + hora + ", Adotante: " + adotante.getNome() +
                ", Animal: " + animal.getNome() + ", Em andamento: " + (emAndamento ? "Sim" : "Não") + "]";
    }


    public void mostrarInformacoes() {
        System.out.println(getDetalhes());
    }


}

