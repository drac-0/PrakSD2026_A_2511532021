package pekan4_2511532021;
import java.util.*;

public class QueueLinkedlist_2511532021 {
	public static void main(String[] args) {
		Queue<Integer> q_2021 = new LinkedList<>();
		for (int i = 0 ; i < 6; i++) {
			q_2021.add(i);
		}
		
		System.out.println("Elemen Antrian " + q_2021);
		
		int hapus_2021 = q_2021.remove();
		
		System.out.println("Hapus elemen = " + hapus_2021);
		System.out.println(q_2021);
		
		int depan_2021 = q_2021.peek();
		System.out.println("Kepala Antrian = " + depan_2021);
		
		int banyak_2021 = q_2021.size();
		System.out.println("Size Antrian = " + banyak_2021);		
	}
}
