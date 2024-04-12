package Ej1;

import java.util.HashSet;

public class Album {
    private String nombre;
    private Artista artistaIcluido;
    private int anio;

    public Album(String nombre, Artista artistaIcluido, int anio) {
        this.nombre = nombre;
        this.artistaIcluido = artistaIcluido;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Artista getArtistaIcluido() {
        return artistaIcluido;
    }

    public void setArtistaIcluido(Artista artistaIcluido) {
        this.artistaIcluido = artistaIcluido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
