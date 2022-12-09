package br.com.github.douglasboaventura.musica;

import org.hibernate.validator.constraints.ISBN;

import javax.persistence.*;

import static org.hibernate.validator.constraints.ISBN.Type.ISBN_13;

@Entity
public class Musica {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String artista;

    public Musica(String genero, String titulo, String artista) {
        this.genero = genero;
        this.titulo = titulo;
        this.artista = artista;
    }

    /**
     * @deprecated Exclusive use of Hibernate
     */
    @Deprecated
    public Musica() {
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
