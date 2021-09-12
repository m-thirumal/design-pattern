/**
 * 
 */
package in.thirumal.creational.singleton;

/**
 * @author Thirumal
 *
 */
public class RuntimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		System.out.println(runtime);
		Runtime anotherRuntime = Runtime.getRuntime();
		System.out.println(anotherRuntime);
		if (runtime == anotherRuntime) {
			System.out.println("Both instance are same");
		}
	}

}
