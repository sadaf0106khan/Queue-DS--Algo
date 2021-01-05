package queue;


//Queue using the concept of first in first out
public class QueueImplimentatinUsingArray {
	private static int front;
	private static int rear;
	private static int size;
	private static int [] queue=new int[5];
	//methods is queue 1-enqueue 2-dequeue 3-getSize 4-isEmpty 5-show 6-peak
	
	// now the first one is for insert the element 
	
	private static void enqueue(int data) {
		
		
		if(rear<5) {
		queue[rear]=data;
		rear++;
		size++;
		}
		else {
			System.out.println("queue is full");
		}
		
	}
	
	//for deleting the element of queue
	
	private static void dequeue() {
		
		if(front==0&&rear==0) {
			System.out.println("queue is empty");
		}
		else if(front>=rear) {
			System.out.println("queue is empty");
		}
		
		else {
			int data=queue[front];
			front++;
			size--;
		}
		//return 0;
	}
	
	//for displaying the element of queue
	
	private static void show() {
		
		for(int i=0;i<size;i++) {
			System.out.print(queue[i+front]+" ");
		}
		System.out.println();
	}
	
	
	//main runner method
	
	public static void main(String[] args) {
		enqueue(12);
		enqueue(1);
		enqueue(2);
		System.out.println(size);
		show();
		dequeue();
		dequeue();
		show();
		enqueue(107);
		enqueue(12);
		//enqueue(1);
		//enqueue(12);
		show();
		System.out.println(size);
		
	}
}
