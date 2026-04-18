package pekan3_2511532021;

public class Website_2511532021 {
	String Nama_2021;
	String URL_2021;
	
	public Website_2511532021(String judul, String Url) {
		this.Nama_2021 = judul;
		this.URL_2021 = Url;
	}
	
	void setNama(String judul) {
		this.Nama_2021 = judul;
	}
	void setURL(String url) {
		this.URL_2021 = url;
	}
	
	String getNama() {
		return this.Nama_2021;
	}

	String getURL() {
		return this.URL_2021;
	}
}
