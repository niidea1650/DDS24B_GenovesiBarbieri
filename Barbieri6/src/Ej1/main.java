package Ej1;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {
        // Creamos algunos objetos para usar en nuestras pruebas
        Artista artista = new Artista("Nombre", "Apellido");
        Album album = new Album("NombreAlbum", artista, 2024);
        Popularidad popularidad = new Normal();
        Cancion cancion = new Cancion("Titulo", popularidad, album, 0, 0, 0, LocalDate.now());

        // Ejecutamos las pruebas
        testArtista(artista);
        testAlbum(album);
        testCancion(cancion);
    }

    // Métodos de prueba para la clase Artista
    public static void testArtista(Artista artista) {
        // Prueba de los métodos getter y setter
        System.out.println("Nombre del artista: " + artista.getNombre());
        System.out.println("Apellido del artista: " + artista.getApellido());

        // Prueba de los métodos setter
        artista.setNombre("NuevoNombre");
        artista.setApellido("NuevoApellido");
        System.out.println("Nuevo nombre del artista: " + artista.getNombre());
        System.out.println("Nuevo apellido del artista: " + artista.getApellido());
    }

    // Métodos de prueba para la clase Album
    public static void testAlbum(Album album) {
        // Prueba de los métodos getter y setter
        System.out.println("Nombre del album: " + album.getNombre());
        System.out.println("Año del album: " + album.getAnio());
        System.out.println("Artista del album: " + album.getArtistaIcluido().getNombre() + " " + album.getArtistaIcluido().getApellido());

        // Prueba de los métodos setter
        album.setNombre("NuevoNombreAlbum");
        album.setAnio(2025);
        System.out.println("Nuevo nombre del album: " + album.getNombre());
        System.out.println("Nuevo año del album: " + album.getAnio());
    }

    // Métodos de prueba para la clase Cancion
    public static void testCancion(Cancion cancion) {
        // Prueba de los métodos getter y setter
        System.out.println("Título de la canción: " + cancion.getTitulo());
        System.out.println("Reproducciones de la canción: " + cancion.getReproducciones());
        System.out.println("Popularidad de la canción: " + cancion.getPopularidad().getClass().getSimpleName());

        // Prueba de los métodos setter
        cancion.setTitulo("NuevoTitulo");
        cancion.setReproducciones(10);
        System.out.println("Nuevo título de la canción: " + cancion.getTitulo());
        System.out.println("Nuevas reproducciones de la canción: " + cancion.getReproducciones());
    }
}

