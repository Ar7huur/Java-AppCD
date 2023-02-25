package appcd;

public class Musica {

    private String nome_musica;
    private int tempo_duracao;

    public Musica(String nome_musica, int tempo_duracao) {
        this.nome_musica = nome_musica;
        this.tempo_duracao = tempo_duracao;
    }
   
    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public int getTempo_duracao() {
        return tempo_duracao;
    }

    public void setTempo_duracao(int tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }
    
}
