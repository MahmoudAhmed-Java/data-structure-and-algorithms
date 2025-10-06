package com.luv2code.demo;

public class Main {

	public static void printItems(int n) {
		for( int i = 0 ; i < n ; i++) {
			for( int j = 0 ; j < n ; j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printItems(10);
	}

}
