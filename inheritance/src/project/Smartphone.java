package project;

public class Smartphone extends Spek{
    // constructor data diri
    public Smartphone(String nama, int umur, String ktp, String alamat){
        this.nama   = nama;
        this.umur   = umur;
        this.ktp    = ktp;
        this.alamat = alamat;
        
        System.out.println("====================================================");
        System.out.println("                 DATA DIRI ANDA                     ");
        System.out.println("====================================================");
        System.out.println("Nama    : " + this.nama);
        System.out.println("Umur    : " + this.umur);
        System.out.println("KTP     : " + this.ktp);
        System.out.println("Alamat  : " + this.alamat + "\n");
    }
    
    // constructor brand
    public Smartphone(String brand,String tipe,String founder,String negara){
        this.brand   = brand;
        this.founder = founder;
        this.negara  = negara;
        this.tipe    = tipe;
        
        System.out.println("====================================================");
        System.out.println("               PRODUK YANG ANDA BELI                ");
        System.out.println("====================================================");
        System.out.println("Brand   : " + this.brand);
        System.out.println("Tipe    : " + this.tipe);
        System.out.println("Harga   : " + this.harga + " Juta");
        System.out.println("Founder : " + this.founder);
        System.out.println("Negara  : " + this.negara + "\n");
    }
    
    // constructor body
    public Smartphone(double berat, String aksesoris, double panjang,double lebar,double ratio){
        this.berat     = berat;
        this.rasio     = rasio;
        this.panjang   = panjang;
        this.lebar     = lebar;
        this.aksesoris = aksesoris;
        
        System.out.println("====================================================");
        System.out.println("                    Detil Produk                    ");
        System.out.println("====================================================");
        System.out.println("Berat       : " + this.berat + " Gram");
        System.out.println("Rasio       : " + this.rasio);
        System.out.println("Panjang     : " + this.panjang);
        System.out.println("Lebar       : " + this.lebar);
        System.out.println("Aksesoris   : " + this.aksesoris + "\n");
    }
    
    // constructor spek
    public Smartphone(long battery, int RAM, long internal, String chipset, String fabrikasi, double frontCam, double backCam, String OS, String skinPack, String security, String slotTipe) {
        this.battery   = battery;
        this.RAM       = RAM;
        this.internal  = internal;
        this.chipset   = chipset;
        this.fabrikasi = fabrikasi;
        this.frontCam  = frontCam;
        this.backCam   = backCam;
        this.OS        = OS;
        this.skinPack  = skinPack;
        this.security  = security;
        this.slotTipe  = slotTipe; 
        
        System.out.println("====================================================");
        System.out.println("                   SPEK PRODUK                      ");
        System.out.println("====================================================");
        System.out.println("Battery     : " + this.battery       + " MAH");
        System.out.println("RAM         : " + this.RAM           + " GB");
        System.out.println("Internal    : " + this.internal      + " GB");
        System.out.println("Chipset     : " + this.chipset);
        System.out.println("Fabrikasi   : " + this.fabrikasi);
        System.out.println("Front Cam   : " + this.frontCam      + " MP");
        System.out.println("Back Cam    : " + this.backCam       + " MP");
        System.out.println("OS          : " + this.OS);
        System.out.println("Skin Pack   : " + this.skinPack);
        System.out.println("Security    : " + this.security);
        System.out.println("Slot Tipe   : " + this.slotTipe);
    }

    // constructor payment
    public Smartphone(String metode){
        this.metode = metode;
        
        System.out.println("====================================================");
        System.out.println("                   Payment Method                   ");
        System.out.println("====================================================");
        System.out.println("Payment Method : " + this.metode);
    } 
}
