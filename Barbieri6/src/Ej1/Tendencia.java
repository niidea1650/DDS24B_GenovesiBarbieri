package Ej1;

import java.time.LocalDate;

public class Tendencia extends Popularidad{

    @Override
    protected String icono() {
        return null;
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return null;
    }

    @Override
    public void actEstado(Cancion cancion) {
        cancion.getUltReproduccion();
    }

}
