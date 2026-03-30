package pekan1_2511532021;

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
	public void setHour(int s) {
		this.ss = s;
	}

}
