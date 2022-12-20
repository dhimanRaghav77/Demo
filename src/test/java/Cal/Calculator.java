package Cal;

public class Calculator {

	int a,b,c;
	
	
	public void sum(int a, int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("sum is :- " + c);
	}
	public void seeValues()
	{
		System.out.println(a+ " "+ b);
	}
	public static void main(String args[])
	{
		
		Calculator sot= new Calculator();
		sot.sum(5, 5);
		sot.seeValues();
	}
}
