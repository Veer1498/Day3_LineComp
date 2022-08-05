package lineComp;

import java.util.Scanner;

public class LineComparision {
	public static double length1,length2,length;
	static int x1,y1,x2,y2,value;

	public static void coordinates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Coordinates of Line");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Points Entered for Line");
		System.out.println("The points x1= " +x1);
		System.out.println("The points x2= " +x2);
		System.out.println("The points y1= " +y1);
		System.out.println("The points y2= " +y2);
		length =(int) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}
	
	public static void lineLength() {
		coordinates();
		length1 =length;
		coordinates();
		length2 =length;
		System.out.println(" ");
		System.out.println("The Length of Line1 is :"+length1);
		System.out.println("The Length of Line2 is :"+length2);	
	}
	
	public static void Comparing() {
		
		value = Double.compare(length1,length2);
		if(value == 0)
			System.out.println("The Lines are Equal");
		else if(value >1)
			System.out.println("Line 2 is Greater than Line 2");
		else
			System.out.println("Line 1 is Greater than Line 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("==============================================");
		System.out.println(" ");
		lineLength();
		System.out.println(" ");
		System.out.println(" ");
		Comparing();

	
	}

}
