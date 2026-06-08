package Pekan9_2511532021;

public class Node_2511532021 {
	int data_2021;
	Node_2511532021 left_2021;
	Node_2511532021 right_2021;
	public Node_2511532021 (int data_2021) {
		this.data_2021 = data_2021;
		left_2021 = null;
		right_2021 = null;
		}

	public void setLeft(Node_2511532021 node_2021) {
		if (left_2021 == null) {
			left_2021 = node_2021;
		}
	}
	
	public void setRight(Node_2511532021 node_2021) {
		if (right_2021 == null) {
			right_2021 = node_2021;
		}
	}
	
	public Node_2511532021 getLeft() {
		return left_2021;
	}
	public Node_2511532021 getRight() {
		return right_2021;
	}
	
	public void setData(int data_2021) {
		this.data_2021 = data_2021;
	}
	
	public int getData() {
		return this.data_2021; 
	}
	
	void printPreorder(Node_2511532021 node_2021) {
		if (node_2021 == null) {
			return ;
			
		}
		System.out.print(node_2021.data_2021 + " ");
		printPreorder(node_2021.left_2021);
		printPreorder(node_2021.right_2021);
	}
	
	void printPostOrder(Node_2511532021 node_2021) {
		if (node_2021 == null) {
			return;
		}
		printPostOrder(node_2021.left_2021);
		printPostOrder(node_2021.right_2021);
		System.out.print(node_2021.data_2021 + " ");
	}
	
	void printInOrder(Node_2511532021 node_2021) {
		if( node_2021 == null) {
			return ;
			
		}
		printInOrder(node_2021.left_2021);
		System.out.print(node_2021.data_2021+ " ");
		printInOrder(node_2021.right_2021);
	}
	
	public String print() {
		return this.print("", true, "");
	}
	
	
	public String print(String prefix_2021, boolean isTail_2021, String sb_2021) {
		if (right_2021 != null) {
			right_2021.print(prefix_2021 +( isTail_2021 ? "|   ": "    "),false, sb_2021);
		}
		System.out.println(prefix_2021+(isTail_2021 ? "\\--" : "/--")+data_2021);
		if (left_2021 != null) {
			left_2021.print(prefix_2021 +(isTail_2021 ? "    ": "|   "),true, sb_2021);
		}
		return sb_2021;
	}
}
