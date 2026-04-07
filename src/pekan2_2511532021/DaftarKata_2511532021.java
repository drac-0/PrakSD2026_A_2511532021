package pekan2_2511532021;
import java.util.*;

public class DaftarKata_2511532021 {
	private final ArrayList<String> data;
	public DaftarKata_2511532021() {
		this.data = new ArrayList<>(); 
	}
	
	public void tambah_2511532021 (String elemen) {
		data.add(elemen);
	}
	
	public void tambahPada_2511532021(int index, String elemen) {
		data.add(index, elemen);
	}
	
	public void ubahElemen(int index, String nilaBaru) {
		data.set(index, nilaBaru);
	}
	
	public String hapusElemen_2511532021(int index) {
		return data.remove(index);
	}
	
	public void iterasiCetak() {
		for (int i = 0; i < data.size() ; i++) {
			System.out.print(data.get(i) + " ");
		}
	}
	public String get(int index) {
		return data.get(index);
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}
