import java.util.Scanner;
public class fibonacciDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci number");
		int n;
		int a=0,b=1,c=a+b;
		
		
		n=sc.nextInt();
		while(n>0) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
			n--;
			
		}
		System.out.println();
		
		
		
		
		
		
		

	}

}
