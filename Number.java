package Primenumber;

import java.util.Scanner;
import java.util.ArrayList;
public class Number {
	public static int primes(int n){
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i=2;i<n;i++) {
			if(isprime(i)) {
				ar.add(i);
			}
		}
		return ar.size()-1;
		
	}
	public static boolean isprime(int n) {
		if(n==1 | n==0) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
			
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int value=primes(n);
		System.out.println(value);
	}

}
