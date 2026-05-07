package pekan5_2511532021;

public class HapusSSL_2511532021 {

	// funtion to delete head node
	public static NodeSSL_2511532021 deleteHead_2021(NodeSSL_2511532021 head_2021) {
		if (head_2021 == null)
			return null;
		
		head_2021 = head_2021.next_2021;
		return head_2021;
	}
	
	// function to delete last node
	public static NodeSSL_2511532021 removeLastNode(NodeSSL_2511532021 head_2021) {
		if (head_2021 == null) {
			return null;
		}
		
		if (head_2021.next_2021 == null) {
			return null;
		}
		
		// search second last node
		NodeSSL_2511532021 secondLast_2021 = head_2021;
		while (secondLast_2021.next_2021.next_2021 != null) {
			secondLast_2021 = secondLast_2021.next_2021;
		}
		
		secondLast_2021.next_2021 = null;
		return head_2021;
	}
	
	// function to delete node in a certain position
	public static NodeSSL_2511532021 deleteNode_2021(NodeSSL_2511532021 head_2021, int pos_2021) {
		NodeSSL_2511532021 temp_2021 = head_2021;
		NodeSSL_2511532021 prev_2021 = null;
		
		if (temp_2021 == null)
			return head_2021;
		
		if (pos_2021 == 1) {
			head_2021 = temp_2021.next_2021;
			return head_2021;
		}
		
		for (int i_2021 = 1; temp_2021 != null && i_2021 < pos_2021; i_2021++) {
			prev_2021 = temp_2021;
			temp_2021 = temp_2021.next_2021;
		}
		if (temp_2021 != null) {
			prev_2021.next_2021 = temp_2021.next_2021;
		} else {
			System.out.println("Data tidak ditemukan");
		}
		return head_2021;		
	}
	
	// function to print SLL
	public static void printList_2021(NodeSSL_2511532021 head_2021) {
		NodeSSL_2511532021 curr_2021 = head_2021;
		while (curr_2021.next_2021 != null) {
			System.out.print(curr_2021.data_2021 + "-->");
			curr_2021 = curr_2021.next_2021;
		}
		if (curr_2021.next_2021 == null) {
			System.out.print(curr_2021.data_2021);
		}
		System.out.println();
	}
	
	// Driver/Main class
	public static void main(String[] args) {
		NodeSSL_2511532021 head_2021 = new NodeSSL_2511532021(1);
		head_2021.next_2021 = new NodeSSL_2511532021(2);
		head_2021.next_2021.next_2021 = new NodeSSL_2511532021(3);
		head_2021.next_2021.next_2021.next_2021 = new NodeSSL_2511532021(4);
		head_2021.next_2021.next_2021.next_2021.next_2021 = new NodeSSL_2511532021(5);
		head_2021.next_2021.next_2021.next_2021.next_2021.next_2021 = new NodeSSL_2511532021(6);
		
		System.out.println("list awal : ");
		printList_2021(head_2021);
		
		head_2021 = deleteHead_2021(head_2021);
		System.out.println("List setelah head di hapus : ");
		printList_2021(head_2021);
		
		int pos2_2021 = 2;
		head_2021 = deleteNode_2021(head_2021, pos2_2021);
		System.out.println("List setelah posisi 2 dihapus : ");
		printList_2021(head_2021);
		
		head_2021 = removeLastNode(head_2021);
		System.out.println("List setelah simpul terakhir di hapus : ");
		printList_2021(head_2021);
	}
}