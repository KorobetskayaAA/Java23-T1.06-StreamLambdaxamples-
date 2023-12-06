package ru.teamscore.java23.t1_06.lambdas;

import java.util.function.BinaryOperator;

public class ReturnLambda {
	public static final int ADD = 1;
	public static final int SUB = 2;
	public static final int MUL = 3;
	public static final int DIV = 4;
	
	public static BinaryOperator<Integer> getOperator(int op) {
		return switch(op) {
			case ADD -> (a, b) -> a + b;
			case SUB -> (a, b) -> a - b;
			case MUL -> (a, b) -> a * b;
			case DIV -> (a, b) -> a / b;
		    default -> ((a, b) -> 0);
		};
	}
	
	public static int calculate(int a, int b, int op) {
		var operator = getOperator(op);
		return operator.apply(a, b);
	}
}
