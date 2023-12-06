package ru.teamscore.java23.t1_06.lambdas;

import java.util.stream.Stream;

public class LambdasToFieldsMain {
    static int counter = 0;
    
	public static void main(String[] args) {
		Stream.generate(() -> Math.random())
				.limit(20)
				.forEach(n -> {
					counter++;
					System.out.println(n);
				});
		System.out.println(counter);
	}
}
