/**
 * 
 */
package in.thirumal.solid;

import java.util.List;

/**
 * Single Responsibility Principle
 * 
 * Class should have only one job/purpose
 */
public class SingleResponsibility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class BeforeSingleResponsibility  {
	public boolean placeOrder(List<String> items) {
		
		return false;
	}
	
	public void sendNotification() {
		
	}
}

class AfterSingleResponsibility  {
	public boolean placeOrder(List<String> items) {
		
		return false;
	}
	
}

class NotificationService {
	public void sendNotification() {
		
	}
}
