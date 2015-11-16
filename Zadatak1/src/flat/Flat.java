package flat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flat {
	
	public static void main(String[] args) {
		
		
		Integer td[][]= {{1}, {2,3}, {4}, {5, 6, 7}};
		List<Integer> singleDimArray = new ArrayList<Integer>();
		for (Integer[] array : td) {         
		      singleDimArray.addAll(Arrays.asList(array));
		}		
		System.out.println(singleDimArray);
		
		
	}
}
