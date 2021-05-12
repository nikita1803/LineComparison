package lineComparison;
import java.util.*;
import java.lang.*;
public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome in Line Comparison");
		
		Scanner sc = new Scanner(System.in);
		
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		
		double length1 = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println(Math.sqrt(length1));
		
		int x3= sc.nextInt();
		int y3= sc.nextInt();
		int x4= sc.nextInt();
		int y4= sc.nextInt();
		
		
		double length2 = (Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));
		System.out.println(Math.sqrt(length2));
		
		if(Double.compare(length1,length2) == 0){  
			  
            System.out.println("Lines are equal");  
        }  
        else  if(Double.compare(length1,length2) > 0)
        {  
            System.out.println("Line1 is greater than Line2");  
        }  
        else
        {
        	System.out.println("Line2 is greater than Line1");
        }
			
		}
	}

	

