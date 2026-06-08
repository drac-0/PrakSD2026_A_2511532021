package Pekan9_2511532021;

public class BTreeDriver_2511532021 {
	public static void main(String[] args) {
		BTree_2511532021 tree_2021 = new BTree_2511532021();
		System.out.print("Jumlah simpul awal pohon : ");
		System.out.println(tree_2021.countNode());
		
		Node_2511532021 root_2021 = new Node_2511532021(1);
		
		tree_2021.setRoot(root_2021);
		
		System.out.println("Jumlah simpul jika hanya ada root ");
		System.out.println(tree_2021.countNode());
		
		Node_2511532021 Node2_2021 = new Node_2511532021(2); 
		Node_2511532021 Node3_2021 = new Node_2511532021(3);
		Node_2511532021 Node4_2021 = new Node_2511532021(4);
		Node_2511532021 Node5_2021 = new Node_2511532021(5);
		Node_2511532021 Node6_2021 = new Node_2511532021(6);
		Node_2511532021 Node7_2021 = new Node_2511532021(7);
		Node_2511532021 Node8_2021 = new Node_2511532021(8);
		Node_2511532021 Node0_2021 = new Node_2511532021(9);
		root_2021.setLeft(Node2_2021);
		Node2_2021.setLeft(Node4_2021);
		Node2_2021.setRight(Node5_2021);
		Node4_2021.setRight(Node8_2021);
		root_2021.setRight(Node3_2021);
		Node3_2021.setLeft(Node6_2021);
		Node3_2021.setRight(Node7_2021);
		Node6_2021.setLeft(Node0_2021);
		
		tree_2021.setCurrent(tree_2021.getRoot());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_2021.getCurrent().getData());
		System.out.println("Jumlah simpul ; setelah simpul 7 ditambahkan");
		System.out.println(tree_2021.countNode());
		System.out.println("inOrder");
		tree_2021.printInOrder();
		System.out.println("\nPreOrder");
		tree_2021.printPreOrder();
		System.out.println("\nPostOrder");
		tree_2021.printPostOrder();
		
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_2021.print();
	}
}