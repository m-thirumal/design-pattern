/**
 * 
 */
package in.thirumal.solid;

/**
 * must be able to replace a superclass object with a subclass object without affecting the correctness of the program.
 */
public class Liskov {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Before
abstract class Bird{
	   abstract void fly();
	}

	class Eagle extends Bird {
	   @Override
	   public void fly() { // some implementation }
		   
	   }
	}

	class Ostrich extends Bird {
	   @Override
	   public void fly() { // dummy implementation }
	 
	   }
}
// Above example, Ostrich class forced to extend bird
	

//After
abstract class FlyingBird{
	   abstract void fly();
	}

	abstract class NonFlyingBird{
	   abstract void doSomething();
	}

	class Eagle1 extends FlyingBird {
	   @Override
	   public void fly() { // some implementation 
		   
	   }
	}
	
	class Ostrich1 extends NonFlyingBird {
	   @Override
	   public void doSomething() { // some implementation }
	}
}
