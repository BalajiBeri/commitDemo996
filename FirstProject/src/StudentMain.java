class Student{
	int regId;
	void displayregId() {
		System.out.println("The registrationID is"+" "+ regId);
	}
}


public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.regId=1290;
		s.displayregId();
		
	}

}
