public class Customer {
  int custId;
  String custName;
  void setData() {
	  custId=1001;
	  custName="Balu";
  }
  void display() {
	  System.out.println("custId :" + custId);
	  System.out.println("custName :" + custName);
  }
  public static void main(String[] args) {
	Customer c = new Customer();
	c.setData();
	c.display();
}

}
