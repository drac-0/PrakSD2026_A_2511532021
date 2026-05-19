package pekan7_2511532021;

public class InsertionSort_2511532021{
      public static void insertionsort_2021(int[] arr){
            int n_2021 = arr.length;
            for (int i = 1 ; i < n_2021 ; i ++){
                  int key = arr[i];
                  int j = i - 1;
                  while(j >= 0 && arr[j] > key){
                        arr[j+1] = arr[j];
                        j--;
                  }
                  arr[j + 1] = key;
            }
      }

      public static void main(String[] args) {
            int arr_2021 [] = { 23,78,45,8,32,52,1};
            int n_2021 = arr_2021.length;
            System.out.println("array yang belum terurut:\n");
            for (int i = 0 ; i < n_2021; i++){
                  System.out.print(arr_2021[i] + " ");
            }
            System.out.println("");
            insertionsort_2021(arr_2021);
            System.out.println("array yang terurut");
            for (int i = 0 ; i < n_2021; i++){
                  System.out.print(arr_2021[i] + " ");
            }
            System.out.println("");
      }
}
