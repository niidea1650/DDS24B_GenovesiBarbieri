package Ej1;

public class Icono {
    public static Icono MusicalNote = new Icono(new int[]{0xD83C, 0xDFB5});
    public static Icono Rocket = new Icono(new int[]{0xD83D, 0xDE80});
    public static Icono Fire = new Icono(new int[]{0xD83D, 0xDD25});

    private int[] internalEncoding;

    Icono(int[] internalEncoding){
        this.internalEncoding = internalEncoding;
    }
    public String texto(){
        return new String(internalEncoding, 0, internalEncoding.length);
    }

}
