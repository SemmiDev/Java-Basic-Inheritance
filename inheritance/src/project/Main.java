package project;

public class Main {
    public static void main(String[] args) {
        Smartphone a = new Smartphone("Sammi Aldhiyanto",17,"1293721487","Lapau Durian");
        Smartphone b = new Smartphone("Apple","Iphone XII Pro","Steve Job","Amerika Serikat");
        Smartphone c = new Smartphone(15,"Apple Watch",7,5,5.8);
        Smartphone d = new Smartphone(3500,4,256,"Apple A13 Bionic","7 NM+",12,36,"IOS","ios 13","Face Unlock","Hybrid");
        Smartphone e = new Smartphone("PayPal");
        
        Saldo z = new Saldo();
        System.out.println("Saldo anda sekarang : " + z.saldo);
        double tambahSaldo = 200;
        z.tambahSaldo(tambahSaldo);
        System.out.println("=> Anda baru saja menambahkan saldo sebesar : " + tambahSaldo);
        System.out.println("Saldo anda sekarang : " + z.getSaldo());
        z.bayar();
    }
}
