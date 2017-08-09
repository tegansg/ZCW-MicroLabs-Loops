package io.zipcoder.microlabs.mastering_loops;
import java.util.Formatter;

public class Shapes {

    public String triangle()
    {
    	String output = "triangle()\n*** Output ***";
    	String i = "";    	
    	for(int x=1; x<=5; x++)
    	{
    		i += "*";
    		output += "\n" + i;
    	}
        return output;
    }

    private String _tableLine(int iteration, int length)
    {
    	int n = iteration * length;
        int i = iteration;
    	
    	String line = "";
        for(int x=i; x<=n; x+=i)
        {
        	line += String.format("| %2d ", x, " ");         	
        }
        line +="|\n";		
    	return line;   
    }
        
    public String tableSquare()
    {
    	Shapes shapes = new Shapes();
    	String output = "tableSquare()\n*** Output ***\nA 4 x 4 table square\n\n```\n";
    	int length = 4;
    	for(int x=1; x<=length; x++)
    	{
    		output += shapes._tableLine(x, length);
    	}
        output += "```";
    	return output;    
    }
    

    public String tableSquares(int length)
    {
    	Shapes shapes = new Shapes();
    	String output = String.format("tableSquares(%d)\n*** Output ***\nA %<d x %<d table square\n\n```\n", length);
    	
    	
    	for(int x=1; x<=length; x++)
    	{
    		output += shapes._tableLine(x, length);
    	}
        output += "```";
        return output;
    }
}

