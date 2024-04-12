package Ej1;
public abstract class Popularidad {
    protected abstract String icono();
    protected abstract String leyenda(Cancion cancion);
    public abstract void actEstado(Cancion cancion);
    public  String detalleCancion(Cancion cancion){
        String detalle = " ";
        detalle += this.icono();
        detalle += "-";
        detalle += this.leyenda(cancion);
        return detalle;
    }
}
