package eric.karkos;

public class Swap {
	
	public Swap() {
	}
	
	
	public int[] swapElementsInt(int leftIndex, int rightIndex, int[] array) {
		int t = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = t;
		return array;
	}
	
	
	
}
