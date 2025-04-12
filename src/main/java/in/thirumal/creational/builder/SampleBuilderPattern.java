/**
 * 
 */
package in.thirumal.creational.builder;

/**
 * @author thirumal
 *
 */
public class SampleBuilderPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setName("iphone").build();
		System.out.println(phone);
	}

}


class Phone {
	String name;
	String os;
	String serialNumber;
	public Phone(String name, String os, String serialNumber) {
		super();
		this.name = name;
		this.os = os;
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", os=" + os + ", serialNumber=" + serialNumber + "]";
	}	
	
}

class PhoneBuilder {
	String name;
	String os;
	String serialNumber;
	/**
	 * @param name the name to set
	 */
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	/**
	 * @param os the os to set
	 */
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public PhoneBuilder setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}	
	
	public Phone build() {
		return new Phone(name, os, serialNumber);
	}
	
}