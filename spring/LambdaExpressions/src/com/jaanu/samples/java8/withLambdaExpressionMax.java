package com.jaanu.samples.java8;

public class withLambdaExpressionMax {
	public static void main(String[] args) {
  MaxInterface maxInterface=(x,y)-> {int max=x>y ? x:y; return max; };
  int max=maxInterface.FindMax(5, 7);
  System.out.println(max);
}
}