package test;

import java.util.Random;

import sources.*;

public class TestUnion {
	
	private static final int N = 100000000;
	public static void main(String args[]){
		Random rdn = new Random();
		

		
		//Quick Union Weighted Path Compression -> N = 1x10E8 (more than 1 minute)
		QuickUnionWeighted quwp = new QuickUnionWeighted(N);
		System.out.println("Quick Union Weighted with Path Compression");
		for(int i = 0; i < N; i++)
			quwp.union(rdn.nextInt(100),rdn.nextInt(100));
		for(int i = 0; i < N; i++)
			System.out.println(".");
		quwp = null;
		
	}
}
