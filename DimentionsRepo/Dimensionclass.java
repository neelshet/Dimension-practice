package com.pkg.one;
import java.util.ArrayList;
import java.util.*;

public class Dimensionclass {
	int s ;
	
	
		
	public static void main(String[] args) {
		Dimensionclass obj1 = new Dimensionclass();
		Rectangle obj2 = new Rectangle();
		Triangle obj3 = new Triangle();
		int myint1= obj1.Area(10);
		int myint2= obj2.AreaofRectangle(10,20);
		int myint3= obj3.AreaofTriangle(2,5);
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(myint1);
		ilist.add(myint2);
		ilist.add(myint3);
		
		try {
		for (int i=0;i<ilist.size();i++)
			
			
		
					System.out.println("Area of square"+myint1+obj1.s);
					
			
					System.out.println("Area of rectangle"+myint2);
					
		
					System.out.println("Area of triange"+myint3);
					
	
			
		
	    }
		catch (Exception e) {
			System.out.println("Something went wrong...");
		}
		finally{
			System.out.println("Try catch is finished"); 
		
		}
	}
			
		
	public int Area(int s) {
		int Area = s*s;
		return Area;
		
		
			
			
	}
		
	



		
	}


