package pekan4_2511532021;
import java.util.*;

public class IterasiQueue_2511532021 {
	public static void main(String[] args) {
		Queue<String> q_2021 = new LinkedList<String>();
		
		q_2021.add("Praktikum");
		q_2021.add("Struktur");
		q_2021.add("data");
		q_2021.add("dan");
		q_2021.add("Algoritma");
		Iterator<String> iterator = q_2021.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
