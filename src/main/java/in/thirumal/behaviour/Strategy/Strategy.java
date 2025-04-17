/**
 * 
 */
package in.thirumal.behaviour.Strategy;

import java.util.List;
import java.util.stream.IntStream;

/**
 * The primary goal of the Strategy pattern is to define a set of algorithms, encapsulate them in their classes,
 *  and make them interchangeable within context objects. 
 *  Through this encapsulation, the Strategy pattern promotes the open/closed principle
 *   — software entities should be open for extension but closed for modification.
 */
public class Strategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var list = IntStream.range(1, 100).boxed().toList();
		Sorter sorter = new Sorter(new BubbleSortStrategy());
		sorter.sort(list);
	}

}

interface SortingStrategy {
	void sort (List<Integer> list);
}

class BubbleSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> list) {
		System.out.println("Bubble sort");
	}
	
}

class QuickSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> list) {
		System.out.println("Quick Sort");
	}
	
}

class Sorter {
	
	SortingStrategy sortingStrategy;

	public Sorter(SortingStrategy sortingStrategy) {
		super();
		this.sortingStrategy = sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}
	
	public void sort(List<Integer> list) {
		sortingStrategy.sort(list);
	}
	
	
}
