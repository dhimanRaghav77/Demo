
public class SumOfTwoNumber {

	int a,b,c;
	
	
	SumOfTwoNumber(int a, int b)
	{
		this.a=a;
		this.b=b;
		c=this.a+this.b;
	}
	
	public void getSum()
	{
		System.out.println("sum is :- "+ c);
	}
	public static void main(String args[])
	{
		
		SumOfTwoNumber sot= new SumOfTwoNumber(5, 10);
		sot.getSum();
	}
}
