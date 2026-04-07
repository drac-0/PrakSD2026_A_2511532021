package pekan2_2511532021;

public class Mahasiswa_2511532021 {
	String nim;
	String nama;
	String prodi;
	
	public Mahasiswa_2511532021(String nim, String nama, String prodi){
		this.nim = nim;
		this.prodi= prodi;
		this.nama = nama;
	}
	@Override
	public String toString() {
		return "NIM: " + nim + ", Nama" + nama + ", Prodi: " + prodi;
	}	
}
