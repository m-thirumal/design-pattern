/**
 * 
 */
package in.thirumal.creational.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class PrototypeDesign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfessionCache.loadProfessionals();
		Professional docter = ProfessionCache.getClonedNewProfessional(1);
		System.out.println(docter);
		//
		Professional docter2 = ProfessionCache.getClonedNewProfessional(1);
		System.out.println("Printing Docter 2 with differnt hash" + docter2);
	}

}


abstract class Professional implements Cloneable{
	Integer id;
	String name;
	
	abstract void print();
	
	public Object cloneMethod() {
		Object clone = null;
		try {
			clone = super.clone(); 
		} catch (CloneNotSupportedException e) {
			System.err.println(e.getMessage());
		}
		return clone;
	}
}

class ProfessionCache {
	
	private static Map<Integer, Professional> professionalMap = new HashMap<>();
	
	public static Professional getClonedNewProfessional(int id) {
		Professional professional = professionalMap.get(id);
		System.out.println("Getting professional " + professional.name);
		return (Professional)professional.cloneMethod() ;
	}
	
	public static void loadProfessionals() {
		System.out.println("loading professionals");
		Docter docter = new Docter();
		docter.id = 1;
		docter.name = "Docter";
		professionalMap.put(docter.id, docter);
		
		//
		Engineer engineer = new Engineer();
		engineer.id = 2;
		engineer.name = "En";
		professionalMap.put(engineer.id, engineer);
	}
}

class Docter extends Professional {

	@Override
	void print() {
		System.out.println("I am doctor");
	}
	
}

class Engineer extends Professional {

	@Override
	void print() {
		System.out.println("I am engineer");
	}
	
}