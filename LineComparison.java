package lineComparison;
import java.util.*;
import java.lang.Math;
public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome in Line Comparison");
		
		Scanner sc = new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		double length = 0;
		length = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println(Math.sqrt(length));
	}
}
