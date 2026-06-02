package pekan8_2511532021;

public class mergeSort_2511532021 {

    void merge(int arr_2021[], int l_2021, int m_2021, int r_2021) {

        int n1_2021 = m_2021 - l_2021 + 1;
        int n2_2021 = r_2021 - m_2021;

        int L_2021[] = new int[n1_2021];
        int R_2021[] = new int[n2_2021];

 
        for (int i_2021 = 0; i_2021 < n1_2021; i_2021++) {
            L_2021[i_2021] = arr_2021[l_2021 + i_2021];
        }

 
        for (int j_2021 = 0; j_2021 < n2_2021; j_2021++) {
            R_2021[j_2021] = arr_2021[m_2021 + 1 + j_2021];
        }

        int i_2021 = 0;
        int j_2021 = 0;
        int k_2021 = l_2021;

 
        while (i_2021 < n1_2021 && j_2021 < n2_2021) {

            if (L_2021[i_2021] <= R_2021[j_2021]) {
                arr_2021[k_2021] = L_2021[i_2021];
                i_2021++;
            } else {
                arr_2021[k_2021] = R_2021[j_2021];
                j_2021++;
            }

            k_2021++;
        }

 
        while (i_2021 < n1_2021) {
            arr_2021[k_2021] = L_2021[i_2021];
            i_2021++;
            k_2021++;
        }

 
        while (j_2021 < n2_2021) {
            arr_2021[k_2021] = R_2021[j_2021];
            j_2021++;
            k_2021++;
        }
    }

    void sort(int arr_2021[], int l_2021, int r_2021) {

        if (l_2021 < r_2021) {

            int m_2021 = (l_2021 + r_2021) / 2;

            sort(arr_2021, l_2021, m_2021);
            sort(arr_2021, m_2021 + 1, r_2021);

            merge(arr_2021, l_2021, m_2021, r_2021);
        }
    }

    public static void printArray_2021(int[] arr_2021) {

        for (int i_2021 : arr_2021) {
            System.out.print(i_2021 + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr_2021 = {12, 11, 13, 5, 6, 7};

        System.out.print("Sebelum (Merge Sort): ");
        printArray_2021(arr_2021);

        mergeSort_2511532021 ob_2021 = new mergeSort_2511532021();

        ob_2021.sort(arr_2021, 0, arr_2021.length - 1);

        System.out.print("Sesudah (Merge Sort): ");
        printArray_2021(arr_2021);
    }
}