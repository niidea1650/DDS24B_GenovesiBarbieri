package Ej1;

import java.time.LocalDate;

public class Cancion {
    private String titulo;
    private Popularidad popularidad;
    private Album albumParticipa;
    private int likes;
    private int dislike;
    private int reproducciones;
    private LocalDate ultReproduccion;

    public Cancion(String titulo, Popularidad popularidad, Album albumParticipa, int likes, int dislike, int reproducciones, LocalDate ultReproduccion) {
        this.titulo = titulo;
        this.popularidad = popularidad;
        this.albumParticipa = albumParticipa;
        this.likes = likes;
        this.dislike = dislike;
        this.reproducciones = reproducciones;
        this.ultReproduccion = ultReproduccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public Album getAlbumParticipa() {
        return albumParticipa;
    }

    public void setAlbumParticipa(Album albumParticipa) {
        this.albumParticipa = albumParticipa;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public LocalDate getUltReproduccion() {
        return ultReproduccion;
    }

    public void setUltReproduccion(LocalDate ultReproduccion) {
        this.ultReproduccion = ultReproduccion;
    }
}
