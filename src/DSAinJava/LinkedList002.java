//Q1 Create an LinkedList Manually 

package DSAinJava;

class Node //This Class Represent the single node in our linkedList
{
	int data;
	Node01 next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
class LinkedList
{
	Node01 head;
	void add(int data) 
	{
		Node01 newNode = new Node01(data);	
	
	
	if(head == null)
	{
		
		head = newNode;
	}else
	{
		Node01 current = head;
		while(current.next!=null) 
		{
			current = current.next;
		}
		current.next = newNode;
	}
	}
	
	 void print()
	{
		Node01 current = head ;
		while(current != null) 
		{
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
}

public class LinkedList002 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.print();



		
	}

}
