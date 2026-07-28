package DSAinJava;

class Node7
{
	int data;
	Node7 left , right;
	public Node7(int data) 
	{
		this.data = data;
	}
}
public class TreeInJava 
{

	public static void main(String[] args)
	{
       Node7 root = new Node7(1);
       root.left = new Node7(2);
       root.right = new Node7(3);
       root.left.left = new Node7(4);
       root.left.right = new Node7(5);
       root.left.right.left = new Node7(6);
       root.right.right = new Node7(7);
       
       System.out.println("Height : "+height(root));
       
	}
	static int height(Node7 root) 
	{
		if(root == null)
		{
			return 0;
		}
		int leftCount = height(root.left);
		int rightCount = height(root.right);
		return Math.max(leftCount, rightCount)+1;
	}
}
