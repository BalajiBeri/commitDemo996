import java.util.Scanner;
public class LeapYearDemo {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		n=sc.nextInt();
		if(n%400==0)
			System.out.println(n+" is a leapyear");
		else if(n%100==0)
			System.out.println(n+" is a century");
		
		else
		    System.out.println(n+" is not a leapYear");
			
		
	}

}
