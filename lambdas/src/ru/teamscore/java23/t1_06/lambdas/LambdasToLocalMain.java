package ru.teamscore.java23.t1_06.lambdas;

import java.util.stream.Stream;

public class LambdasToLocalMain {
	
	public static Stream<Double> createRandom() {
	    double p = 0.5;
	    p = 0.6;
		return Stream.generate(() -> Math.random())
				.takeWhile(n -> n < p);
	}
    
	public static void main(String[] args) {
		createRandom().forEach(n -> {
					//p = n * p;
					System.out.println(n);
				});
	}
}
