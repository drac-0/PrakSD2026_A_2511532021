package pekan3_2511532021;
import java.util.*;

public class Browser_2511532021 {
	static Stack<Website_2511532021> SWebsite_2021 = new Stack<>();
	static Scanner input = new Scanner(System.in);
	
	static void KunjungiWeb() {
		System.out.print("Masukkan nama Website : ");
		String nW_2021 = input.nextLine();
		System.out.print("Masukkan URL Website : ");
		String nU_2021 = input.nextLine();
		Website_2511532021 AW_2021 = new Website_2511532021(nW_2021, nU_2021);
		SWebsite_2021.push(AW_2021);
	}
	
	static void TombolBack() {
		if (SWebsite_2021.size() == 0) {
			System.out.println("Belum Mengunjungi website apapun");
		}
		else {
			Website_2511532021 prev_2021 = SWebsite_2021.pop();
			System.out.println("Keluar dari website : " + prev_2021.getNama()+ "\nDengan URL : " + prev_2021.getNama());
		}
	}
	
	static void LihatHalaman() {
		if (SWebsite_2021.size() == 0) {
			System.out.println("Belum Mengunjungi website apapun");
		}
		else {
			Website_2511532021 current_2021 = SWebsite_2021.peek();
			System.out.println("Sedang berada di website : " + current_2021.Nama_2021 + "\nDengan URL : " + current_2021.URL_2021);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("=== Browser History NIM: 2411532007 ===");
		System.out.println("1. Kunjungi Website");
		System.out.println("2. Tombol Back");
		System.out.println("3. Lihat Halaman Aktif");
		System.out.println("4. Keluar");
		
		while(true) {
			System.out.print("Pilihan : ");
			int pil_2021 = input.nextInt();
			input.nextLine();
			switch (pil_2021){
				case 1:
					KunjungiWeb();
					break;
				case 2:
					TombolBack();
					break;
				case 3:
					LihatHalaman();
					break;
				case 4:
					return ;
			}
			
			
		}
	}

}
