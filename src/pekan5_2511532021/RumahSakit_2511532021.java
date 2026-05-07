package pekan5_2511532021;
import java.util.Scanner;

public class RumahSakit_2511532021 {
    private Pasien_2511532021 head_2021;
    private int counterAntrian_2021;
    private int totalPasien_2021;

    public RumahSakit_2511532021() {
        this.head_2021 = null;
        this.counterAntrian_2021 = 0;
        this.totalPasien_2021 = 0;
    }

    public void daftarkanPasien_2021(String nama_2021, String keluhan_2021) {
        counterAntrian_2021++;
        Pasien_2511532021 nodeBaru_2021 = new Pasien_2511532021(nama_2021, keluhan_2021, counterAntrian_2021);
        
        if (head_2021 == null) {
            head_2021 = nodeBaru_2021;
        } else {
            Pasien_2511532021 temp_2021 = head_2021;
            while (temp_2021.getNext_2021() != null) {
                temp_2021 = temp_2021.getNext_2021();
            }
            temp_2021.setNext_2021(nodeBaru_2021);
        }
        totalPasien_2021++;
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counterAntrian_2021);
    }

    public void panggilPasien_2021() {
        if (head_2021 == null) {
            System.out.println("Antrian kosong. Tidak ada pasien yang dapat dipanggil.");
            return;
        }
        System.out.println("Memanggil Pasien:");
        System.out.println("No Antrian: " + head_2021.getNoAntrian_2021() + " | Nama: " + head_2021.getNama_2021() + " | Keluhan: " + head_2021.getKeluhan_2021());
        
        head_2021 = head_2021.getNext_2021();
        totalPasien_2021--;
    }

    public void tampilkanAntrian_2021() {
        if (head_2021 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Daftar Antrian Pasien ===");
        Pasien_2511532021 temp_2021 = head_2021;
        int posisi_2021 = 1;
        while (temp_2021 != null) {
            System.out.println(posisi_2021 + ". [No." + temp_2021.getNoAntrian_2021() + "] " + temp_2021.getNama_2021() + " - " + temp_2021.getKeluhan_2021());
            temp_2021 = temp_2021.getNext_2021();
            posisi_2021++;
        }
    }

    public void cariPasien_2021(String cariNama_2021) {
        if (head_2021 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Pasien_2511532021 temp_2021 = head_2021;
        boolean ditemukan_2021 = false;
        int posisi_2021 = 1;
        
        while (temp_2021 != null) {
            if (temp_2021.getNama_2021().equalsIgnoreCase(cariNama_2021)) {
                System.out.println("Pasien ditemukan pada antrian ke-" + posisi_2021 + ":");
                System.out.println("No Antrian: " + temp_2021.getNoAntrian_2021() + " | Nama: " + temp_2021.getNama_2021() + " | Keluhan: " + temp_2021.getKeluhan_2021());
                ditemukan_2021 = true;
            }
            temp_2021 = temp_2021.getNext_2021();
            posisi_2021++;
        }
        if (!ditemukan_2021) {
            System.out.println("Pasien dengan nama '" + cariNama_2021 + "' tidak ditemukan dalam antrian.");
        }
    }

    public void cekStatusAntrian_2021() {
        if (head_2021 == null) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("=== Status Antrian ===");
        System.out.println("Total pasien dalam antrian: " + totalPasien_2021);
        System.out.println("Pasien selanjutnya (Terdepan): [No." + head_2021.getNoAntrian_2021() + "] " + head_2021.getNama_2021());
    }

    public static void main(String[] args) {
        Scanner sc_2021 = new Scanner(System.in);
        RumahSakit_2511532021 rs_2021 = new RumahSakit_2511532021();
        int pilihan_2021;

        do {
            System.out.println("\nAntrian Rumah Sakit NIM: 2511532021");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2021 = sc_2021.nextInt();
            sc_2021.nextLine();

            switch (pilihan_2021) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_2021 = sc_2021.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_2021 = sc_2021.nextLine();
                    rs_2021.daftarkanPasien_2021(nama_2021, keluhan_2021);
                    break;
                case 2:
                    rs_2021.panggilPasien_2021();
                    break;
                case 3:
                    rs_2021.tampilkanAntrian_2021();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_2021 = sc_2021.nextLine();
                    rs_2021.cariPasien_2021(cari_2021);
                    break;
                case 5:
                    rs_2021.cekStatusAntrian_2021();
                    break;
                case 6:
                    System.out.println("Keluar dari program simulasi Rumah Sakit.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan_2021 != 6);
        sc_2021.close();
    }
}