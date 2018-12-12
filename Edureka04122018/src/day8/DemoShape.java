package day8;

public class DemoShape {

	public static void main(String[] args) {
		Shape circl = new Shape();
		System.out.println(circl.calculateArea(10.5));
		
		Shape sqr = new Shape();
		System.out.println(sqr.calculateArea(10));
		
	   Shape rec = new Shape();
	   System.out.println(rec.calculateArea(10, 5));

	}

}
