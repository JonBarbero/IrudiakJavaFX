package ehu.isad;

public class Argazki {

    private final String izena;
    private final String irudia;

    public Argazki(String pIzena,String pIrudia){
        this.izena=pIzena;
        this.irudia=pIrudia;
    }

    public String getIrudia() {
        return irudia;
    }

    @Override
    public String toString(){
        return this.izena;
    }
}
