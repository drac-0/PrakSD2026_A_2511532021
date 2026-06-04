package pekan8_2511532021;

public class Lagu_2511532021 {
	String judul ;
	String penyanyi;
	int durasi;
	public Lagu_2511532021(String judul, String penyanyi, int durasi) {
		this.judul = judul ;
		this.durasi = durasi ;
		this.penyanyi = penyanyi;
	}
	
	public String getJudul() {
		return this.judul;
	}
	
	public String getPenyanyi() {
		return this.penyanyi;
	}
	
	public int getDurasi() {
		return this.durasi;
	}
	
	public void setJudul(String judul) {
		this.judul = judul;
	}
	

	public void setPenyanyi(String penyanyi) {
		this.penyanyi = penyanyi;
	}

	public void setDurasi(int durasi) {
		this.durasi = durasi;
	}

}
