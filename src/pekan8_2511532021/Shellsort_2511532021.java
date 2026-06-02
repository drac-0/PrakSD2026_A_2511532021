
package pekan8_2511532021;

public class Shellsort_2511532021 {
	public static void shellSort_2021(int[] A_2021) {
		int n_2021 = A_2021.length;
		int gap_2021 = n_2021 / 2;
		while (gap_2021 > 0) {
			for (int i_2021 = gap_2021; i_2021 < n_2021 ; i_2021 ++) {
				int temp_2021 = A_2021[i_2021];
				int j_2021 = i_2021;
				while ( j_2021 >= gap_2021 && A_2021[j_2021 - gap_2021] > temp_2021 ) {
					A_2021[j_2021] = A_2021[j_2021 - gap_2021];
					j_2021 = j_2021 - gap_2021;
				}
				A_2021[j_2021] = temp_2021;
			}
			gap_2021 = gap_2021 /2 ;
		}
	}
	
	public static void printArray_2021(int[] arr_2021) {
		for (int i_2021 : arr_2021) System.out.print(i_2021 + " ");;
		System.out.println();	
	}
	
	public static void main(String[] args) {
		int[] data_2021 = {3,10,4,6,8,9,7,2,1,5};
		System.out.print("Sebelum ");
		printArray_2021(data_2021);
		shellSort_2021(data_2021);
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2021(data_2021);
	}
	
}