package pekan3_2511532021;
import java.util.*;

public class stackArray {
	static final int MAX_2021= 100;
	int top_2021;
	int  a_2021[] = new int[MAX_2021];
	
	boolean isEmpty_2021() {
		return (top_2021 < 0);
	}
	
	stackArray(){
		top_2021 = -1;
	}
	
	boolean push_2021(int x) {
		if (top_2021 >= (MAX_2021 -1)) {
			System.out.println("stack OVerflow");
			return false;
		}
		else{
			a_2021[++top_2021] = x;
			System.out.println(x + " dimasukkan ke dalam stack");
			return true;
		}
	}
	
	int pop_2021() {
		if (top_2021<0) {
			System.out.println("stack underflow");
			return 0;
		}
		
		else {
			int x = a_2021[top_2021--];
			return x;
		}
	}
	
	int peek_2021() {
		if (top_2021 < 0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a_2021[top_2021];
			return x;
		}
	}
	
	void print_2021() {
		for (int i = top_2021;  i > -1; i-- ) {
			System.out.print(" " + a_2021[i]);
		}
	}
}

