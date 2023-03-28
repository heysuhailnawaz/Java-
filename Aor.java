import java.util.Scanner;

class Aor
{
	public static void main(String args[])
	
	{
		int l,b,Aor;
		
		System.out.println("Enter the Value");
		
		Scanner s=new Scanner (System.in);
		
		l= s.nextInt();
		b= s.nextInt();
		
		Aor=l*b;
		
		System.out.println("aor is" + Aor);
	}
}