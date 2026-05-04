package pekan5_2511532021;

public class PencarianSSL_2511532021 {
	static boolean searchKey_2021(NodeSSL_2511532021 head_2021, int key_2021) {
		NodeSSL_2511532021 curr_2021 = head_2021;
		while(curr_2021 != null) {
			if (curr_2021.data_2021 == key_2021) {
				return true;
			}
			curr_2021 = curr_2021.next_2021;
		}
		return false;
	}
	
	
	public static void traversal_2021(NodeSSL_2511532021 head_2021) {
		NodeSSL_2511532021 curr_2021 = head_2021;
		
		while(curr_2021 != null) {
			System.out.print(" " + curr_2021.data_2021);
			curr_2021 = curr_2021.next_2021;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		NodeSSL_2511532021 head_2021 = new NodeSSL_2511532021(14);
		head_2021.next_2021= new NodeSSL_2511532021(21);
		head_2021.next_2021.next_2021 = new NodeSSL_2511532021(13);
		head_2021.next_2021.next_2021.next_2021 = new NodeSSL_2511532021(30);
		head_2021.next_2021.next_2021.next_2021.next_2021 = new NodeSSL_2511532021(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2021(head_2021);
		
		// data that will be searched
		int key_1009 = 30;
		System.out.print("cari data " + key_1009 + " = ");
		if (searchKey_2021(head_2021, key_1009))
			System.out.println("data ditemukan");
		else 
			System.out.println("data tidak ditemukan");
	}
		
}


