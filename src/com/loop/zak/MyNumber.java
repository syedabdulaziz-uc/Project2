package com.loop.zak;

public class MyNumber {
	
	public static void main(String[] args) {
		MyNumberpojo num=new MyNumberpojo(5);
		boolean isPrime=num.isPrime();
		System.out.println("isPrime"+isPrime);
		int sum=num.sumUptoN();
		System.out.println("sumUptoN"+sum);
		num.printANumberTraingle();
	}

}
