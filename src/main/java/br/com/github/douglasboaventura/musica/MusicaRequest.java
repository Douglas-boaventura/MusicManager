package br.com.github.douglasboaventura.musica;

import javax.validation.constraints.NotBlank;

public class MusicaRequest {
    @NotBlank
    private String genero;

    @NotBlank
    private String titulo;

    @NotBlank
    private String artista;


    public MusicaRequest(String genero, String titulo, String artista) {
        this.genero = genero;
        this.titulo = titulo;
        this.artista = artista;
    }

    public Musica toModel(){
        return new Musica(genero,titulo,artista);
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }
}
