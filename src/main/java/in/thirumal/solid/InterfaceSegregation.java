/**
 * 
 */
package in.thirumal.solid;

/**
 * According to the interface segregation principle, you should build small, 
 * focused interfaces that do not force the client to implement behavior they do not need.
 */
public class InterfaceSegregation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Before
interface IShapeAreaCalculator {
	  double calculateArea();
	  double calculateVolume();
}

class SquareImpl implements IShapeAreaCalculator{
	  public double calculateArea(){ return 0.0; }
	  public double calculateVolume(){ return 0.0;  }
}

//After
interface IAreaCalculator1 {
    double calculateArea();
}

interface IVolumeCalculator1 {
    double calculateVolume();
}

class Square11 implements IAreaCalculator1 {
    @Override
    public double calculateArea() {  return 0.0; }
}

class Cube1 implements IAreaCalculator1, IVolumeCalculator1 {
    @Override
    public double calculateArea() { return 0.0;}

    @Override
    public double calculateVolume() { return 0.0; }
}
