package pekan4_2511532021;
import java.util.*;

public class QueueArray_2511532021 {
	int front_2021, rear_2021,size_2021;
	int capacity_2021;
	int array_2021[];
	
	public QueueArray_2511532021 (int capacity){
		this.capacity_2021 = capacity;
		front_2021 = this.size_2021 = 0;
		rear_2021 = capacity -1 ;
		array_2021 = new int[this.capacity_2021];
	}
	
	boolean isFull(QueueArray_2511532021 queue) {
		return (queue.size_2021 == queue.capacity_2021);
	}
	
	boolean isEmpty(QueueArray_2511532021 queue) {
		return(queue.size_2021 == 0);
	}
	
	void enqueue(int item) {
		if (isFull(this)) {
			return;
		}
		
		this.rear_2021 = (this.rear_2021 + 1) % this.capacity_2021;
		this.array_2021[this.rear_2021] = item;
		this.size_2021 = this.size_2021 + 1;
		System.out.println(item + " enqueue to queue");
		
	}
	
	int dequeu() {
		if (isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		
		int item_2021 = this.array_2021[this.front_2021];
		this.front_2021 = (this.front_2021 + 1) % this.capacity_2021;
		this.size_2021 = this.size_2021 -1;
		return item_2021;
	}
	
	int front() {
		if (isEmpty(this)) {
			return Integer.MIN_VALUE; 
		}
		return this.array_2021[this.front_2021];
	}
	
	int rear() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array_2021[this.rear_2021];
	}
	
	void display() {
		int i_2021;
		if (front_2021 == rear_2021) {
			System.out.printf("\nAntrian Kosong\n");
			return ;
		}
		
		for (i_2021 = front_2021; i_2021 < rear_2021; i_2021++) {
			System.out.printf("%d <--", array_2021[i_2021]);
		}
		return;
	}
}
