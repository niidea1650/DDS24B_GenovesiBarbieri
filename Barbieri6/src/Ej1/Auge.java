package Ej1;

public class Auge extends Popularidad{
    private int cantRepro;
    private int cantMaxima= 50000;
    private int maxLike = 20000;
    private int dislike;
    private int maxDislike = 5000;

    public Auge(int cantRepro, int cantMaxima, int maxLike, int dislike, int maxDislike) {
        this.cantRepro = cantRepro;
        this.cantMaxima = cantMaxima;
        this.maxLike = maxLike;
        this.dislike = dislike;
        this.maxDislike = maxDislike;
    }

    public int getCantRepro() {
        return cantRepro;
    }

    public void setCantRepro(int cantRepro) {
        this.cantRepro = cantRepro;
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public int getMaxLike() {
        return maxLike;
    }

    public void setMaxLike(int maxLike) {
        this.maxLike = maxLike;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getMaxDislike() {
        return maxDislike;
    }

    public void setMaxDislike(int maxDislike) {
        this.maxDislike = maxDislike;
    }
    public Auge(){
        this.cantRepro = 0;
        this.dislike = 0;
    }

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
        cantRepro++;
        if (cantRepro > cantMaxima){
            cancion.setPopularidad(new Tendencia());
        }
    }
}
