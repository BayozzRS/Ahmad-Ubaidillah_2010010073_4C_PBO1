package sepeda;

public class SepedaGir extends Sepeda {
    protected int gir;

    int getGir() {
        return gir;
    }

    void setGirNaik(int pertambahanGir) {
        this.gir = gir + pertambahanGir;
    }
    void setGirTurun(int penguranganGir) {
        this.gir = gir - penguranganGir;
    }
    
    public void tampilHasilGir(){
        System.out.println("Gir : " + gir);
    }
}
