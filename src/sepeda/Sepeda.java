package sepeda;

public class Sepeda {
    protected String warna;
    protected int tahunProduksi;

    public Sepeda(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public Sepeda(int tahunProduksi, String warna) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    
    public Sepeda(){}

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    public void tampilHasil(){
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}
