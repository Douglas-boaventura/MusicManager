package br.com.github.douglasboaventura.musica;

public class MusicaResponse {
    private Long id;
    private String genero;
    private String titulo;
    private String artista;


    public MusicaResponse(Musica musica) {
        this.id = musica.getId();
        this.genero = musica.getGenero();
        this.titulo = musica.getTitulo();
        this.artista = musica.getArtista();
    }

    public Long getId() {
        return id;
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
