package lineComparison;
import java.util.*;
import java.lang.*;
public class LineComparison 
{
	public static void main(String[] args) {
		
		System.out.println("Welcome in Line Comparison");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates for line 1");
		 int x1= sc.nextInt();
		 int y1= sc.nextInt();
		 int x2= sc.nextInt();
		 int y2= sc.nextInt();
		 System.out.println("Enter the coordinates for line 2");
		 int x3= sc.nextInt();
		 int y3= sc.nextInt();
		 int x4= sc.nextInt();
		 int y4= sc.nextInt();
		
		LineComparison line= new LineComparison();
		
		double line1 =line.length( x1, x2, y1, y2);
		double line2 = line.length(x3 , x4 , y3 , y4);
		line.comparision(line1,line2);
	}
	void comparision(double line1,double line2) 
	{	
		
		if(line1==line2){  
			  
            System.out.println("Lines are equal");  
        }  
        else if(line1<line2)  
        {  
            System.out.println("Line2 is greater");  
        } 
        else   
        {  
            System.out.println("Line1 is greater");  
        }
			
	}
	double length(int x1,int x2,int y1 ,int y2) 
	{
		
		double length1 = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println(Math.sqrt(length1));
		return length1;
	}
	

}
	

