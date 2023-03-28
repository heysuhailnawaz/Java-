class RBIBank{
float getRateOfInterest() {return 0;}
}
class SBI extends Bank{
	float getRateofInterest(){return 8.4f;}
	}
class ICIC extends Bank{
	float getRateofInterest(){return 7.3f;}
	}
class Axis extends Bank{
	float getRateofInterest(){return 9.7f;}
	}
class TestPolymorphism{
	public static void main(String args[]){
		Bank b;
		b=new SBI();
		System.out.println("SBI Rate of Interest"+b.getRateofInterest());
		b=new ICIC();
		System.out.println("ICIC Rate of Interest"+b.getRateofInterest());
		b=new AXIS();
		System.out.println("AXIS Rate of Interest"+b.getRateofInterest());
		
		
	}
}

