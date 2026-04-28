package pekan4_2511532021;

public class QueueArrayDriver_2511532021 {
	public static void main(String[] args) {
		QueueArray_2511532021 queue_2021 = new QueueArray_2511532021(1000);
		queue_2021.enqueue(10);
		queue_2021.enqueue(20);
		queue_2021.enqueue(30);
		queue_2021.enqueue(40);
		System.out.println("Item di depan " + queue_2021.front());
		System.out.println("Item di depan " + queue_2021.rear());
		System.out.println("Tampilan queueu");
		queue_2021.display();
		System.out.println();
		System.out.println(queue_2021.dequeu() + " dihapus dari queue");
		System.out.println("Item di depan " + queue_2021.front());
		System.out.println("Item di depan " + queue_2021.rear());
		System.out.println("Tampilan queueu");
		queue_2021.display();		
	}	
}