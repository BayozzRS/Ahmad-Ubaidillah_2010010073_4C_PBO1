package sepeda;

import java.util.Scanner;

public class SepedaGirBeraksi {
    public static void main(String[] args) {        
        //Sepeda sepedaku = new Sepeda();
        SepedaGir gearku = new SepedaGir();
        
        Scanner masukannd = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String namand = masukannd.nextLine();
        System.out.println("Nama Pemilik Sepeda : " + namand);
        
        Sepeda sepedaku = new Sepeda(2010,"Biru");
        sepedaku.tampilHasil();
        //sepedaku.setWarna("Kuning");
        //sepedaku.setTahunProduksi(2015);
        //sepedaku.tampilHasil();
        gearku.setGirNaik(3);
        //gearku.getGir();
        gearku.setGirNaik(2);
        //gearku.getGir();
        gearku.tampilHasilGir();
        
        SepedaGir gearmu = new SepedaGir();
        
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = masukan.nextLine();
        System.out.println("Nama Pemilik Sepeda : " + nama);
        
        Sepeda sepedamu = new Sepeda("Merah",2019);
        sepedamu.tampilHasil();

        gearku.setGirNaik(3);

        gearku.setGirNaik(2);

        gearku.tampilHasilGir();
        
        

    }
}
