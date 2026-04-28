package pekan4_2511532021;
import java.util.*;

public class ReverseData_2511532021 {
	public static void main(String[] args) {
		Queue<Integer> q_2021 = new LinkedList<Integer>();
		q_2021.add(1);
		q_2021.add(2);
		q_2021.add(3);
		System.out.println("sebelum reverse = " + q_2021);
		
		Stack<Integer> s_2021 = new Stack<Integer>();
		while (!q_2021.isEmpty()) {
			s_2021.push(q_2021.remove());
		}
		while(!s_2021.isEmpty()) {
			q_2021.add(s_2021.pop());
		}
		System.out.println("sesudah reverse = " + q_2021);
	}

}
