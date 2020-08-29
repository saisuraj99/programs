package com.dxc.operation;

public class operation {

	public static void main(String[] args) {
		String name="suraj";
   	    String firstChar=(""+name.charAt(0)).toUpperCase();
   	    String result=firstChar+name.substring(1);
   	    System.out.println("Result :"+result);
	}

}
