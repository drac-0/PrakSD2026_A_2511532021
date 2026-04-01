package pekan1_2511532021;

public class MobilDriver_2511532021 {
 public static void main(String[] args) {
     Mobil_2511532021 daftar = new Mobil_2511532021();

     Mobil_2511532021 m1 = new Mobil_2511532021("Avanza", 2020, 1300, 150000000, "Toyota");
     Mobil_2511532021 m2 = new Mobil_2511532021("Brio", 2021, 1200, 180000000, "Honda");
     Mobil_2511532021 m3 = new Mobil_2511532021("Xpander", 2022, 1500, 250000000, "Mitsubishi");

     daftar.tambahMobil(m1);
     daftar.tambahMobil(m2);
     daftar.tambahMobil(m3);

     daftar.tampilkanSemua();

     System.out.println("\nNama mobil pertama: " + m1.getNama());
     System.out.println("Harga: Rp" + (long) m1.getHarga());

     m1.setHarga(155000000);
     System.out.println("Harga setelah update: Rp" + (long) m1.getHarga());

     daftar.hapusMobil("Brio");

     daftar.tampilkanSemua();
 }
}