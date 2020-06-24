package com.loop.zak;

public class MyNumberpojo {

	private int num;

	public MyNumberpojo(int num) {
		this.num=num;
	}

	public boolean isPrime() {
		if(num<2) {
			return false;
		}
		
		for(int i=2;i<=num-1;i++) {
		if(num%i==0) {
			return false;
		}
		}
		return true;
	}

	public int sumUptoN() {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}

	public void printANumberTraingle() {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
