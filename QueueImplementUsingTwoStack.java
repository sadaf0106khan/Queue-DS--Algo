package queue;

public class QueueImplementUsingTwoStack {
	private static int top1=-1,size=0,top2=-1,count=0;
	
	private static int [] stack1=new int[5];
	private static int [] stack2=new int[5];
	
	private static void enqueue(int data) {
		push1(data);
		size++;
	}
	private static void push1(int data) {
		stack1[++top1]=data;
		count++;
	}
	private static int dequeue() {
		for(int i=0;i<count;i++) {
			push2(pop1());
		}
		int data=pop2();
		for(int i=0;i<count;i++) {
			push1(pop2());
		}
		return data;
	}
	private static void push2(int data) {
		stack2[++top2]=data;
		count++;
	}
	private static int pop1() {
		int data=stack1[top1--];	
		count--;
		return data;
	}
	private static int pop2() {
		int data=stack2[top2--];
		count--;
		
		
		return data;
	}
	private static void show() {
		for(int i=0;i<=top1;i++) {
			System.out.println(stack1[i]);
		}
	}
	
	public static void main(String[] args) {
		enqueue(5);
		enqueue(4);
		enqueue(2);
		dequeue();
		enqueue(6);
		show();
	}

}
