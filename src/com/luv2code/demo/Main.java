package com.luv2code.demo;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookie cookieOne = new Cookie("green");
		Cookie cookieTwo = new Cookie("blue");
		cookieOne.setColor("yellow");
		System.out.println(cookieOne.getColor());
		System.out.println(cookieTwo.getColor());
	}

}
