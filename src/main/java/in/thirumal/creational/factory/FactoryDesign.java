/**
 * 
 */
package in.thirumal.creational.factory;

/**
 * 
 */
public class FactoryDesign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Os os = OsFactory.getInstance("open");
		System.out.println(os.displayLatestVersion());
		
	}

}

class OsFactory {
	public static Os getInstance(String type) {
		if ("open".equalsIgnoreCase(type)) {
			return new Ubuntu();
		} else if ("closed".equalsIgnoreCase(type)) {
			return new Mac();
		} else {
			return new Windows();
		}
	}
}

interface Os {
	public String displayLatestVersion();
}

class Ubuntu implements Os {

	@Override
	public String displayLatestVersion() {
		return "24.04";
	}
}

class Windows implements Os {

	@Override
	public String displayLatestVersion() {
		// TODO Auto-generated method stub
		return "11";
	}
	
}

class Mac implements Os {

	@Override
	public String displayLatestVersion() {
		// TODO Auto-generated method stub
		return "13";
	}
	
}