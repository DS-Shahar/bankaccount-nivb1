class Main {
  	static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
     BankAccount acct1 = new BankAccount(1000, -1000,"Bob");
	     BankAccount acct2 = new BankAccount(1000, -1000,"Lisa");
	     
	     System.out.println(acct1.toString());
	     System.out.println(acct2.toString());
	     acct1.transfer(acct2, 500);
	     System.out.println(acct1.toString());
	     System.out.println(acct2.toString());
	     if(acct1.transfer(acct2, 1600)==false)
	    	 System.out.println("cannot transfer, too much money");
	     else {
	    	 System.out.println("transfer completed");
	     }

		System.out.println("enter length and width");
		int length=input.nextInt();
		int width=input.nextInt();
		Rectangle a=new Rectangle(length,width);
		System.out.println("enter length and width");
		int length_2=input.nextInt();
		int width_2=input.nextInt();
		Rectangle b=new Rectangle(length_2,width_2);
		a.draw();
		b.draw();
		a.scale(2);
		System.out.print("area and perimeter of boths rectangles is: ");
		System.out.println(a.calcArea()+a.calcPerimeter()+b.calcArea()+b.calcPerimeter());
		
  }
}
