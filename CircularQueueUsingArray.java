package queue;

public class CircularQueueUsingArray {
	private static int front;
	private static int rear;
	private static int size;
	private static int [] queue=new int[5];
	//methods is queue 1-enqueue 2-dequeue 3-getSize 4-isEmpty 5-show 6-peak
	
	// now the first one is for insert the element 
	
	private static void enqueue(int data) {
	if(size<5) {
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
	}
	else
		System.out.println("queue if full");
		
	}
	
	//for deleting the element of queue
	
	private static void dequeue() {
		
		if(front==0&&rear==0) {
			System.out.println("queue is empty");
		}
		else if(size==0) {
			System.out.println("queue is empty");
		}
		
		else {
			queue[front]=0;
			//data=0;
			front=(front+1)%5;
			size--;
		}
		//return 0;
	}
	
	//for displaying the element of queue
	
	private static void show() {
		
		for(int i=0;i<size;i++) {
			System.out.print(queue[(i+front)%5]+" ");
		}
		System.out.println();
	}
	
	
	//main runner method
	
	public static void main(String[] args) {
		
		enqueue(1);
		enqueue(2);
		enqueue(3);
		System.out.println(size);
		show();
		dequeue();
		dequeue();
		show();
		enqueue(4);
		enqueue(5);
		enqueue(6);
		enqueue(7);
		show();
		dequeue();
		dequeue();
		show();
		enqueue(8);
		enqueue(9);
		dequeue();
		enqueue(10);
		show();
		enqueue(11);
//		
	
		System.out.println(size);
		
		
	}

}
