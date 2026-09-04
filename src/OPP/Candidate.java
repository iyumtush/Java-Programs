package OPP;

import java.util.Scanner;

public class Candidate {

	String name; 
	int rollNo;
	int marks;
	
	Candidate(String name , int rollNo , int marks)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void displayInfo()
	{
		System.out.println("Candidate Name :"+this.name+""
				          +"\nCandidate Roll No : " +this.rollNo+""
				          +"\nCandidate Marks : "+this.marks);
	}
	
	void checkResult()
	{
		if(this.marks >= 40)
		{
			System.out.println("\nResult : Passed");
		} else
		{
			System.out.println("\nResult : Failed");
		}
	}
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidate name : ");
		String name = sc.nextLine();
		System.out.println("Enter the candidate rollNo : ");
		int rollNo = sc.nextInt();
		System.out.println("Enter the candidate marks : ");
		int marks = sc.nextInt();
		
		Candidate c1 = new Candidate(name , rollNo , marks);
		Candidate c2 = new Candidate(name , rollNo , marks);

		
		c1.displayInfo();
		c1.checkResult();
	}

}
