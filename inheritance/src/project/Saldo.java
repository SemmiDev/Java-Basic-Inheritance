package project;

public class Saldo extends Spek{
   public double saldo = 200;
   
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   
   public double getSaldo(){
       return this.saldo;
   }
   
   // tambah saldo
   public void tambahSaldo(double saldo){
       this.saldo += saldo;
   }
   
   public double ukur(){
       return this.saldo - this.harga;
   }
   
   // bayar
   public void bayar(){
       if(this.harga > this.saldo){
           System.out.println("SALDO ANDA TIDAK CUKUP, SILAHKAN TAMBAH SALDO TERLEBIH DAHULU");
           
       }else{
           System.out.println("Harga 1 Iphone 11 Pro :" + this.harga);
           System.out.println("Sisa saldo setelah dibayarkan untuk membeli " + this.tipe + " : " +  ukur());
           System.out.println("PEMBAYARAN SELESAI");
       }
   }
}
