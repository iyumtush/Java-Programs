package TushCodes;

public class AreaOfShapesCalculator {

	
	//Area of Rectangle
	double area(double length , double width) {
		return length * width;
	}
	
	double area(double radius) {
		return Math.PI * radius * radius;
		
	}
	
	double area(double base , double height , boolean traingle) {
		return 0.5 * base * height;
	}
	
}

   