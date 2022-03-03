
public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
	    long y=x; //implicit casting
	    System.out.println(x+" "+y);
	    
	    x=(int)y; //explicit casting
	    System.out.println(x+" "+y);
	    
	    char ch='A';
	    int cc=ch; //implicit casting
	    System.out.println(cc);
	    ch=(char)cc; //explicit casting
	    System.out.println(ch);

	}

}
