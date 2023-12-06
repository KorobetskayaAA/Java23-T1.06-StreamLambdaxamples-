package pipelineorder;

import java.util.Arrays;

public class PipelineOrderMain {

	public static void main(String[] args) {
	    String[] names = {"Bob", "Alice", "Jack", "Coraline"};
	    var streamNames = Arrays.stream(names)
	            .filter(n -> {
	                System.out.println("filter: " + n);
	                return n.length() <= 4;
	            })
	            .map(n -> {
	                System.out.println("map: " + n);
	                return n.toUpperCase();
	            })
	            .sorted();
	    
	    names = new String[] {"Bob", "Samantha"};
	    streamNames.forEach(x -> {
	                System.out.println("forEach: " + x);
	            })
	            ;
	}

}
