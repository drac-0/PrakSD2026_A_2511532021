package pekan6_2511532021;
import java.util.Scanner;

public class Musik_2511532021 {
    private Lagu_2511532021 head_2021;
    private Lagu_2511532021 tail_2021;

    public Musik_2511532021() {
        this.head_2021 = null;
        this.tail_2021 = null;
    }

    public void tambahLagu_2021(String judul_2021, String penyanyi_2021) {
        Lagu_2511532021 nodeBaru_2021 = new Lagu_2511532021(judul_2021, penyanyi_2021);
        
        if (head_2021 == null) {
            head_2021 = nodeBaru_2021;
            tail_2021 = nodeBaru_2021;
        } else {
            tail_2021.setNext_2021(nodeBaru_2021);
            nodeBaru_2021.setPrev_2021(tail_2021);
            tail_2021 = nodeBaru_2021;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    public void hapusLaguAwal_2021() {
        if (head_2021 == null) {
            System.out.println("Playlist kosong, tidak ada lagu yang bisa dihapus.");
            return;
        }
        System.out.println("Menghapus lagu: " + head_2021.getJudul_2021());
        head_2021 = head_2021.getNext_2021();
        
        if (head_2021 != null) {
            head_2021.setPrev_2021(null);
        } else {
            tail_2021 = null;
        }
    }

    public void tampilMaju_2021() {
        if (head_2021 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        Lagu_2511532021 temp_2021 = head_2021;
        int no_2021 = 1;
        System.out.println("\n=== Playlist Musik (Maju) ===");
        while (temp_2021 != null) {
            System.out.println(no_2021 + ". " + temp_2021.getJudul_2021() + " - " + temp_2021.getPenyanyi_2021());
            temp_2021 = temp_2021.getNext_2021();
            no_2021++;
        }
    }

    public void tampilMundur_2021() {
        if (tail_2021 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        Lagu_2511532021 temp_2021 = tail_2021;
        int no_2021 = 1;
        System.out.println("\n=== Playlist Musik (Mundur) ===");
        while (temp_2021 != null) {
            System.out.println(no_2021 + ". " + temp_2021.getJudul_2021() + " - " + temp_2021.getPenyanyi_2021());
            temp_2021 = temp_2021.getPrev_2021();
            no_2021++;
        }
    }

    public void cariLagu_2021(String cariJudul_2021) {
        if (head_2021 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        Lagu_2511532021 temp_2021 = head_2021;
        boolean ditemukan_2021 = false;
        int posisi_2021 = 1;
        
        while (temp_2021 != null) {
            if (temp_2021.getJudul_2021().equalsIgnoreCase(cariJudul_2021)) {
                System.out.println("Lagu ditemukan di urutan ke-" + posisi_2021 + " -> " + temp_2021.getJudul_2021() + " - " + temp_2021.getPenyanyi_2021());
                ditemukan_2021 = true;
                break;
            }
            temp_2021 = temp_2021.getNext_2021();
            posisi_2021++;
        }
        
        if (!ditemukan_2021) {
            System.out.println("Lagu dengan judul '" + cariJudul_2021 + "' tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc_2021 = new Scanner(System.in);
        Musik_2511532021 spotify_2021 = new Musik_2511532021();
        int pilihan_2021;

        do {
            System.out.println("\nPlaylist Musik NIM: 2511532021");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2021 = sc_2021.nextInt();
            sc_2021.nextLine();

            switch (pilihan_2021) {
                case 1:
                    System.out.print("Judul: ");
                    String judul_2021 = sc_2021.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_2021 = sc_2021.nextLine();
                    spotify_2021.tambahLagu_2021(judul_2021, penyanyi_2021);
                    break;
                case 2:
                    spotify_2021.hapusLaguAwal_2021();
                    break;
                case 3:
                    spotify_2021.tampilMaju_2021();
                    break;
                case 4:
                    spotify_2021.tampilMundur_2021();
                    break;
                case 5:
                    System.out.print("Cari Judul: ");
                    String cari_2021 = sc_2021.nextLine();
                    spotify_2021.cariLagu_2021(cari_2021);
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan_2021 != 6);
        sc_2021.close();
    }
}