package Pekan9_2511532021;

public class BTree_2511532021 {
	private Node_2511532021 root_2021;
	private Node_2511532021 currentNode_2021;
	public BTree_2511532021() {
		root_2021 = null;
	}
	
	public boolean search(int data_2021) {
		return search(root_2021,data_2021);
	}
	
	private boolean search(Node_2511532021 node_2021, int data_2021) {
		if (node_2021.getData() == data_2021) {
			return true;
			
		}
		if (node_2021.getLeft() != null) {
			if ( search(node_2021.getLeft(), data_2021)) {
				return true;
			}
		}
		if (node_2021.getRight() != null) {
			if ( search(node_2021.getRight(), data_2021)) {
				return true;
			}
		}
		return false;
	}
	
	public void printInOrder() {
		root_2021.printInOrder(root_2021);
	}
	
	public void printPreOrder() {
		root_2021.printPreorder(root_2021);
	}
	
	public void printPostOrder() {
		root_2021.printPostOrder(root_2021);
	}
	
	public Node_2511532021 getRoot() {
		return root_2021;
	}
	
	public boolean isEmpty() {
		return root_2021 == null;
	}
	
	public int countNode() {
		return countNode(root_2021);
	}
	
	private int countNode(Node_2511532021 node_2021) {
		int count_2021 = 1;
		if (node_2021 == null) {
			return 0;
		}
		else {
			count_2021 += countNode(node_2021.getLeft());
			count_2021 += countNode(node_2021.getRight());
			return count_2021;
		}
		
	}
	
	public void print() {
		root_2021.print();
	}
	
	public Node_2511532021 getCurrent() {
		return currentNode_2021;
	}
	
	public void setCurrent(Node_2511532021 node_2021) {
		this.currentNode_2021 = node_2021;
	}
	
	public void setRoot(Node_2511532021 node_2021) {
		this.root_2021 = node_2021;
	}
	
	
	

}
