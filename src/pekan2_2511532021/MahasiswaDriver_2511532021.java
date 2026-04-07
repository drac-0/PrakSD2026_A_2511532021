package pekan2_2511532021;
import java.util.*;

public class MahasiswaDriver_2511532021 {
	public static void tampilkanMenu_2511532021() {
		System.out.println("\nMenu:");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	public static void tambahkanMahasiswa_2511532021(ArrayList<Mahasiswa_2511532021> list, Scanner sc) {
		System.out.println("Masukkan NIM: ");
		String nim = sc.nextLine();
		System.out.println("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.println("Masukkan Prodi: ");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511532021(nim,nama,prodi));
		System.out.println("");
	}
	
	public static void tampilkanSemuaMahasiswa_2511532021(ArrayList<Mahasiswa_2511532021> list) {
		if (list.isEmpty()) {
			System.out.print("Daftar Mahasiswa Kosong");
		}
		else {
			for(Mahasiswa_2511532021 mhs : list) {
				System.out.print(mhs);
			}
		}
	}
	
	public static void hapusMahasiswa_2511532021(ArrayList <Mahasiswa_2511532021> list, Scanner sc) {
		System.out.print("Masukkan NIM yang akan dihapus");
		String nimhapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimhapus));
		
		if (removed) {
			System.out.print("Data dengan NIM" + nimhapus + " berhasil dihapus");
		}
		else {
			System.out.print("Data tidak ditemukan");
		}
	}
	
	public static void cariMahasiswa_2511532021(ArrayList<Mahasiswa_2511532021> list, Scanner sc) {
		System.out.println("Massukan NIM yang dicari: ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511532021 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencarian " + mhs);
				ditemukan = true;
				break;
			}
		}
		
		if (!ditemukan) {
			System.out.println("NIM TIDAK ADA");
		}
	}
	
	public static void main(String[] args) {
		ArrayList <Mahasiswa_2511532021> mahasiswalist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			tampilkanMenu_2511532021();
			System.out.print("Pilih menu: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				tambahkanMahasiswa_2511532021(mahasiswalist, scanner);
				break;
			case 2:
				tampilkanSemuaMahasiswa_2511532021(mahasiswalist);
				break;
			case 3:
				cariMahasiswa_2511532021(mahasiswalist, scanner);
				break;
			case 4:
				System.out.println("KELUAR DARI PROGRAM");
				break;
				
			case 5:
				cariMahasiswa_2511532021(mahasiswalist, scanner);
			
				
			default:
				System.out.println("Pilihan tidak valid.");
			}
		}while (choice != 5);
		scanner.close();
		
		
		
	}
}
