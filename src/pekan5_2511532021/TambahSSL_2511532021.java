package pekan5_2511532021;

public class TambahSSL_2511532021 {
	public static NodeSSL_2511532021 insertAtFront_2021(NodeSSL_2511532021 head_2021, int value_2021) {
		NodeSSL_2511532021 new_node_2021 = new NodeSSL_2511532021(value_2021);
		new_node_2021.next_2021 = head_2021;
		return new_node_2021;
	}
	
	// adds node in the end funct
	public static NodeSSL_2511532021 insertAtEnd_2021(NodeSSL_2511532021 head_2021, int value_2021) {
		// create node with a value
		NodeSSL_2511532021 newNode_2021 = new NodeSSL_2511532021(value_2021);
		
		// if list isEmpty, then node becomes head
		if (head_2021 == null) {
			return newNode_2021;
		}
		
		// store head to temp. var.
		NodeSSL_2511532021 last_2021 = head_2021;
		// find to the last node
		while (last_2021.next_2021 != null) {
			last_2021 = last_2021.next_2021;
		}
		
		// change the pointer
		last_2021.next_2021 = newNode_2021;
		return head_2021;
	}

	static NodeSSL_2511532021 getNode_2021(int data_2021) {
		return new NodeSSL_2511532021(data_2021);
	}
	
	static NodeSSL_2511532021 insertPos_2021(NodeSSL_2511532021 headNode_2021, int pos_2021, int val_2021) {
		NodeSSL_2511532021 head_2021 = headNode_2021;
		if (pos_2021 < 1) {
			System.out.println("Invalid position.");
		}
		if (pos_2021 == 1) {
			NodeSSL_2511532021 new_node_2021 = new NodeSSL_2511532021(val_2021);
			new_node_2021.next_2021 = head_2021;
			return new_node_2021;
		} else {
			while (pos_2021-- != 0) {
				if (pos_2021 == 1) {
					NodeSSL_2511532021 newNode_2021 = getNode_2021(val_2021);
					newNode_2021.next_2021 = headNode_2021.next_2021;
					headNode_2021.next_2021 = newNode_2021;
					break;
				}
				headNode_2021 = headNode_2021.next_2021;
			}
			if (pos_2021 != 1)
				System.out.println("Posisi di luar jangkauan");
		}
		return head_2021;
	}

	public static void printList_2021(NodeSSL_2511532021 head_2021) {
		NodeSSL_2511532021 curr_2021 = head_2021;
		while (curr_2021.next_2021 != null) {
			System.out.print(curr_2021.data_2021 + "-->");
			curr_2021 = curr_2021.next_2021;
		}
		if (curr_2021.next_2021 == null) {
			System.out.print(curr_2021.data_2021);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// example linked list 2 -> 3 -> 5 -> 6
		NodeSSL_2511532021 head_2021 = new NodeSSL_2511532021(2);
		head_2021.next_2021 = new NodeSSL_2511532021(3);
		head_2021.next_2021.next_2021 = new NodeSSL_2511532021(5);
		head_2021.next_2021.next_2021.next_2021 = new NodeSSL_2511532021(6);
		
		// print original list
		System.out.print("Senarai berantai awal : ");
		printList_2021(head_2021);
		
		// adds new node to the head
		System.out.print("tambah 1 simpul di depan: ");
		int data_2021 = 1;
		head_2021 = insertAtFront_2021(head_2021, data_2021);
		
		// print updated list
		printList_2021(head_2021);
		
		// adds new node to the end
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_2021 = 7;
		head_2021 = insertAtEnd_2021(head_2021, data2_2021);
		
		// print updated list
		printList_2021(head_2021);
		
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_2021 = 4;
		int pos_2021 = 4;
		head_2021 = insertPos_2021(head_2021, pos_2021, data3_2021);
		
		// print updated list
		printList_2021(head_2021);
	}
}