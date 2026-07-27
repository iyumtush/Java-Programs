package DSAinJava;

//Q) Use Floyed's Algorithm to detect and remove the cycle
class Node01
{
	  int data;
	  Node01 next;
	  Node01(int data)
	  {
		  this.data=data;
	  }
}
public class LinkedList003
{
	public static void main(String[] args) 
	{
       Node01 head = new Node01(10);
       head.next=new Node01(20);
       head.next.next=new Node01(30);
       head.next.next.next=new Node01(40);
       head.next.next.next.next=new Node01(50);
       
       head.next.next.next.next= head.next;
       
       boolean hasCycle = detectCycle(head);  
       System.out.println("Is cycle detected : "+hasCycle);
       //print(head);
	}
       static boolean detectCycle(Node01 head)
       {
          Node01 slow = head;
          Node01 fast = head;
          
          while(fast != null && fast.next != null)
          {
        	 slow = slow.next;
        	 fast = fast.next.next;
        	 if(slow == fast)
        	 {
        		 return true;
        	 }
          }
          return false;
       }
       
	
	static void print(Node01 head)
		{
			Node01 current = head;
			while(current.next!=null)
			{
				System.out.println(current.data+" ");
				current = current.next;
			}
		
		}
	}

