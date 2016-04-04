package com.santanu.chapter1;

import java.util.*;

public class _1_GCDFinder {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b = sc.nextInt();
		
		int res = gcd(a,b);
		System.out.println(res);
	}
	
	static int gcd(int a,int b){
		if(a==0 || b== 0)
			return a+b;
		
		return gcd(b, (a%b));
	}
}
