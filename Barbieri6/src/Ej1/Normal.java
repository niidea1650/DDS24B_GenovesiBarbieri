package Ej1;

public class Normal extends Popularidad{
    private int CantRepro;
    private int CantMaxima = 1000;

    public Normal(int cantRepro, int cantMaxima) {
        CantRepro = cantRepro;
        CantMaxima = cantMaxima;
    }

    public Normal(int cantRepro) {
        CantRepro = cantRepro;
    }


    public int getCantRepro() {
        return CantRepro;
    }

    public int getCantMaxima() {
        return CantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        CantMaxima = cantMaxima;
    }

    public void setCantRepro(int cantRepro) {
        CantRepro = cantRepro;
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
        this.CantRepro++;
        if (this.CantRepro > this.CantMaxima){
            cancion.setPopularidad(new Auge());
        }


    }

    public Normal(){
        this.CantRepro = 0;
    }
}
