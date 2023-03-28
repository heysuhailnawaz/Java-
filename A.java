class A
{
void Go(int a)
{
	System.out.println( "class A");
	
}
}
class B extends A{
	void Go(int a, int b)
{
		System.out.println("class B");
		
}
}
class Test2{
	public static void main(String args[]) {
		
			B b=new B();
			b.Go(5);
			b.Go(3,6);
	}       
}	