package pekan3_2511532021;
import java.util.*;

public class NilaiMaksimum_2511532021 {
	public static int max_2021(Stack<Integer> s) {
		Stack<Integer> backup_2021 = new Stack<Integer>();
		int maxValue_2021 = s.pop();
		backup_2021.push(maxValue_2021);
		while (!s.isEmpty()) {
			int next_2021 = s.pop();
			backup_2021.push(next_2021);
			maxValue_2021 = Math.max(maxValue_2021, next_2021);
		}
		while (!backup_2021.isEmpty()) {
			s.push(backup_2021.pop());
		}
		return maxValue_2021;

	}
	
	public static void main(String[] args) {
		Stack <Integer> s_2021 = new Stack<Integer>();
		s_2021.push(70);
		s_2021.push(12);
		s_2021.push(20);
		System.out.println("isi atas : " + s_2021.pop());
		System.out.println("Stack Teratas ; "  + s_2021.peek());
		System.out.println("Nilai maksimum " + max_2021(s_2021));
	}

}
