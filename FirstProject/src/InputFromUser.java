import java.util.Scanner;
public class InputFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		String name ;
		
		System.out.println("enter the name and age"); 
		//Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		name=sc.next();
		
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		
		
	}

}
