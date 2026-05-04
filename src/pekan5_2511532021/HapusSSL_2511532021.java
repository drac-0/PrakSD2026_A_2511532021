package pekan5_2511532021;

public class HapusSSL_2511532021 {

	// funtion to delete head node
	public static NodeSSL_2511532021 deleteHead_1009(NodeSSL_2511532021 head_2021) {
		// if SLL is empty
		if (head_2021 == null)
			return null;
		
		// move to the next node
		head_2021 =	head_2021.next_2021;
		
		// return new head
		return head_2021;
	}
	
	// function to delete last node
	public static NodeSSL_2511532021 removeLastNode(NodeSSL_2511532021 head_2021) {
		// if the list is empty, return null value
		if (head_2021 == null) {
			return null;
		}
		
		//if list contains one node, delete node and return null
		if (head_2021.next_2021== null) {
			return null;
		}
		
		// search second last node
		NodeSSL_2511532021 secondLast_1009 = head_2021;
		while (secondLast_1009.next_2021.next_2021 != null) {
			secondLast_1009 = secondLast_1009.next_2021;
		}
		
		// delete last node
		secondLast_1009.next_2021= null;
		return head_2021;
	}
	
	// function to delete node in a certain position
	public static NodeSSL_2511532021 deleteNode_1009(NodeSSL_2511532021 head_2021, int pos_2021) {
		NodeSSL_2511532021 temp_2021 = head_2021;
		NodeSSL_2511532021 prev_2021 = null;
		
		// if linked list is null
		if (temp_2021 == null)
			return head_2021;
		
		// case 1 : head is deleted
		if (pos_2021== 1) {
			head_2021= temp_2021.next_2021;
			return head_2021;
		}
		
		// kasus 2 : menghapus node di tengah
		// search to the targeted node that will to be deleted
		for (int i_2021 = 1; temp_2021!= null && i_2021< pos_2021; i_2021++) {
			prev_2021= temp_2021;
			temp_2021= temp_2021.next_2021;
		}
		// if founded, delete node
		if (temp_2021!= null) {
			prev_2021.next_2021= temp_2021.next_2021;
		} else {
			System.out.println("Data tidak ditemukan");
		}
		return head_2021;		
	}
	
	// function to print SLL
	public static void printList_1009(NodeSSL_2511532021 head_2021) {
		NodeSSL_2511532021 curr_2021 = head_2021;
		while (curr_2021.next_2021!= null) {
			System.out.print(curr_2021.data_2021+ "-->");
			curr_2021= curr_2021.next_2021;
		}
		if (curr_2021.next_2021== null) {
			System.out.print(curr_2021.data_2021);
		}
		System.out.println();
	}
	
	// Driver/Main class
	public static void main(String[] args) {
		// Create SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSSL_2511532021 head_2021 = new NodeSSL_2511532021(1);
		head_2021.next_2021= new NodeSSL_2511532021(2);
		head_2021.next_2021.next_2021 = new NodeSSL_2511532021(3);
		head_2021.next_2021.next_2021.next_2021= new NodeSSL_2511532021(4);
		head_2021.next_2021.next_2021.next_2021.next_2021= new NodeSSL_2511532021(5);
		head_2021.next_2021.next_2021.next_2021.next_2021.next_2021= new NodeSSL_2511532021(6);
		
		// print early list
		System.out.println("list awal : ");
		printList_1009(head_2021);
		
		// delete head
		head_2021 = deleteHead_1009(head_2021);
		System.out.println("List setelah simpul terakhir di hapus : ");
		printList_1009(head_2021);
		
		// deleteing node at pos[2]
		int pos2_2021 = 2;
		head_2021 = deleteNode_1009(head_2021, pos2_2021);
		// print list after deletion
		System.out.println("List setelah posisi 2 dihapus : ");
		printList_1009(head_2021);
	}
}