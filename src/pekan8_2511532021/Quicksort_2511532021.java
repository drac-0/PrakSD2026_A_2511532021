package pekan8_2511532021;

public class Quicksort_2511532021 {
	static void swap_2021(int[] arr_2021, int i_2021, int j_2021) {
		int temp_2021 = arr_2021[i_2021];
		arr_2021[i_2021] = arr_2021[j_2021];
		arr_2021[j_2021] = temp_2021;
	}
	
	static void medianOfThree_2021(int [] arr_2021,int low_2021, int high_2021) {
		int mid_2021 = low_2021 + (high_2021 - low_2021) / 2;
		
		if(arr_2021[low_2021] > arr_2021[mid_2021]) {
			swap_2021(arr_2021,low_2021,mid_2021);
		}
		
		if(arr_2021[low_2021] > arr_2021[mid_2021]) {
			swap_2021(arr_2021,low_2021,high_2021);
		}
		if(arr_2021[mid_2021] > arr_2021[high_2021]) {
			swap_2021(arr_2021, mid_2021,high_2021);
		}
		
		swap_2021(arr_2021,mid_2021,high_2021);
	}
	
	static int partition_2021(int[] arr_2021, int low_2021, int high_2021) {
		medianOfThree_2021(arr_2021,low_2021,high_2021);
		
		
		int pivot_2021 = arr_2021[high_2021];
		int i_2021 = (low_2021 - 1);
		
		for (int j_2021 = low_2021 ; j_2021 <= high_2021 -1 ;j_2021++  ) {
			if(arr_2021[j_2021] < pivot_2021) {
				i_2021++;
				swap_2021(arr_2021,i_2021,j_2021);
			}
		}
		swap_2021(arr_2021, i_2021 + 1, high_2021);
		return (i_2021 + 1);
	}
	
	static void quickSort_2021(int[] arr_2021, int low_2021, int high_2021) {
		if(low_2021<high_2021) {
			int pi_2021 = partition_2021(arr_2021,low_2021,high_2021);
			quickSort_2021(arr_2021,low_2021,pi_2021 - 1);
			quickSort_2021(arr_2021,pi_2021 + 1, high_2021);
		}
	}
	
	public static void printArray_2021(int[] arr_2021) {
		for (int i_2021 : arr_2021) System.out.print(i_2021 + " ");;
		System.out.println();	
	}
	
	public static void main(String[] args) {
		int[] data_2021 = {10,7,8,9,1,5};
		int N_2021 = data_2021.length;
		System.out.print("Sebelum ");
		printArray_2021(data_2021);
		quickSort_2021(data_2021, 0 , N_2021-1);
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2021(data_2021);
	}

}
