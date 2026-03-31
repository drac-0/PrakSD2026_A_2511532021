package pekan1_2511532021;

public class JamDriver_2511532021 {
	public static void main(String[] args) {
		Jam_2511532021 a = new Jam_2511532021(23,59,50);
		Jam_2511532021 b = new Jam_2511532021(0,0,15);
		System.out.println("a\t\t = " + a);
		System.out.println("b\t\t = " + b);
		System.out.println("a+b\t\t = " + a.plus(b));
		System.out.println("next 20s\t\t = " + a.nextNsecond(20));
		System.out.println("durasi(a,b)\t = " + Jam_2511532021.durasiDetik(a, b) );
		System.out.println("a.compareTo(b)\t = " + a.compareTo(b));
	}
}
