public class Calculator {
	int x,y,z;

	void setValues() {
		x=20;
		y=30;
			}
    void addNum() {
	z=x+y;
}
    void dispaly() {
	System.out.println("The result is "+z);
}
    public static void main(String[] args) {
	Calculator c=new Calculator();
	c.setValues();
	c.addNum();
	c.dispaly();
}
}