package io.zipcoder.microlabs.mastering_loops;
import java.util.*;

public class CarRide {

    public static void main(String[] args)
    {
    	CarRide myCarRide = new CarRide();
    	myCarRide.areWeThereYet();
    }
	
	public void areWeThereYet()
	{
    	Scanner in = new Scanner(System.in);
    	
    	System.out.print("Are we there yet?");
    	String name = in.nextLine();
    	
    	while(!name.equals("Yes!"))
    	{
    		System.out.print("Are we there yet?");
    		name = in.nextLine();
    	}
    	
    	System.out.print("Good!"); 	
    	in.close();      
    }

}
