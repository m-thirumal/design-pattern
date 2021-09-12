/**
 * 
 */
package in.thirumal.creational.singleton;

/**
 * @author thirumal
 *
 */
public class SigletonDesign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SampleSingleton sampleSingleton = SampleSingleton.getInstance();
		
		System.out.println(sampleSingleton);
		
		SampleSingleton anotherSampleSingleton = SampleSingleton.getInstance();
		
		System.out.println(anotherSampleSingleton);
		
		if (sampleSingleton == anotherSampleSingleton) {
			System.out.println("Same Instance => It's Signleton");
		}
		
		///
		System.out.println("==================Lazy Loading===================");
		LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getInstance();
		
		System.out.println(sampleSingleton);
		
		LazyLoadingSingleton anotherlazyLoadingSingleton = LazyLoadingSingleton.getInstance();
		
		System.out.println(anotherSampleSingleton);
		
		if (lazyLoadingSingleton == anotherlazyLoadingSingleton) {
			System.out.println("Same Instance of lazy loading => It's Signleton");
		}
		System.out.println("==================Lazy Loading Thread safety===================");
		LazyLoadingThreadSafetySingleton lazyLoadingThreadSafetySingleton = LazyLoadingThreadSafetySingleton.getInstance();
		
		System.out.println(sampleSingleton);
		
		LazyLoadingThreadSafetySingleton anotherlazyLoadingThreadSafetySingleton = LazyLoadingThreadSafetySingleton.getInstance();
		
		System.out.println(anotherSampleSingleton);
		
		if (lazyLoadingThreadSafetySingleton == anotherlazyLoadingThreadSafetySingleton) {
			System.out.println("Same Instance of lazy loading thread Safety => It's Signleton");
		}
	}

}


class SampleSingleton { //Eagerly loaded 
	
	private static SampleSingleton instance = new SampleSingleton();
	
	private SampleSingleton() {
	}
	
	public static SampleSingleton getInstance() {
		return instance;
	}
}

class LazyLoadingSingleton {
	
	private static LazyLoadingSingleton instance = null;
	
	private LazyLoadingSingleton() {
	}
	
	public static LazyLoadingSingleton getInstance() {
		if (instance == null) {
			instance = new LazyLoadingSingleton();
		}
		return instance;
	}
}

/*
 * Thread Safety Singleton
 */
class LazyLoadingThreadSafetySingleton {
	
	private static volatile LazyLoadingThreadSafetySingleton instance = null;
	
	private LazyLoadingThreadSafetySingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	
	public static LazyLoadingThreadSafetySingleton getInstance() {
		if (instance == null) {
			synchronized(LazyLoadingThreadSafetySingleton.class) {
				if (instance == null) {
					instance = new LazyLoadingThreadSafetySingleton();
				}
			}
		}
		return instance;
	}
}
