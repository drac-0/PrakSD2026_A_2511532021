package pekan2_2511532021;
import java.util.*;

public class Playlist_2511532021 {
	//CHANGE COMMIT MESSAGE
	static ArrayList<Musik_2511532021> listPlaylist_2021 = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	static void TambahLagu_2021() {
		System.out.print("Masukkan Judul : ");
		String j_2021 = input.nextLine();
		
		System.out.print("Masukkan Penyanyi : ");
		String p_2021 = input.nextLine();
		
		System.out.print("Masukkan durasi (detik) : ");
		int d_2021 = input.nextInt();
		input.nextLine();
		
		Musik_2511532021 M_2021 = new Musik_2511532021(j_2021, p_2021, d_2021);
		System.out.println("Data berhasil ditambahkan");
		listPlaylist_2021.add(M_2021);
	}
	
	static void Lihat_Playlist() {
		for (int i = 0; i < listPlaylist_2021.size(); i++) {
			System.out.println("Judul lagu " + listPlaylist_2021.get(i).getJudul());
			System.out.println("Penyanyi " + listPlaylist_2021.get(i).getPenyanyi());
			System.out.println("Durasi " + listPlaylist_2021.get(i).getDurasi() + "\n\n");

		}
	}
	
	static void HapusLagu(){
		System.out.print("masukkan index : ");
		int index = input.nextInt();
		listPlaylist_2021.remove(index);
	}
	
	public static void main(String[] args) {
	
		System.out.println("===Playlist Musik Nim: 2511532021===");
		System.out.println("Tambah lagu");
		System.out.println("Lihat Playlist");
		System.out.println("Hapus Lagu");
		System.out.println("Keluar");
		
		while (true) {
			System.out.print("Pilihan : ");
			int pil_2021 = input.nextInt();
			input.nextLine();
			switch (pil_2021) {
			case 1:
				TambahLagu_2021();
				break;
			case 2:
				Lihat_Playlist();
				break;
			case 3:
				HapusLagu();
				break;
			case 4:
				return;
			default:
				System.out.println("Invalid INPUT");
			}
		}
	}
	
	
	
	
	

}
