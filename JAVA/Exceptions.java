//EXCEPTIONS
package com.hello;
class ListofNumbers{
	  public int[] arr = new int[10];
	  public void writeList()
	{
	  try 
	    {
	       arr[20]= 11;
	}
	catch(NumberFormatException e1){
	        System.out.println("NumberFormatExeption=>" + e1.getMessage());
	}
	catch(IndexOutOfBoundsException e2)
	{
	   System.out.println("Index Out of Bound Exception=>" + e2.getMessage());
	 }
	 }
	}

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ListofNumbers list = new ListofNumbers();
		 list.writeList();

	}

}
