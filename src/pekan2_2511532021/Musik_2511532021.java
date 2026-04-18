package pekan2_2511532021;
import java.util.*;

public class Musik_2511532021 {
	String Judul_2021;
	String penyanyi_2021;
	int durasi_2021;
	
	public Musik_2511532021(String Judul, String penyanyi, int durasi) {
		this.Judul_2021 = Judul;
		this.penyanyi_2021 = penyanyi;
		this.durasi_2021 = durasi;
	}
	
	void setPenyanyi(String penyanyi) {
		this.penyanyi_2021 = penyanyi;
	}
	
	void setPenyanyi(int durasi) {
		this.durasi_2021 = durasi;
	}
	
	void setJudul(String Judul) {
		this.Judul_2021= Judul;
	}
	
	String getJudul() {
		return this.Judul_2021;
	}
	
	String getPenyanyi() {
		return this.penyanyi_2021;
	}
	
	int getDurasi() {
		return this.durasi_2021;
	}
	

}

