package prolim.phase1.day1.classwork;



class Shape{
	
	int s, length, breadth;
	double r;
	
	public Shape(){};
	
	public Shape(int side){
		s = side;
	}
	
	public Shape(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public Shape(double r) {
		this.r = r;
	}
	
	
	public void areaRectangle() {
		System.out.println("Area of rectangle: "+length*breadth);
	}
	
	public void areaSquare() {
		System.out.println("Area of square: "+s*s);
	}
	
	public void areaCircle() {
		System.out.println("Area of circle: "+Math.PI*r*r);
	}
}


public class Assignment2 {

	public static double area(int a, int b) {
		return 0.5*a*b;
	}
	
	public static double area(double a, double b) {
		return 0.5*a*b;
	}
	
	
	public static void main(String[] args) {
		
		Shape s = new Shape(5);
		s.areaSquare();
		Shape r = new Shape(3,4);
		r.areaRectangle();
		Shape c = new Shape(3.0);
		c.areaCircle();
		
		// part 3
		double areaRhombus = area(2,3);
		double areaTriangle = area(6.0,8.0); //right triangle
		
       System.out.println("Area of Rhombus "+areaRhombus+"| Area of Triangle: "+areaTriangle);
	}

}
