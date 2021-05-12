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
		Double obj1 = new Double(length1);
        Double obj2 = new Double(length2);
		
		if(obj1.equals(obj2)){    
            System.out.println("Lines are equal");  
        }  
        else
        {
        	System.out.println("Lines are not equal");
        }
			
		}
	}

	

