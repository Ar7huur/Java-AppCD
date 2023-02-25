package appcd;

import java.util.ArrayList;
import java.util.List;

public class Cd {

    private String nome_cd;
    private String titulo;
    private String artista;
    private int ano_lanc;
    private List<Musica> musica;

    public Cd(String nome_cd, String titulo, String artista, int ano_lanc) {
        setNome_cd(nome_cd);
        setTitulo(titulo);
        setArtista(artista);
        setAno_lanc(ano_lanc);
        musica = new ArrayList();
    }

    public String getNome_cd() {
        return nome_cd;
    }

    public void setNome_cd(String nome_cd) {
        this.nome_cd = nome_cd;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno_lanc() {
        return ano_lanc;
    }

    public void setAno_lanc(int ano_lanc) {
        if (ano_lanc > 1900) {
            this.ano_lanc = ano_lanc;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void addMusica(Musica m) {
        musica.add(m);
    }
}
