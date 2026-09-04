package OPP;

public class AreaOfRectangle {
	
	int length , width;
	
	AreaOfRectangle()
	{
		length = 10;
		width = 5;
	}
	
	AreaOfRectangle(int length , int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public static void main(String[]args)
	{
		
		AreaOfRectangle R1 = new AreaOfRectangle();
		
		AreaOfRectangle R2 = new AreaOfRectangle(20 , 10);
		
		System.out.println("Rectangle 1 Area : "+ R1.length * R1.width);
		System.out.println("Rectangle 2 Area : "+ R2.length * R2.width);
		
	}

}
