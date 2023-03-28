class Calculation{
	
	int z;
	
	public void addition(int x,int y) {
		
		z= x+y;
		System.out.println("The sum of the green numbers"+z);
		
	}
	
	public void Subtraction ( int x, int y){
		
		z= x-y;
		System.out.println("The diffrence between the given numbers"+z);
		
	}
	
	public class My_Calculation extends Calculation{
		public void Multiplcation(int x,int y) {
			
			z= x*y;
			System.out.println("The product of the given number"+z);
			
		}
		
		
		public static void main(String args[]) {
			int a=20,b=10;
			My_Calculation demo= new My_Calculation();
			demo.addition(a, b);
			demo.Subtraction(a,b);
			demo.Multiplcation(a,b);
			
		}
	}
		}