/**
 * 
 */
package in.thirumal.solid;

/**
 * Open for extension but closed for modification
 */
public class OpenClosed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Before OpenClosed
class AreaCalculator {
	
	public double calculateArea(Shape shape) {
		if (Shape.CIRCLE.equals(shape)) {
			return 0.0; //
		} else if (Shape.RECTANGLE.equals(shape)) {
			return 0.0; //
		} else {
			return 0.0; //
		}
		
	}
}

//After OpenClosed
interface IAreaCalculator {
	double clacluateArea();
}

class Square implements IAreaCalculator {

	@Override
	public double clacluateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Rectangle implements IAreaCalculator {

	@Override
	public double clacluateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

enum Shape {
	CIRCLE, RECTANGLE
}