package pekan1_2511532021;
import java.util.Scanner;

public class JamDriver2_2511532021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("=== Program Driver Objek Jam ===");
		
		System.out.println("\n--- Input Jam 1 ---");
		Jam_2511532021 j1 = Jam_2511532021.buatJamDariInput(input);
		
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511532021 j2 = Jam_2511532021.buatJamDariInput(input);
		
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (String)\t: " + j1.toString());
		System.out.println("Jam 2 (String)\t: " + j2.toString());
		System.out.println("Jam 1 dalam detik\t: " + j1.toSeconds());
		System.out.println("Jam 2 dalam detik\t: " + j2.toSeconds());
		
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0 ) {
			System.out.println("Status \t\t\t: Jam 1 lebih lambat (setelah) Jam 2");
			
			
		}
		else if (perbandingan < 0) {
			System.out.println("Status \t\t\t: Jam 1 lebih awal (sebelum) Jam 2");
		}
		else {
			System.out.println("Status \t\t\t: Jam 1 dan Jam 2 sama persis");
		}
		
		System.out.println("Durasi (J1 - J2)\t: " + Jam_2511532021.durasiDetik(j1, j2));
		
		Jam_2511532021 jNext = j1.nextSecond();
		System.out.println("Jam 1 Detik Berikutnya\t: " + jNext);
		
		Jam_2511532021 jPrev= j1.prevSecond();
		System.out.println("Jam 1 Detik Berikutnya\t: " + jPrev);
		
		Jam_2511532021 jHasilPlus = j1.plus(jPrev);
		System.out.println("Hasil J1 + J2 \t: " + jHasilPlus);
		
		input.close();
		System.out.println("\nProgram Selesai");
		
	}
}
