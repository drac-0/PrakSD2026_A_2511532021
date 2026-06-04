package pekan8_2511532021;
import java.util.*;

public class SortingLagu_2511532021 {
	static int index_2021 = 0;
	static Lagu_2511532021[] arraylagu_2021 = new Lagu_2511532021[20];
	static Scanner input_2021 = new Scanner(System.in);
	public static void InputLagu(int index_2021) {
		System.out.print("masukkan judul : ");
		String judul_2021 = input_2021.nextLine();
		System.out.print("masukkan penyanyi : ");
		String Penyanyi_2021 = input_2021.nextLine();
		System.out.print("masukkan durasi (detik) : ");
		int durasi_2021= input_2021.nextInt();
		input_2021.nextLine();
		Lagu_2511532021 newLagu = new Lagu_2511532021(judul_2021, Penyanyi_2021, durasi_2021);
		arraylagu_2021[index_2021] = newLagu;
		
	
	}
	
	public static void printPlaylist() {
        for (int i_2021 = 0 ; i_2021 < index_2021; i_2021++) {
            System.out.println("Judul lagu :" + arraylagu_2021[i_2021].getJudul());
            System.out.println("Penyanyi lagu :" + arraylagu_2021[i_2021].getPenyanyi());
            System.out.println("Durasi (detik) :" + arraylagu_2021[i_2021].getDurasi() + "\n");            
        }

        System.out.println();

	}
	
	static void swap_2021(int[] arr_2021, int i_2021, int j_2021) {
		int temp_2021 = arr_2021[i_2021];
		arr_2021[i_2021] = arr_2021[j_2021];
		arr_2021[j_2021] = temp_2021;
	}
	
	
	//quick sort
	static int partition_2021(Lagu_2511532021[] arr_2021, int low_2021, int high_2021) {
	    medianOfThree_2021(arr_2021, low_2021, high_2021);
	    int pivot_2021 = arr_2021[high_2021].getDurasi();
	    int i_2021 = low_2021 - 1;

	    for (int j_2021 = low_2021; j_2021 <= high_2021 - 1; j_2021++) {
	        if (arr_2021[j_2021].getDurasi() < pivot_2021) {
	            i_2021++;
	            swap_2021(arr_2021, i_2021, j_2021);
	        }
	    }
	    swap_2021(arr_2021, i_2021 + 1, high_2021);
	    return i_2021 + 1;
	}

	static void swap_2021(Lagu_2511532021[] arr_2021, int i_2021, int j_2021) {
	    Lagu_2511532021 temp_2021 = arr_2021[i_2021];
	    arr_2021[i_2021] = arr_2021[j_2021];
	    arr_2021[j_2021] = temp_2021;
	}

	static void medianOfThree_2021(Lagu_2511532021[] arr_2021, int low_2021, int high_2021) {
	    int mid_2021 = low_2021 + (high_2021 - low_2021) / 2;

	    if (arr_2021[low_2021].getDurasi() > arr_2021[mid_2021].getDurasi())
	        swap_2021(arr_2021, low_2021, mid_2021);

	    if (arr_2021[low_2021].getDurasi() > arr_2021[high_2021].getDurasi())
	        swap_2021(arr_2021, low_2021, high_2021);

	    if (arr_2021[mid_2021].getDurasi() > arr_2021[high_2021].getDurasi())
	        swap_2021(arr_2021, mid_2021, high_2021);

	    swap_2021(arr_2021, mid_2021, high_2021);
	}

	static void quickSort_2021(Lagu_2511532021[] arr_2021, int low_2021, int high_2021) {
	    if (low_2021 < high_2021) {
	        int pi_2021 = partition_2021(arr_2021, low_2021, high_2021);
	        quickSort_2021(arr_2021, low_2021, pi_2021 - 1);
	        quickSort_2021(arr_2021, pi_2021 + 1, high_2021);
	    }
	}
	//end of quick sort blablablablabl
	
	public static void main(String[] args) {

		while (true) {
			System.out.println("Pilih opsi");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Tampilkan informasi playlist sekarang");
			System.out.println("3. Sort Playlist berdasarkan durasi");
			System.out.println("4. Keluar");
			System.out.print("Pilihan mu : ");
			int pilihan_2021 = input_2021.nextInt();
			input_2021.nextLine();
			if (pilihan_2021 == 1) {
				InputLagu(index_2021++);
				
			}
			else if (pilihan_2021 == 2) {
				if (index_2021 == 0) {
					System.out.println("PLAYLIST KOSONG");
					continue ;
				}
				printPlaylist();
			}
			
			else if (pilihan_2021 == 3) {
			    if (index_2021 == 0) {
			        System.out.println("PLAYLIST KOSONG");
			        continue;
			    }
			    quickSort_2021(arraylagu_2021, 0, index_2021 - 1);
			    printPlaylist();
			}
			
			else if (pilihan_2021 == 4) {
				return;
			}

			else {
				System.out.println("Ndak da pilihannyo buyan");
			}
		}		
	}
}
