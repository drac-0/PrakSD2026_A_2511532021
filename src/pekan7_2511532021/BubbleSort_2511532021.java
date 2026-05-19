package pekan7_2511532021;

public class BubbleSort_2511532021{
      public static void Bubblesort_2021(int[] arr){
            int n_2021 = arr.length;
            for(int i = 0 ; i < n_2021; i++){
                  for(int j = 0; j < n_2021 -i - 1 ; j++){
                        if (arr[j] > arr[j+1]){
                              int temp_2021 = arr[j];
                              arr[j] = arr[j+1];
                              arr[j+1] = temp_2021;
                        }
                  }
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
            Bubblesort_2021(arr_2021);
            System.out.println("array yang terurut");
            for (int i = 0 ; i < n_2021; i++){
                  System.out.print(arr_2021[i] + " ");
            }
            System.out.println("");
      }
}
