package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
    	
        String output = "oneToTen()\n*** Output ***";
	        for(int x=1; x<=10; x++)
	        {
	        	output += "\n" + x;
	        }
    	return output;
    }

    public String oddNumbers()
    {
        String output = "oddNumbers()\n*** Output ***";
        for(int x=1; x<=20; x+=2)
        {
        	output += "\n" + x;
        } 
    	return output;
    }

    public String squares()
    {    
    	String output = "squares()\n*** Output ***";
        for(int x=1; x<=10; x++)
        {
        	output += "\n" + x*x;
        }
        return output;
    }

    public String random4()
    {
    	
        return ""; // we were told to move on from this question
    }

    public String even(int n)
    {
        String output = String.format("even(%d)\n*** Output ***", n);
        for(int x=2; x<n; x+=2)
        {
    		output += "\n" + x;
    	}
        return output;
    }

    public String powers(int n)
    {
        String output = String.format("powers(%d)\n*** Output ***", n);
    	for(int x=1; x<=n; x++)
    	{
    		output += "\n" + (int) Math.pow(2, x);
    	}
        return output;
    }

}
