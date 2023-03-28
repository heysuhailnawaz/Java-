class Added{
	static int add(int a, int b)
	
	{
		return a+b;
	}
	
static double add(double a,double b)
{
	return a+b;
}
}
class TestA{
	
	public static void main(String args[]) {
		
		System.out.println(Added.add(2, 3));
		System.out.println(Added.add(2,2));
		
	}
}