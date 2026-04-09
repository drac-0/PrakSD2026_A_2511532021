package pekan3_2511532021;

public class stackdriver {
	public static void main(String[] args) {
		stackArray s= new stackArray();
		s.push_2021(10);
		s.push_2021(20);
		s.push_2021(30);
		
		System.out.println(s.pop_2021() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_2021());
		System.out.println("Elemen pada stack : ");
		s.print_2021();
	}
}
