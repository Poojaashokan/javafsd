
import java.util.Scanner;
public class Queue {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of queue");
		int size=sc.nextInt();
		int[] Queue=new int[size];
		int front=-1,rear=-1;
		System.out.println("queue operations");
		while(true) {
			System.out.println("enter ur choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:if(rear==size-1) {
				System.out.println("Q is full no more insertions");
				
			}
			else {
				System.out.println("enter element to be inserted");
				int key=sc.nextInt();
				rear++;
				Queue[rear]=key;
				front=0;
				
			}
			break;
			case 2:if((front==-1 && rear==-1)||(front>rear)){
				System.out.println("queue is empty no more deletions");
			}
			else {
				front=front+1;
				
			}
			break;
			case 3:if((front==-1 && rear==-1)||(front>rear)){
				System.out.println("queue is empty");
				
				
			}
			else
			{
				for(int i=front;i<=rear;i++) {
					System.out.println(Queue[i]);
				}
			}
			break;
			case 4:System.exit(0);
			break;
			default:System.out.println("check ur choice");
			break;
			}
		}
		
		
	}

}

