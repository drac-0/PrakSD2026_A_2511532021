package pekan2_2511532021;

public class DaftarKataDrive_2511532021 {
	public static void main(String[] args) {
		DaftarKata_2511532021 a1 = new DaftarKata_2511532021();
		
		a1.tambah_2511532021("Kami ");
		a1.tambah_2511532021("Informatika ");
		
		a1.tambahPada_2511532021(1,"Kami ");
		
		System.out.println("Awal\t: " + a1);
		
		a1.ubahElemen(1, "Departemen");
		System.out.println("Setelah diubah : " + a1);
		
		String terhapus = a1.hapusElemen_2511532021(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah dihapus : " + a1);
		
		System.out.println("Iteras : ");
		a1.iterasiCetak();
		System.out.println();
	}
	
	
}
