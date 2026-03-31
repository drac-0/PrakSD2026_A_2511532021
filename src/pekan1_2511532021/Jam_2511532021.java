package pekan1_2511532021;
import java.util.Scanner;


public class Jam_2511532021 {
	private int hh;
	private int mm;
	private int ss;
	
	//validate
	public static boolean isValid(int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}
	
	//konstruktor
	public Jam_2511532021(int h, int m,int s) {
		this.hh = h;
		this.mm = m;
		this.ss = s;
	}
	
	//konstruktor 2
	public static Jam_2511532021 buatJamDariInput( Scanner sc) {
		int h,m,s;
		while(true) {
			System.out.println("Masukkan Jam (0-23)\t: ");
			h = sc.nextInt();
			System.out.println("Masukkan Menit (0-59)\t: ");
			m = sc.nextInt();
			System.out.println("Masukkan Detik (0-59)\t: ");
			s = sc.nextInt();
			
			if (Jam_2511532021.isValid(h, m, s)) {
				return new Jam_2511532021(h,m,s);
			}
			else {
				System.out.println("[ERROR] Input Tidak Valid, Silahkan Ulangi Lagi");
			}
		}
	}
		
	
	//Selektor
	public int getHour() {return hh;}
	public int getMinute() {return mm;}
	public int getSecond() {return ss;}
	
	//Mutator
	public void setHour(int h) {
		this.hh = h;
	}
	public void setMinute(int m) {
		this.mm= m;
	}
	public void setSecond(int s) {
		this.ss = s;
	}
	
	public int toSeconds() {
		return hh * 3600 + mm * 60 + ss;
	}
	public static Jam_2511532021 fromSecond(int Total) {
		if (Total < 0) throw new IllegalArgumentException("Detik Negatif");
		Total %= 24 * 3600;
		int h = Total / 3600; Total %= 3600;
		int m = Total /60 ; int s = Total % 60;
		return new Jam_2511532021(h,m,s);
	}
	
	public int compareTo(Jam_2511532021 other) {
		return Integer.compare(this.toSeconds(), other.toSeconds());
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Jam_2511532021 j)) return false;
		return hh == j.hh && mm ==  j.mm && ss == j.ss;
	}
	
	public int hashCode() {
		return java.util.Objects.hash(hh,mm,ss);
	}
	
	public Jam_2511532021 plus(Jam_2511532021 Other) { return fromSecond(this.toSeconds() + Other.toSeconds());}
	public Jam_2511532021 minus(Jam_2511532021 Other) { return fromSecond(Math.floorMod(this.toSeconds(), Other.toSeconds()));}
	public Jam_2511532021 nextSecond(){ return fromSecond(this.toSeconds() + 1);}
	public Jam_2511532021 nextNsecond(int N) {return fromSecond(this.toSeconds() + Math.max(0, N));}
	public Jam_2511532021 prevSecond() { return fromSecond(Math.floorMod(this.toSeconds() -1 , 24 * 3600 ));} 
	public Jam_2511532021 prevNsecond(int N) {return fromSecond(Math.floorMod(this.toSeconds() - Math.max(0, N), 24*3600));}
	
	public static int durasiDetik(Jam_2511532021 jaw, Jam_2511532021 jakh) {
		return jakh.toSeconds() - jaw.toSeconds();
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d ", hh,mm,ss);
	}
	
	
}
