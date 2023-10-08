package package1;

public class Arithmatic {

	public int sum(int a,int b)
	{
		int c;
		c = a+b;
		return c;
	}
	
	
	public int sub(int x,int y)
	{
		int z;
		z = x-y;
		return z;
		
	}
	
	
	public int multiply(int a1,int a2)
	
	{
	int a3;
    a3= a1*a2;
	return a3;
	}
	
	
public void divide(int a4,int a5)
	{
	int a6;
	a6= a4/a5;
	System.out.println("The finalresult is"+a6);	
	}

public static void main(String[] args) {
	
	Arithmatic ob = new Arithmatic();
	
	int sumres= ob.sum(10, 2);
	int sumres1 = ob.sum(sumres, 2);
	int subres = ob.sub(sumres1, 2);
	int multires = ob.multiply(subres, 2);
	
	
	System.out.println("The sumresult1 is"+sumres);
	System.out.println("The sumresult2 is"+sumres1);
	System.out.println("The subresult is"+subres);
	System.out.println("The multiplyresult is"+multires);
	
	ob.divide(multires, 2);
	
	
}
	
}

