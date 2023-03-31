package com.hello;
import java.util.*;
public class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> li=new ArrayList<>();
		li.add(1);//Adding
		li.add(2);
		li.add(3);
		li.add(4);
		Iterator<Integer> it=li.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		li.set(1, 10);//REPLACE
		System.out.print("After Replacing : ");
		System.out.print(li);
		

	}

}
