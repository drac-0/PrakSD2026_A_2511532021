package pekan3_2511532021;
import java.util.*;

class Siswa_2511532021{
	String nama_2021;
	int nim_2021;
	public Siswa_2511532021(String nama, int nim) {
		this.nama_2021 = nama;
		this.nim_2021 = nim;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_2021 + ", nama : " + nama_2021;
 
	}
}

public class SiswaStack_2511532021 {
	private ArrayList<Siswa_2511532021> stack;
	
	public SiswaStack_2511532021(){
		stack = new ArrayList<>();
	}
	
	public void push_2021(Siswa_2511532021 mhs) {
		stack.add(mhs);
	}
	
	public Siswa_2511532021 pop_2021() {
		if(!isEmpty_2021()) {
			return stack.remove(stack.size() - 1);			
		}
		return null;
	}
	
	public Siswa_2511532021 peek_2021() {
		if (!isEmpty_2021()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_2021() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2021() {
		for(int i = stack.size() -1 ; i >=0;i-- ) {
			System.out.println(stack.get(i));
		}
	}
	
	public static void main(String[] args) {
		SiswaStack_2511532021 studentstack_2021 = new SiswaStack_2511532021();
		
		Siswa_2511532021 mhs1_2021 = new Siswa_2511532021("Ali", 1);
		Siswa_2511532021 mhs2_2021 = new Siswa_2511532021("Boby", 2);
		Siswa_2511532021 mhs3_2021 = new Siswa_2511532021("Charles", 3);
		
		studentstack_2021.push_2021(mhs1_2021);
		studentstack_2021.push_2021(mhs2_2021);
		studentstack_2021.push_2021(mhs3_2021);
		
		System.out.println("Siswa di dalam stack");
		studentstack_2021.tampilkanSiswa_2021();
		
		System.out.println("Siswa teratas " + studentstack_2021.peek_2021());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentstack_2021.pop_2021());
		studentstack_2021.tampilkanSiswa_2021();
		
	}
	

}
